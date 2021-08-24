/*
 * CSP2ChocoTranslator
 *
 * Copyright (c) 2021.
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

// Generated from /Users/manleviet/Development/GitHub/MBDiagLib/src/main/java/at/tugraz/ist/ase/MBDiagLib/core/antlr4/CSP2Choco.g4 by ANTLR 4.8
package at.tugraz.ist.ase.csp2choco.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser}.
 */
public interface CSP2ChocoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Implication}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterImplication(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Implication}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitImplication(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ImplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparation(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ComparationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparation}
	 * labeled alternative in {@link at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparation(at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser.ComparationContext ctx);
}