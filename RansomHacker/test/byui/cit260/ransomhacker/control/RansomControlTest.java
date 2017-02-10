/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 50mm3r
 */
public class RansomControlTest {
    
    public RansomControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of addDays method, of class RansomControl.
     */
    @Test
    public void testAddDays() {
        System.out.println("addDays");
        System.out.println("Test Case 1");
        double amountPaid = 20000.00;
        int daysLeft = 50;
        RansomControl instance = new RansomControl();
        double expResult = 52;
        double result = instance.addDays(amountPaid, daysLeft);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 2");
        amountPaid = 20000.00;
        daysLeft = 0;
        expResult = -1;
        result = instance.addDays(amountPaid, daysLeft);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 3");
        amountPaid = 5000.00;
        daysLeft = 50;
        expResult = -1;
        result = instance.addDays(amountPaid, daysLeft);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 4");
        amountPaid = 20000.00;
        daysLeft = 1;
        expResult = 3;
        result = instance.addDays(amountPaid, daysLeft);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 5");
        amountPaid = 10000.00;
        daysLeft = 50;
        expResult = 51;
        result = instance.addDays(amountPaid, daysLeft);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
