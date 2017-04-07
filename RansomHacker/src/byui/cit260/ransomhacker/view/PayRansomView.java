/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.RansomControl;
import byui.cit260.ransomhacker.exceptions.RansomControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ransomhacker.RansomHacker;

/**
 *
 * @author User
 */
public class PayRansomView extends View {

    public PayRansomView() {
        super("\nEnter the amount of the ransom you wish to pay off:");
    }

    @Override
    public boolean doAction(String value) {
        
        if (value.length() < 1) {
            
                ErrorView.display(this.getClass().getName(),"You must pay more than $0.00");
                return false;
        }
            else {
             double amount = 0;
           try {amount = Double.parseDouble(value);
           } catch (NumberFormatException nf) {
               ErrorView.display(this.getClass().getName(),"This value must be a number");
           }
        int daysLeft = RansomHacker.getCurrentGame().getCharacter().getDaysLeft();
        double amountToPay = RansomHacker.getCurrentGame().getCharacter().getAmountToPay();
        RansomControl rcontrol = new RansomControl();
            try {
                rcontrol.addDays(daysLeft, amountToPay, amount); 
            } catch (RansomControlException ex) {
                ErrorView.display(this.getClass().getName(),ex.getMessage());
            }
            
        return true;
                    }

        
    }
    
}
