import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Hashtable;

public class TexExpTranslator extends TexExpBaseListener {
    CommonTokenStream tokens;
    Hashtable<String, String> blocks;
    Hashtable<String, String[]> arrays;
    String baseTemplate;
    String subBaseTemplate;
    ArrayList<IterTemplate> iterTemplates;
    ArrayList<IterTemplate> subIterTemplates;
    String output;

    int iterLevel; //current number of @s

    public TexExpTranslator(CommonTokenStream tokens) {
        this.tokens = tokens;
        blocks = new Hashtable<>();
        arrays = new Hashtable<>();
        iterTemplates = new ArrayList<>();
        subIterTemplates = new ArrayList<>();
        baseTemplate = "";
        subBaseTemplate = "";
        iterLevel = 0;
        output = "";
    }

    public String getOutput() {
        return output;
    }

    @Override
    public void exitBlockVar(TexExpParser.BlockVarContext ctx) {
        String block = ctx.getText();
        int i = 0;
        int start = 0;
        int end = 0;
        while (i < block.length()) {
            if (block.charAt(i) == '[') {
                start = i + 1;
            } else if (block.charAt(i) == ']') {
                end = i;
                break;
            }
            i++;
        }
        String key = block.substring(start, end);
        block = block.substring(end + 2);
        block = block.replaceAll("\n\n$", "");

        blocks.put(key, block);
    }

    @Override
    public void exitInlineVar(TexExpParser.InlineVarContext ctx) {
        String name = ctx.inlineDec().ID().getText();

        InlineBodyListener inlineBodyListener = new InlineBodyListener();
        ctx.inlineBody().exitRule(inlineBodyListener);

        if (inlineBodyListener.isArray()) {
            arrays.put(name, inlineBodyListener.getValues());
        } else {
            blocks.put(name, inlineBodyListener.getValue());
        }
    }

    @Override
    public void exitProg(TexExpParser.ProgContext ctx) {
        TemplateListener templateListener = new TemplateListener();
        ctx.template().exitRule(templateListener);

        if (iterLevel == 0) {
            output = baseTemplate + "\n";
            return;
        } else {
            int subAmt = iterTemplates.get(0).amount;

            for (int i = 0; i < iterTemplates.size(); i++) {
                IterTemplate it = iterTemplates.get(i);
                if (it.amount != subAmt) {
                    it.invalidate();
                }

                output += it.getOutput(baseTemplate);
            }
//            System.out.println(output);
        }
    }

    //only used for base template (not templates in subtemplates)
    class TemplateListener extends TexExpBaseListener {

        @Override
        public void exitTemplate(TexExpParser.TemplateContext ctx) {
            for (TexExpParser.TemplateElementContext templateElement : ctx.templateElement()) {
                handleTemplateElement(templateElement);
            }
        }

        public void handleTemplateElement(TexExpParser.TemplateElementContext ctx) {
            TexExpParser.EntityContext entity = ctx.entity();
            if (entity != null) {
                EntityListener entityListener = new EntityListener();
                entity.exitRule(entityListener);
                baseTemplate += entityListener.getValue();
                return;
            }

            TexExpParser.SubtemplateContext subtemplate = ctx.subtemplate();
            if (subtemplate != null) {
                SubtemplateListener subtemplateListener = new SubtemplateListener();
                subtemplate.exitRule(subtemplateListener);
                return;
            }

            //otherwise, must be newline
            baseTemplate += "\n";
        }
    }

    class SubtemplateListener extends TexExpBaseListener {
        @Override
        public void exitSubtemplate(TexExpParser.SubtemplateContext ctx) {
            for (TexExpParser.TemplateElementContext templateElement : ctx.template().templateElement()) {
                String text = templateElement.getText();

                if (text.equals("\n")) {
                    subBaseTemplate += "\n";
                    continue;
                }

                TexExpParser.EntityContext entity = templateElement.entity();
                if (entity != null) {
                    SubEntityListener subEntityListener = new SubEntityListener();
                    entity.exitRule(subEntityListener);
                    subBaseTemplate += subEntityListener.getValue();
                }
            }

            ctx.iterRef().forEach(ref -> ref.exitRule(new IterRefSubtemplateListener(subBaseTemplate)));

            for (int i = 0; i < subIterTemplates.size(); i++) {
                setupIterTemplate(i,
                        baseTemplate.length(),
                        subIterTemplates.get(i).getOutput(subBaseTemplate),
                        false);
            }

            subBaseTemplate = "";
            subIterTemplates = new ArrayList<>();
        }
    }

    class IterRefSubtemplateListener extends TexExpBaseListener {
        // only allows deciders
        String subBaseTemplate;

        public IterRefSubtemplateListener(String subtemplateBaseTemplate) {
            subBaseTemplate = subtemplateBaseTemplate;
        }

