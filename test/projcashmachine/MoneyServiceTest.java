package projcashmachine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo Moraes de Oliveira
 */
public class MoneyServiceTest {
    
    MoneyService mServ;
    
    public MoneyServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mServ = new MoneyService();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValue method, of class MoneyService.
     */
    @Test
    public void testGetAmount100Notes() {
        int value = 350;
        int expected = value / 100; // Expected: 3
        
        int result = mServ.getAmount100Notes(value);
        assertEquals(expected, mServ.getAmount100Notes(value));
        
    }

    /**
     * Test of getAmount50Notes method, of class MoneyService.
     */
    @Test
    public void testGetAmount50Notes() {
        int value = 180;
        int expected = (value % 100) / 50; // Expected: 3;
        
        int result = mServ.getAmount50Notes(value);
        assertEquals(expected, result);
    }

    /**
     * Test of getAmount20Notes method, of class MoneyService.
     */
    @Test
    public void testGetAmount20Notes() {
        int value = 90;
        int expected = ((value % 100) % 50) / 20; // Expected: 4
        
        int result = mServ.getAmount20Notes(value);
        assertEquals(expected, result);
    }

    /**
     * Test of getAmount10Notes method, of class MoneyService.
     */
    @Test
    public void testGetAmount10Notes() {
        int value = 1000;
        int expected = (((value % 100) % 50) % 20) / 10; // Expected: 100
        
        int result = mServ.getAmount10Notes(value);
        assertEquals(expected, result);
    }

    /**
     * Test of isValid method, of class MoneyService.
     */
    @Test
    public void testIsValid() {
        int value = 4;
        boolean expected = value % 2 == 0; // Expected: true
        
        boolean result = mServ.isValid(value);
        assertTrue(result);
    }
    
}
