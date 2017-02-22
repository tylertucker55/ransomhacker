/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tylertucker
 */
public class ViewMapControlTest {
    
    public ViewMapControlTest() {
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

    /**
     * Test of calcReductionInDetection method, of class ViewMapControl.
     */
    @Test
    public void testCalcReductionInDetection() {
        System.out.println("calcReductionInDetection");
        System.out.println("Test Case One");
        int detectionPercent = 100;
        int distanceA = 5;
        int distanceB = 6;
        ViewMapControl instance = new ViewMapControl();
        int expResult = 45;
        int result = instance.calcReductionInDetection(detectionPercent, distanceA, distanceB);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcReductionInDetection");
        System.out.println("Test Case Two");
        detectionPercent = 30;
        distanceA = 3;
        distanceB = 7;
        expResult = -20;
        result = instance.calcReductionInDetection(detectionPercent, distanceA, distanceB);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcReductionInDetection");
        System.out.println("Test Case Three");
        detectionPercent = 50;
        distanceA = 4;
        distanceB = 8;
        expResult = -10;
        result = instance.calcReductionInDetection(detectionPercent, distanceA, distanceB);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcReductionInDetection");
        System.out.println("Test Case Four");
        detectionPercent = 100;
        distanceA = 8;
        distanceB = 8;
        expResult = 20;
        result = instance.calcReductionInDetection(detectionPercent, distanceA, distanceB);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("calcReductionInDetection");
        System.out.println("Test Case Five");
        detectionPercent = 0;
        distanceA = 1;
        distanceB = 1;
        expResult = -10;
        result = instance.calcReductionInDetection(detectionPercent, distanceA, distanceB);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
