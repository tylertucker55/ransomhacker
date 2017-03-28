/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.exceptions.RansomControlException;
import ransomhacker.RansomHacker;
import byui.cit260.ransomhacker.model.Character;

/**
 *
 * @author 50mm3r
 */
public class RansomControl {
    
    public void addDays( double amountPaid, int daysLeft) throws RansomControlException {
    
    

        if (amountPaid < 10000) { //amount paid is less than 10k?
	throw new RansomControlException("Amount payed must be less than 10k");
        }            
        if (daysLeft < 1) {  
	throw new RansomControlException("The number of days left must be over one");
        }
        int newDaysLeft = (int)(Math.round(amountPaid / 10000)) + daysLeft;
        RansomHacker.getCurrentGame().getCharacter().setDaysLeft(newDaysLeft);
         

    }
    
}