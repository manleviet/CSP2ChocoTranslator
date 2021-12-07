/*
 * CSP2ChocoTranslator
 *
 * Copyright (c) 2021.
 *
 * @author: Viet-Man Le (vietman.le@ist.tugraz.at)
 */

package at.tugraz.ist.ase.csp2choco;

import at.tugraz.ist.ase.common.IOUtils;
import org.chocosolver.solver.Model;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.variables.IntVar;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CSP2ChocoTranslatorTest {

    static Model model;

    static Model createModel() {
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

    @BeforeAll
    static void setUp() {
        try {
            ClassLoader classLoader = CSP2ChocoTranslatorTest.class.getClassLoader();
            InputStream inputStream = IOUtils.getInputStream(classLoader, "csp.mzn");

            // create a model with variables
            model = createModel();

            // create listener
            CSP2ChocoTranslator translator = new CSP2ChocoTranslator(model);

            translator.translate(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTranslator() {
//        printConstraints(model);

        assertAll(() -> assertEquals(3, model.getNbCstrs()),
                () -> assertEquals("ARITHM ([x >= 2])", model.getCstrs()[0].toString()),
                () -> assertEquals("ARITHM ([x <= 0])", model.getCstrs()[1].toString()),
                () -> assertEquals("ARITHM ([x =/= 1])", model.getCstrs()[2].toString()),
                () -> assertEquals(2, model.getNbVars()),
                () -> assertEquals("x", model.getVar(0).getName()),
                () -> assertEquals("y", model.getVar(1).getName()));
    }
}