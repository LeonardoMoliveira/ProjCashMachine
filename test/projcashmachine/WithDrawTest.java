
package projcashmachine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author leonardo
 */
public class WithDrawTest {
    
    WithDraw wD;
    
    public WithDrawTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        wD = new WithDraw();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getWithDrawTotal method, of class WithDraw.
     */
    @Test
    public void testGetWithDrawTotal() {
        wD.setN100(5);
        wD.setN50(1);
        wD.setN20(1);
        wD.setN10(0);
        
        int expected = 570;
        assertEquals(expected, wD.getWithDrawTotal());
    }
    
}
