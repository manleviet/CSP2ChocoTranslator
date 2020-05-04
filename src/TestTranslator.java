/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
import info.manleviet.csp2choco.translator.CSP2ChocoParserLexer;
import info.manleviet.csp2choco.translator.CSP2ChocoParserParser;
import info.manleviet.csp2choco.translator.CSP2ChocoTranslator;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.variables.IntVar;

public class TestTranslator {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];

        // create a model with variables
        Model model = createModel();

        // create listener
        CSP2ChocoTranslator translator = new CSP2ChocoTranslator(model);
        translator.translate(inputFile);

        printConstraints(translator.getModel());
    }

    private static Model createModel() {
        // create a model
        Model model = new Model("Test Model");
        // Decision variables
        IntVar x = model.intVar("x", -10, 10);
        IntVar y = model.intVar("y", -10, 10);

        return model;
    }

    private static void printConstraints(Model model) {
        List<Constraint> ac = Arrays.asList(model.getCstrs());
        ac.forEach(System.out::println);
    }
}