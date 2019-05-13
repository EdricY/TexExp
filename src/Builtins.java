import java.util.HashMap;

public class Builtins {

    public static HashMap<String, Decider> DECIDERS = new HashMap<String, Decider>() {{
        put("gt", new Greater());
        put("ge", new GreaterEqual());
        put("lt", new Less());
        put("le", new LessEqual());
        put("eq", new Equal());
        put("ne", new NotEqual());
        put("bet", new Between());
    }};

    public static HashMap<String, Transformer> TRANSFORMS = new HashMap<String, Transformer>() {{
        put("len", new Length());
        put("plus", new Plus());
        put("cat", new Concat());
        put("substr", new Substring());
        put("rep", new Repeat());
        put("repcat", new RepeatNoEndl());
    }};

    public interface Transformer {
        String evaluate(String[] args);
    }

    public interface Decider {
        boolean evaluate(String[] args);
    }

    public static class Greater implements Decider {
        public boolean evaluate(String[] args) {
            return Integer.parseInt(args[0]) > Integer.parseInt(args[1]);
        }
    }

    public static class GreaterEqual implements Decider {
        public boolean evaluate(String[] args) {
            return Integer.parseInt(args[0]) >= Integer.parseInt(args[1]);
        }
    }

    public static class Less implements Decider {
        public boolean evaluate(String[] args) {
            return Integer.parseInt(args[0]) < Integer.parseInt(args[1]);
        }
    }

    public static class LessEqual implements Decider {
        public boolean evaluate(String[] args) {
            return Integer.parseInt(args[0]) <= Integer.parseInt(args[1]);
        }
    }

    public static class Equal implements Decider {
        public boolean evaluate(String[] args) {
            return args[0].equals(args[1]);
        }
    }

    public static class NotEqual implements Decider {
        public boolean evaluate(String[] args) {
            return Integer.parseInt(args[0]) != Integer.parseInt(args[1]);
        }
    }

    public static class Between implements Decider {
        public boolean evaluate(String[] args) {
            return Integer.parseInt(args[0]) >= Integer.parseInt(args[1]) &&
                   Integer.parseInt(args[0]) <= Integer.parseInt(args[2]);
        }
    }

    public static class Length implements Transformer {
        public String evaluate(String[] args) {
            return Integer.toString(args[0].length());
        }
    }

    public static class Plus implements Transformer {
        public String evaluate(String[] args) {
            int val = Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
            return Integer.toString(val);
        }
    }

    public static class Concat implements Transformer {
        public String evaluate(String[] args) {
            StringBuilder builder = new StringBuilder();
            for(String s : args) {
                builder.append(s);
            }
            return builder.toString();
        }
    }

    public static class Substring implements Transformer {
        public String evaluate(String[] args) {
            int pos = Integer.parseInt(args[1]);
            if (args.length > 2) {
                int pos2 = Integer.parseInt(args[2]);
                if (pos2 > args[0].length()) pos2 = args[0].length();
                return args[0].substring(pos, pos2);
            }

            if (pos >= args[0].length()) {
                return "";
            }
            return args[0].substring(pos);
        }
    }

    public static class RepeatNoEndl implements Transformer {
        public String evaluate(String[] args) {
            int times = 2;
            if (args.length > 1) {
                times = Integer.parseInt(args[1]);
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < times; i++) {
                builder.append(args[0]);
            }
            return builder.toString();
        }
    }

    public static class Repeat implements Transformer {
        public String evaluate(String[] args) {
            int times = 2;
            if (args.length > 1) {
                times = Integer.parseInt(args[1]);
            }
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < times; i++) {
                builder.append(args[0]);
                if (i < times - 1) builder.append('\n');
            }
            return builder.toString();
        }
    }

}