        @Override
        public void exitIterRef(TexExpParser.IterRefContext ctx) {
            String iterSymbol = ctx.iterSymbol().getText();
            if (iterSymbol.length() > 1) throw new RuntimeException("multi-@ not implemented!");
            iterLevel = iterSymbol.length();

            TexExpParser.MethodCallContext methodCall = ctx.methodCall();

            String key = ctx.ID().getText();
            String[] arr = getIterVar(key);

            for (int i = 0; i < arr.length; i++) {
                String str = arr[i];
                boolean invalid = false;

                if (methodCall != null) { //do methodCall
                    String methodName = methodCall.ID().getText();

                    ArgListExtractor argListExtractor = new ArgListExtractor(i, str);
                    methodCall.exitRule(argListExtractor);
                    String[] methodArgs = argListExtractor.getArgs();

                    Builtins.Decider decider = Builtins.DECIDERS.get(methodName);
                    Builtins.Transformer transform = Builtins.TRANSFORMS.get(methodName);
                    if (decider != null) {
                        if (!decider.evaluate(methodArgs)) {
                            invalid = true;
                        }
                    } else if (transform != null) {
                        throw new RuntimeException("transformer methods not allowed in subtemplate declarations");
                    } else {
                        throw new RuntimeException("builtin not found:" + methodName);
                    }
                }

                IterTemplate it;
                if (i >= subIterTemplates.size()) {
                    it = new IterTemplate();
                    subIterTemplates.add(it);
                } else {
                    it = subIterTemplates.get(i);
                }
                if (invalid) {
                    it.invalidate();
                }
            }
        }

    }

    class SubEntityListener extends TexExpBaseListener {
        private String value;

        public SubEntityListener() {
            value = null;
        }

        @Override
        public void exitEntity(TexExpParser.EntityContext ctx) {
            TexExpParser.StringContext s = ctx.string();
            if (s != null) {
                value = s.getText();
                return;
            }

            TexExpParser.RefContext ref = ctx.ref();
            TexExpParser.VarRefContext varRef = ref.varRef();
            if (varRef != null) {
                String key = varRef.decVarRef().ID().getText();
                value = getVar(key);
                TexExpParser.MethodCallContext methodCall = varRef.methodCall();
                if (methodCall != null) {
                    value = evaluateVarRefMethod(methodCall, value);
                }
                return;
            }

            value = ""; //must be an iterRef
            TexExpParser.IterRefContext iterRef = ref.iterRef();
            SubIterRefSpawnerListener spawner = new SubIterRefSpawnerListener();
            iterRef.exitRule(spawner);
        }

        public String getValue() {
            return value;
        }
    }

    class EntityListener extends TexExpBaseListener {
        //entity -- either string, $refVar, or @iterVar
        // looks up $refVars
        // spawns IterTemplates on @iterVars

        private String value;

        public EntityListener() {
            value = null;
        }

        @Override
        public void exitEntity(TexExpParser.EntityContext ctx) {
            TexExpParser.StringContext s = ctx.string();
            if (s != null) {
                value = s.getText();
                return;
            }

            TexExpParser.RefContext ref = ctx.ref();
            TexExpParser.VarRefContext varRef = ref.varRef();
            if (varRef != null) {
                String key = varRef.decVarRef().ID().getText();
                value = getVar(key);
                TexExpParser.MethodCallContext methodCall = varRef.methodCall();
                if (methodCall != null) {
                    value = evaluateVarRefMethod(methodCall, value);
                }
                return;
            }

            value = ""; //must be an iterRef
            TexExpParser.IterRefContext iterRef = ref.iterRef();
            IterRefSpawnerListener spawner = new IterRefSpawnerListener();
            iterRef.exitRule(spawner);
        }

        public String getValue() {
            return value;
        }
    }

    class SubIterRefSpawnerListener extends TexExpBaseListener {
        @Override
        public void exitIterRef(TexExpParser.IterRefContext ctx) {
            String iterSymbol = ctx.iterSymbol().getText();
            if (iterSymbol.length() > 1) throw new RuntimeException("multi-@ not implemented!");
            iterLevel = iterSymbol.length();

            TexExpParser.MethodCallContext methodCall = ctx.methodCall();

            String key = ctx.ID().getText();
            String[] arr = getIterVar(key);
            int position = subBaseTemplate.length();

            for (int i = 0; i < arr.length; i++) {
                String str = arr[i];

                if (methodCall != null) { //do methodCall
                    String methodName = methodCall.ID().getText();

                    ArgListExtractor argListExtractor = new ArgListExtractor(i, str);
                    methodCall.exitRule(argListExtractor);
                    String[] methodArgs = argListExtractor.getArgs();

                    Builtins.Decider decider = Builtins.DECIDERS.get(methodName);
                    Builtins.Transformer transform = Builtins.TRANSFORMS.get(methodName);
                    if (decider != null) {
                        throw new RuntimeException("deciders not allowed in subtemplate output");
                    } else if (transform != null) {
                        str = transform.evaluate(methodArgs);
                    } else {
                        throw new RuntimeException("builtin not found:" + methodName);
                    }
                }

                IterTemplate it;
                if (i >= subIterTemplates.size()) {
                    it = new IterTemplate();
                    subIterTemplates.add(it);
                } else {
                    it = subIterTemplates.get(i);
                }
                it.addValue(position, str);
            }
        }
    }

