package info.manleviet.csp2choco.translator;// Generated from /Users/manleviet/Development/IdeaProjects/Choco/ANTLR/TranslatorCSP2Choco/src/CSP2ChocoParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CSP2ChocoParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CSP2ChocoParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CSP2ChocoParserParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(CSP2ChocoParserParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSP2ChocoParserParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(CSP2ChocoParserParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSP2ChocoParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CSP2ChocoParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSP2ChocoParserParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(CSP2ChocoParserParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link CSP2ChocoParserParser#requirement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirement(CSP2ChocoParserParser.RequirementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(CSP2ChocoParserParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CSP2ChocoParserParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(CSP2ChocoParserParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CSP2ChocoParserParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CSP2ChocoParserParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(CSP2ChocoParserParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CSP2ChocoParserParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Implication}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication(CSP2ChocoParserParser.ImplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(CSP2ChocoParserParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CSP2ChocoParserParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparation(CSP2ChocoParserParser.ComparationContext ctx);
}