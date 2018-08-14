package testerman;

import boshy.malfite.ejecutor.temp.file.Enrrutador;
import boshy.malfite.ejecutor.types.EjecutorType;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author theboshy
 */
public class MianTEST {
    
    public MianTEST() {
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
    public void test() throws IOException{
        Enrrutador.setNombreEnrrutadorFileJava("nombrecito_xd");
        Enrrutador.changeWay(EjecutorType.JAVA, "java cdxdxdx");
    }
    
}
