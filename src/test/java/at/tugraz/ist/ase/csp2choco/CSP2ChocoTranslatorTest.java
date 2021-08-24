/*
 * CSP2ChocoTranslator
 *
 * Copyright (c) 2021.
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.csp2choco;

import at.tugraz.ist.ase.common.Utils;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.variables.IntVar;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class CSP2ChocoTranslatorTest {

    Model model;

    private Model createModel() {
        // create a model
        Model model = new Model("Test Model");
        // Decision variables
        IntVar x = model.intVar("x", -10, 10);
        IntVar y = model.intVar("y", -10, 10);

        return model;
    }

    private void printConstraints(Model model) {
        List<Constraint> ac = Arrays.asList(model.getCstrs());
        ac.forEach(System.out::println);
    }

    @BeforeMethod
    public void setUp() {
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = null;
        try {
            inputStream = Utils.getInputStream(classLoader, "csp.mzn");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // create a model with variables
        model = createModel();

        // create listener
        CSP2ChocoTranslator translator = new CSP2ChocoTranslator(model);

        try {
            translator.translate(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testTranslator() {
        printConstraints(model);

        assert model.getNbCstrs() == 3;
        assert model.getCstrs()[0].toString().equals("ARITHM ([x >= 2])");
        assert model.getCstrs()[1].toString().equals("ARITHM ([x <= 0])");
        assert model.getCstrs()[2].toString().equals("ARITHM ([x =/= 1])");

        assert model.getNbVars() == 2;
        assert model.getVar(0).getName().equals("x");
        assert model.getVar(1).getName().equals("y");
    }
}