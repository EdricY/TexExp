// Generated from /home/CS/users/abell/.linux/Documents/TexExp/TexExp.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TexExpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TexExpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TexExpParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(TexExpParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(TexExpParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TexExpParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#inlineVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineVar(TexExpParser.InlineVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#inlineDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineDec(TexExpParser.InlineDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#inlineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineBody(TexExpParser.InlineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#arrayDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDec(TexExpParser.ArrayDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#decEntList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecEntList(TexExpParser.DecEntListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#decEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecEntity(TexExpParser.DecEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#entity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity(TexExpParser.EntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#blockVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockVar(TexExpParser.BlockVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#decVarRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecVarRef(TexExpParser.DecVarRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#varRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(TexExpParser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#iterRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterRef(TexExpParser.IterRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#iterSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterSymbol(TexExpParser.IterSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(TexExpParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(TexExpParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(TexExpParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#templateElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateElement(TexExpParser.TemplateElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef(TexExpParser.RefContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#subtemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtemplate(TexExpParser.SubtemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(TexExpParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#legalSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegalSymbol(TexExpParser.LegalSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TexExpParser#wsOrEndl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWsOrEndl(TexExpParser.WsOrEndlContext ctx);
}