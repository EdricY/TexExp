// Generated from /home/CS/users/abell/.linux/Documents/TexExp/TexExp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TexExpParser}.
 */
public interface TexExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TexExpParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(TexExpParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(TexExpParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(TexExpParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(TexExpParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TexExpParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TexExpParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#inlineVar}.
	 * @param ctx the parse tree
	 */
	void enterInlineVar(TexExpParser.InlineVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#inlineVar}.
	 * @param ctx the parse tree
	 */
	void exitInlineVar(TexExpParser.InlineVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#inlineDec}.
	 * @param ctx the parse tree
	 */
	void enterInlineDec(TexExpParser.InlineDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#inlineDec}.
	 * @param ctx the parse tree
	 */
	void exitInlineDec(TexExpParser.InlineDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#inlineBody}.
	 * @param ctx the parse tree
	 */
	void enterInlineBody(TexExpParser.InlineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#inlineBody}.
	 * @param ctx the parse tree
	 */
	void exitInlineBody(TexExpParser.InlineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void enterArrayDec(TexExpParser.ArrayDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#arrayDec}.
	 * @param ctx the parse tree
	 */
	void exitArrayDec(TexExpParser.ArrayDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#decEntList}.
	 * @param ctx the parse tree
	 */
	void enterDecEntList(TexExpParser.DecEntListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#decEntList}.
	 * @param ctx the parse tree
	 */
	void exitDecEntList(TexExpParser.DecEntListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#decEntity}.
	 * @param ctx the parse tree
	 */
	void enterDecEntity(TexExpParser.DecEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#decEntity}.
	 * @param ctx the parse tree
	 */
	void exitDecEntity(TexExpParser.DecEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(TexExpParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(TexExpParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#blockVar}.
	 * @param ctx the parse tree
	 */
	void enterBlockVar(TexExpParser.BlockVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#blockVar}.
	 * @param ctx the parse tree
	 */
	void exitBlockVar(TexExpParser.BlockVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#decVarRef}.
	 * @param ctx the parse tree
	 */
	void enterDecVarRef(TexExpParser.DecVarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#decVarRef}.
	 * @param ctx the parse tree
	 */
	void exitDecVarRef(TexExpParser.DecVarRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#varRef}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(TexExpParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#varRef}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(TexExpParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#iterRef}.
	 * @param ctx the parse tree
	 */
	void enterIterRef(TexExpParser.IterRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#iterRef}.
	 * @param ctx the parse tree
	 */
	void exitIterRef(TexExpParser.IterRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#iterSymbol}.
	 * @param ctx the parse tree
	 */
	void enterIterSymbol(TexExpParser.IterSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#iterSymbol}.
	 * @param ctx the parse tree
	 */
	void exitIterSymbol(TexExpParser.IterSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(TexExpParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(TexExpParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(TexExpParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(TexExpParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(TexExpParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(TexExpParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#templateElement}.
	 * @param ctx the parse tree
	 */
	void enterTemplateElement(TexExpParser.TemplateElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#templateElement}.
	 * @param ctx the parse tree
	 */
	void exitTemplateElement(TexExpParser.TemplateElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#ref}.
	 * @param ctx the parse tree
	 */
	void enterRef(TexExpParser.RefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#ref}.
	 * @param ctx the parse tree
	 */
	void exitRef(TexExpParser.RefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#subtemplate}.
	 * @param ctx the parse tree
	 */
	void enterSubtemplate(TexExpParser.SubtemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#subtemplate}.
	 * @param ctx the parse tree
	 */
	void exitSubtemplate(TexExpParser.SubtemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(TexExpParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(TexExpParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#legalSymbol}.
	 * @param ctx the parse tree
	 */
	void enterLegalSymbol(TexExpParser.LegalSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#legalSymbol}.
	 * @param ctx the parse tree
	 */
	void exitLegalSymbol(TexExpParser.LegalSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TexExpParser#wsOrEndl}.
	 * @param ctx the parse tree
	 */
	void enterWsOrEndl(TexExpParser.WsOrEndlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TexExpParser#wsOrEndl}.
	 * @param ctx the parse tree
	 */
	void exitWsOrEndl(TexExpParser.WsOrEndlContext ctx);
}