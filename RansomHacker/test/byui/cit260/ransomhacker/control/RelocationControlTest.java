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
public class RelocationControlTest {
    
    public RelocationControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of calcMoveCost method, of class RelocationControl.
     */
    @Test
    public void testCalcMoveCost() {
        System.out.println("calcMoveCost");
        System.out.println("Test Case 1");
        int timesMoved = 3;
        int newCoordX = 10;
        int newCoordY = 5;
        int currentCoordX = 1;
        int currentCoordY = 1;
        RelocationControl instance = new RelocationControl();
        double expResult = 1600.0;
        double result = instance.calcMoveCost(timesMoved, newCoordX, newCoordY, currentCoordX, currentCoordY);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 2");
        timesMoved = 3;
        newCoordX = 10;
        newCoordY = 10;
        currentCoordX = 10;
        currentCoordY = 10;
        expResult = -1;
        result = instance.calcMoveCost(timesMoved, newCoordX, newCoordY, currentCoordX, currentCoordY);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 3");
        timesMoved = 3;
        newCoordX = 1;
        newCoordY = 1;
        currentCoordX = 20;
        currentCoordY = 20;
        expResult = 4100.0;
        result = instance.calcMoveCost(timesMoved, newCoordX, newCoordY, currentCoordX, currentCoordY);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 4");
        timesMoved = 3;
        newCoordX = 20;
        newCoordY = 20;
        currentCoordX = 1;
        currentCoordY = 1;
        expResult = 4100.0;
        result = instance.calcMoveCost(timesMoved, newCoordX, newCoordY, currentCoordX, currentCoordY);
        assertEquals(expResult, result, 0.0);
    }
    
}