    class IterRefSpawnerListener extends TexExpBaseListener {

        @Override
        public void exitIterRef(TexExpParser.IterRefContext ctx) {
            String iterSymbol = ctx.iterSymbol().getText();
            if (iterSymbol.length() > 1) throw new RuntimeException("multi-@ not implemented!");
            iterLevel = iterSymbol.length();

            TexExpParser.MethodCallContext methodCall = ctx.methodCall();

            String key = ctx.ID().getText();
            String[] arr = getIterVar(key);
            int position = baseTemplate.length();

            for (int i = 0; i < arr.length; i++) {
                String str = arr[i];
                boolean invalid = false;

                if (methodCall != null) { //do methodCall
                    String methodName = methodCall.ID().getText();

                    ArgListExtractor argListExtractor = new ArgListExtractor(i, str);
                    methodCall.exitRule(argListExtractor);
                    String[] methodArgs = argListExtractor.getArgs();

                    Builtins.Decider decider = Builtins.DECIDERS.get(methodName);
                    Builtins.Transformer transform = Builtins.TRANSFORMS.get(methodName);
                    if (decider != null) {
                        if (!decider.evaluate(methodArgs)) {
                            invalid = true;
                        }
                    } else if (transform != null) {
                        str = transform.evaluate(methodArgs);
                    } else {
                        throw new RuntimeException("builtin not found:" + methodName);
                    }
                }

                setupIterTemplate(i, position, str, invalid);
            }
        }
    }

    class ArgListExtractor extends TexExpBaseListener {
        private ArrayList<String> args;
        private int index;
        private String firstArg;

        public ArgListExtractor(int index, String firstArg) {
            this.index = index;
            this.args = new ArrayList<String>();
            this.firstArg = firstArg;
        }

        @Override
        public void exitMethodCall(TexExpParser.MethodCallContext ctx) {
            args.add(firstArg);

            if (ctx.argList() != null) {
                gatherArgs(ctx.argList());
            }
        }

        private void gatherArgs(TexExpParser.ArgListContext argList) {
            TexExpParser.EntityContext entity = argList.entity();

            args.add(getStringFromEntity(entity, this.index));

            TexExpParser.ArgListContext childArgList = argList.argList();
            if (childArgList != null) {
                gatherArgs(childArgList);
            }
        }

        public String[] getArgs() {
            return args.toArray(new String[args.size()]);
        }
    }

    class IterRefIndexingListener extends TexExpBaseListener {
        //ignores deciders, takes an index and gets a value from array or transformed value from array
        private int index;
        private String value;

        public IterRefIndexingListener(int index) {
            this.index = index;
        }

        @Override
        public void exitIterRef(TexExpParser.IterRefContext ctx) {
            String iterSymbol = ctx.iterSymbol().getText();
            if (iterSymbol.length() > 1) throw new RuntimeException("multi-@ not implemented!");
            iterLevel = iterSymbol.length();

            String key = ctx.ID().getText();
            String[] arr = getIterVar(key);

            this.value = arr[this.index];


            TexExpParser.MethodCallContext methodCall = ctx.methodCall();
            if (methodCall != null) { //do methodCall
                String methodName = methodCall.ID().getText();

                ArgListExtractor argListExtractor = new ArgListExtractor(this.index, this.value);
                methodCall.exitRule(argListExtractor);
                String[] methodArgs = argListExtractor.getArgs();

                Builtins.Transformer transform = Builtins.TRANSFORMS.get(methodName);
                if (transform != null) {
                    value = transform.evaluate(methodArgs);
                } else {
                    Builtins.Decider decider = Builtins.DECIDERS.get(methodName);
                    if (decider != null) {
                        throw new RuntimeException("deciders not allowed in arglist:" + methodName);
                    } else {
                        throw new RuntimeException("builtin not found:" + methodName);
                    }
                }
            }
        }

        public String getValue() {
            return value;
        }
    }

    class DecEntityListener extends TexExpBaseListener {
        // declarative entity -- either string or $variable to be looked up
        private String value;

        public DecEntityListener() {
            value = null;
        }

        @Override
        public void exitDecEntity(TexExpParser.DecEntityContext ctx) {
            TexExpParser.StringContext s = ctx.string();
            if (s != null) {
                value = s.getText();
                return;
            }
            TexExpParser.DecVarRefContext decVarRef = ctx.decVarRef();
            if (decVarRef != null) {
                String key = decVarRef.ID().getText();
                value = getVar(key);
            }
        }

