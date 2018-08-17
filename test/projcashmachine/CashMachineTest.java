package projcashmachine;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author leonardo
 */
public class CashMachineTest {

    CashMachine atm;

    public CashMachineTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        atm = new CashMachine();
        atm.operation = new WithDraw();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of calcNotes method, of class CashMachine.
     */
    @Test
    public void testCalcNotes() {
        WithDraw op = atm.operation;
        int value = 30;
        int[] expecteds = {0, 0, 1, 1};

        atm.calcNotes(value);
        int[] results = {op.getN100(), op.getN50(), op.getN20(), op.getN10()};
        assertTrue(Arrays.equals(expecteds, results));

    }

    /**
     * Test of getAmount100Notes method, of class CashMachine.
     */
    @Test
    public void testGetAmount100Notes() {
        int value = -110;
        int expected = 0;

        int result = atm.getAmount100Notes(value);
        assertEquals(expected, result);
    }

    /**
     * Test of getAmount50Notes method, of class CashMachine.
     */
    @Test
    public void testGetAmount50Notes() {
        int value = 80;
        int expected = 1;

        int result = atm.getAmount50Notes(value);
        assertEquals(expected, result);
    }

    /**
     * Test of getAmount20Notes method, of class CashMachine.
     */
    @Test
    public void testGetAmount20Notes() {
        int value = 100;
        int expected = 5;

        int result = atm.getAmount20Notes(value);
        assertEquals(expected, result);
    }

    /**
     * Test of getAmount10Notes method, of class CashMachine.
     */
    @Test
    public void testGetAmount10Notes() {
        int value = 5000;
        int expected = 500;

        int result = atm.getAmount10Notes(value);
        assertEquals(expected, result);
    }

    /**
     * Test of isValid method, of class CashMachine.
     */
    @Test
    public void testIsValid() {
        int value = -114;
        boolean expected = false;

        boolean result = atm.isValid(value);
        assertEquals(expected, result);
    }

    /**
     * Test of isBalancePositive method, of class CashMachine.
     */
    @Test
    public void testIsBalancePositive() {
        int value = 912350;
        boolean excpected = false;

        assertEquals(excpected, atm.isBalancePositive(value));
    }

}
