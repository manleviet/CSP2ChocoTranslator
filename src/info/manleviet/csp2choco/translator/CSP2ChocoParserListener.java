package info.manleviet.csp2choco.translator;// Generated from /Users/manleviet/Development/IdeaProjects/Choco/ANTLR/TranslatorCSP2Choco/src/CSP2ChocoParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSP2ChocoParserParser}.
 */
public interface CSP2ChocoParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSP2ChocoParserParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(CSP2ChocoParserParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSP2ChocoParserParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(CSP2ChocoParserParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSP2ChocoParserParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(CSP2ChocoParserParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSP2ChocoParserParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(CSP2ChocoParserParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSP2ChocoParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CSP2ChocoParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSP2ChocoParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CSP2ChocoParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSP2ChocoParserParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(CSP2ChocoParserParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSP2ChocoParserParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(CSP2ChocoParserParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSP2ChocoParserParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(CSP2ChocoParserParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSP2ChocoParserParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(CSP2ChocoParserParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(CSP2ChocoParserParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(CSP2ChocoParserParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(CSP2ChocoParserParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(CSP2ChocoParserParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(CSP2ChocoParserParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(CSP2ChocoParserParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CSP2ChocoParserParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CSP2ChocoParserParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CSP2ChocoParserParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CSP2ChocoParserParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(CSP2ChocoParserParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(CSP2ChocoParserParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(CSP2ChocoParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(CSP2ChocoParserParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Implication}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterImplication(CSP2ChocoParserParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Implication}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitImplication(CSP2ChocoParserParser.ImplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(CSP2ChocoParserParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(CSP2ChocoParserParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(CSP2ChocoParserParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(CSP2ChocoParserParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparation(CSP2ChocoParserParser.ComparationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link CSP2ChocoParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparation(CSP2ChocoParserParser.ComparationContext ctx);
}