        public String getValue() {
            return value;
        }
    }

    class InlineBodyListener extends TexExpBaseListener {
        // Body (RHS) of inline variable -- either decEntity or array of decEntities
        private String[] values;
        private String value;

        public InlineBodyListener() {
            values = null;
            value = null;
        }

        @Override
        public void exitInlineBody(TexExpParser.InlineBodyContext ctx) {
            TexExpParser.DecEntityContext decEntity = ctx.decEntity();
            if (decEntity != null) {
                DecEntityListener decEntityListener = new DecEntityListener();
                decEntity.exitRule(decEntityListener);
                value = decEntityListener.getValue();
                return;
            }

            TexExpParser.ArrayDecContext arrayDec = ctx.arrayDec();
            if (arrayDec != null) {
                String innerText = arrayDec.decEntList().getText();
                values = innerText.split(",");
                for (int i = 0; i < values.length; i++) {
                    values[i] = values[i].trim();
                    if (values[i].charAt(0) == '$') {
                        String key = values[i].substring(1);
                        values[i] = getVar(key);
                    }
                }
            }
        }

        public String getValue() {
            return value;
        }

        public String[] getValues() {
            return values;
        }

        public boolean isArray() {
            return values != null;
        }
    }

    public String getStringFromEntity(TexExpParser.EntityContext ctx, int index) {
        String value;
        TexExpParser.StringContext s = ctx.string();
        if (s != null) {
            value = s.getText();
            return value;
        }

        TexExpParser.RefContext ref = ctx.ref();
        TexExpParser.VarRefContext varRef = ref.varRef();
        if (varRef != null) {
            String key = varRef.decVarRef().ID().getText();
            value = getVar(key);
            TexExpParser.MethodCallContext methodCall = varRef.methodCall();
            if (methodCall != null) {
                value = evaluateVarRefMethod(methodCall, value);
            }
            return value;
        }

        TexExpParser.IterRefContext iterRef = ref.iterRef();
        IterRefIndexingListener iril = new IterRefIndexingListener(index);
        iterRef.exitRule(iril);
        value = iril.getValue();
        return value;
    }

    public String evaluateVarRefMethod(TexExpParser.MethodCallContext methodCall, String var) {
        String methodName = methodCall.ID().getText();

        //TODO: handle iterRefs in args instead of hardcoding index
        ArgListExtractor argListExtractor = new ArgListExtractor(0, var);
        methodCall.exitRule(argListExtractor);
        String[] methodArgs = argListExtractor.getArgs();

        Builtins.Transformer transform = Builtins.TRANSFORMS.get(methodName);
        if (transform != null) {
            return transform.evaluate(methodArgs);
        } else {
            Builtins.Decider decider = Builtins.DECIDERS.get(methodName);
            if (decider != null) {
                throw new RuntimeException("deciders not allowed on $ variable references: " + var);
            } else {
                throw new RuntimeException("builtin not found:" + methodName);
            }
        }
    }

    public String getVar(String name) {
        String val = blocks.get(name);
        if (val == null) throw new RuntimeException("Null Variable: " + name);
        return val;
    }

    public String[] getIterVar(String name) {
        String[] val = arrays.get(name);
        if (val == null) throw new RuntimeException("Null Array Variable: " + name);
        return val;
    }

    public void setupIterTemplate(int index, int position, String str, boolean invalid) {
        IterTemplate it;
        if (index >= iterTemplates.size()) {
            it = new IterTemplate();
            iterTemplates.add(it);
        } else {
            it = iterTemplates.get(index);
        }
        it.addValue(position, str);

        if (invalid) it.invalidate();
    }

    public static void main(String[] args) throws Exception {
        String output = translate("var=it>>> $var works!");
        System.out.println(output);
    }

    public static String translateFromFile(String filename) throws Exception{
        FileInputStream inputstream = new FileInputStream(filename);
        ANTLRInputStream input = new ANTLRInputStream(inputstream);
        TexExpLexer lexer = new TexExpLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TexExpParser parser = new TexExpParser(tokens);

        TexExpTranslator translator = new TexExpTranslator(tokens);
        parser.addParseListener(translator);
        parser.prog();
        return translator.getOutput();

    }

    public static String translate(String input) throws Exception {
        try {
            CharStream stream = CharStreams.fromString(input);
            TexExpLexer lexer = new TexExpLexer(stream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            TexExpParser parser = new TexExpParser(tokens);

            TexExpTranslator translator = new TexExpTranslator(tokens);
            parser.addParseListener(translator);
            parser.prog();
            return translator.getOutput();
        } catch (Exception e) {
            return e.toString();
        }
    }
}