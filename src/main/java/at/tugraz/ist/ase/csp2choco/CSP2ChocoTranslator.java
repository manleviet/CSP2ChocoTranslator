/*
 * CSP2ChocoTranslator
 *
 * Copyright (c) 2021.
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.csp2choco;

import at.tugraz.ist.ase.common.LoggerUtils;
import at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoBaseListener;
import at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoLexer;
import at.tugraz.ist.ase.csp2choco.antlr.CSP2ChocoParser;
import lombok.Getter;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.Variable;
import org.javatuples.Pair;

import java.io.IOException;
import java.io.InputStream;

@Slf4j
public class CSP2ChocoTranslator extends CSP2ChocoBaseListener {

    @Getter @NonNull
    private Model model;

    public CSP2ChocoTranslator(@NonNull Model model) {
        this.model = model;
    }

    public void translate(@NonNull InputStream inputFile) throws IOException {

        log.debug("Translating CSP to Choco");
        LoggerUtils.indent();

        CharStream input = CharStreams.fromStream(inputFile);
        CSP2ChocoLexer lexer = new CSP2ChocoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSP2ChocoParser parser = new CSP2ChocoParser(tokens);
        ParseTree tree = parser.model();

        // create a standard ANTLR parse tree walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // feed to walker
        walker.walk(this, tree);        // walk parse tree

        LoggerUtils.outdent();
        log.debug("Translating CSP to Choco DONE");
    }

    public void exitConstraint(CSP2ChocoParser.ConstraintContext ctx) {
        String key = ctx.expr().getText();
        log.trace("{}Parsing the constraint '{}' >>>", LoggerUtils.tab, key.toUpperCase());
        LoggerUtils.indent();

        ParserRuleContext leftContext = (ParserRuleContext) ctx.expr().getChild(0);
        TerminalNode opNode = (TerminalNode) ctx.expr().getChild(1);
        ParserRuleContext rightContext = (ParserRuleContext) ctx.expr().getChild(2);

        IntVar leftVar = leftContextTranslate(model, leftContext);

        // if null, then error
        if (leftVar == null) return;

        String op = opNodeTranslate(opNode);

        Pair<IntVar, Integer> rightVar = rightContextTranslate(model, rightContext);

        if (rightVar == null) return;

        if (rightVar.getValue0() != null) {
            model.arithm(leftVar, op, rightVar.getValue0()).post();
        } else {
            model.arithm(leftVar, op, rightVar.getValue1()).post();
        }

        LoggerUtils.outdent();
        log.trace("{}<<< The domain '{}' parsed", LoggerUtils.tab, key.toUpperCase());
    }

    private String opNodeTranslate(TerminalNode node) {
        String op = CSP2ChocoParser._LITERAL_NAMES[node.getSymbol().getType()];
        op = op.substring(1, op.length() - 1);

        if (op.equals("==")) op = "=";

        //System.out.println(op);
        return op;
    }

    private IntVar leftContextTranslate(Model model, ParserRuleContext leftContext) {
        //System.out.println(leftContext.getRuleIndex());
        if (leftContext instanceof CSP2ChocoParser.IdContext id) {

            return findVariable(model, id.getText());
        } else {
            System.out.println("Error: must a identifier in the left side.");
        }
        return null;
    }

    private Pair<IntVar, Integer> rightContextTranslate(Model model, ParserRuleContext rightContext) {
        if (rightContext instanceof CSP2ChocoParser.IdContext id) {

            return Pair.with(findVariable(model, id.getText()), Integer.MIN_VALUE);
        } if (rightContext instanceof CSP2ChocoParser.IntContext valueContext) {

            return Pair.with(null, Integer.parseInt(valueContext.getText()));
        } else {
            System.out.println("Error: must a identifier or an integer in the right side");
        }
        return null;
    }

    // TODO: uses the method from the CommonPackage
    private IntVar findVariable(Model model, String name) {
        Variable var = model.getVar(0);
        for (Variable v : model.getVars()) {
            if (v.getName().equals(name)) {
                var = v;
                break;
            }
        }
        return (IntVar)var;
    }
}