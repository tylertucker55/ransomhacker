/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import ransomhacker.RansomHacker;

/**
 *
 * @author User
 */
public class PayRansomView extends View {
    
    public PayRansomView () {
        super("\nEnter the amount of the ransom you wish to pay off:");
    }

    @Override
    public boolean doAction(String value) {
        if (value.length() < 1 )
        {System.out.println("You must pay more than $0.00");
        return false;
        
        else {
        int daysLeft = RansomHacker.getCurrentGame().getCharacter().getDaysLeft();
        double amountPaid = RansomHacker.getCurrentGame().getCharacter().getAmountPaid();
        boolean result = RansomControl.addDays(daysLeft, amountPaid );
        return result;
                }
        
    }
