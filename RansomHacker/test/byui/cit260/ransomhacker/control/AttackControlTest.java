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
 * @author Hansen
 */
public class AttackControlTest {
    
    public AttackControlTest() {
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
     * Test of calcChanceOfSuccess method, of class AttackControl.
     */
    @Test
    public void testCalcChanceOfSuccess() {
        System.out.println("calcChanceOfSuccess");
        System.out.println("Test Case 1");
        int charCurrentSkillLevel = 7;
        int skillLevelRequired = 4;
        int OriginalChanceOfSuccess = 80;
        AttackControl instance = new AttackControl();
        int expResult = 95;
        int result = instance.calcChanceOfSuccess(charCurrentSkillLevel, skillLevelRequired, OriginalChanceOfSuccess);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Test Case 2");
         charCurrentSkillLevel = 5;
         skillLevelRequired = 0;
         OriginalChanceOfSuccess = 80;
         expResult = -1;
         result = instance.calcChanceOfSuccess(charCurrentSkillLevel, skillLevelRequired, OriginalChanceOfSuccess);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 3");
         charCurrentSkillLevel = 3;
         skillLevelRequired = 4;
         OriginalChanceOfSuccess = 80;
         expResult = -1;
         result = instance.calcChanceOfSuccess(charCurrentSkillLevel, skillLevelRequired, OriginalChanceOfSuccess);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 4");
         charCurrentSkillLevel = 5;
         skillLevelRequired = 4;
         OriginalChanceOfSuccess = 0;
         expResult = -1;
         result = instance.calcChanceOfSuccess(charCurrentSkillLevel, skillLevelRequired, OriginalChanceOfSuccess);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 5");
         charCurrentSkillLevel = 4;
         skillLevelRequired = 4;
         OriginalChanceOfSuccess = 80;
         expResult = -1;
         result = instance.calcChanceOfSuccess(charCurrentSkillLevel, skillLevelRequired, OriginalChanceOfSuccess);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 6");
         charCurrentSkillLevel = 5;
         skillLevelRequired = 4;
         OriginalChanceOfSuccess = 80;
         expResult = 85;
         result = instance.calcChanceOfSuccess(charCurrentSkillLevel, skillLevelRequired, OriginalChanceOfSuccess);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 7");
         charCurrentSkillLevel = 5;
         skillLevelRequired = 1;
         OriginalChanceOfSuccess = 80;
         expResult = 100;
         result = instance.calcChanceOfSuccess(charCurrentSkillLevel, skillLevelRequired, OriginalChanceOfSuccess);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("Test Case 8");
         charCurrentSkillLevel = 5;
         skillLevelRequired = 4;
         OriginalChanceOfSuccess = 1;
         expResult = 6;
         result = instance.calcChanceOfSuccess(charCurrentSkillLevel, skillLevelRequired, OriginalChanceOfSuccess);
        assertEquals(expResult, result, 0.0);
    }
    
}
