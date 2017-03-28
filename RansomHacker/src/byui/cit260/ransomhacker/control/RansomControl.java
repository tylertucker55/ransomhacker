/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

/**
 *
 * @author 50mm3r
 */
public class RansomControl {
    
    public boolean addDays( double amountPaid, int daysLeft) {
    
    

if (amountPaid < 10000) { //amount paid is less than 10k?
	return false;
    }            
if (daysLeft < 1) {  
	return false;
    }
int newDaysLeft = (int)(Math.round(amountPaid / 10000)) + daysLeft;
//Add Days


return true;

    }
    
}
