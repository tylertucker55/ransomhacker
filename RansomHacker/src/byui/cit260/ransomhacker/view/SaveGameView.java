/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import java.io.FileWriter;
import java.io.IOException;
import ransomhacker.RansomHacker;

/**
 *
 * @author Hansen Muhile
 */
public class SaveGameView extends View{
    
    public SaveGameView() {
        super("\nDo you want to save game?"
                +"\n----------------------"
                + "\nY - Yes"
                + "\nN - No");
    }
  

    @Override

    public boolean doAction(String input) {
            if (input.length() < 2) {
            ErrorView.display(this.getClass().getName(),"\nInvalid file location: "
                + "The location must be greater than one character in length");
            return false;
        }
            
            input = input.toUpperCase();
     switch (input) {
            case "Y":
               System.out.println("\n|||||||             |||||||||"
                          +"\n|||                       |||"
                          +"\n|||      Game Saved       |||"
                          +"\n|||                       |||"
                          +"\n|||||||             |||||||||");
                break;
            case "N":
                System.out.println("\n|||||||             |||||||||"
                          +"\n|||                       |||"
                          +"\n|||      Game Not Saved   |||"
                          +"\n|||                       |||"
                          +"\n|||||||             |||||||||");
                break;
            default:
                System.out.println("\nInvalid Selection");
                break;
        }

        
        return true;
    }
       
    

    
    
    
}
