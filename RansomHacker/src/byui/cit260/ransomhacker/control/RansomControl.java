/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.exceptions.RansomControlException;
import ransomhacker.RansomHacker;

/**
 *
 * @author 50mm3r
 */
public class RansomControl {
    
    public void addDays(int daysLeft, double amountToPay, double amount) throws RansomControlException {
    
    
        // Checks amount is valid
        if (amount < 10000) { //amount paid is more than 10k?
	throw new RansomControlException("Amount payed must be more than 10k");
        }
        // Checks that the character still has days
        if (daysLeft < 1) {  
	throw new RansomControlException("The number of days left must be over one");
        }
        //Checks if money is available
        double money = RansomHacker.getCurrentGame().getCharacter().getMoney();
        if (amount > money) {
        throw new RansomControlException("You don't have enough money to pay " + amount);
        }
        //Subtracts money
        money = (money - amount);
        RansomHacker.getCurrentGame().getCharacter().setMoney(money); //Why doesn't this update the variable money?
        //Calclulates days left
        int newDaysLeft = (int)(Math.round(amount / 10000)) + daysLeft; 
        //Adds the days
        RansomHacker.getCurrentGame().getCharacter().setDaysLeft(newDaysLeft); //Why doesn't this update the variable DaysLeft?
        //Reduces ransom amount
        

    }
    
}
