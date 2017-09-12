package testerman;

import boshy.malfite.ejecutor.simple.SimpleEjecutor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author theboshy
 */
public class simpleEjecutorTEST {

    public simpleEjecutorTEST() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testJejecutor() {
        SimpleEjecutor.ejecComand("ipconfig");
    }
}
