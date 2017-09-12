package testerman;

import boshy.malfite.utils.ReportLog;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author theboshy
 */
public class ReportLogTEST {

    public ReportLogTEST() {
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
    public void test() {
        try {
            int f = 1 / 0;
        } catch (Exception e) {
            System.out.println(ReportLog.getErrorBuilder(new Object() {
            }, e));
        }
    }
}
