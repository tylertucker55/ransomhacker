/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.control.RelocationControl;
import byui.cit260.ransomhacker.model.Player;
import java.util.Scanner;

/**
 *
 * @author 50mm3r
 */
class RelocationView {
    
    private String promptMessage;
    
    public void displayRelocationView() {
      this.promptMessage = "\nPlease enter the destination City (ex. Rexburg, ID)"
                            + "\n Enter Q to quit";
      
      boolean done = false;
       do {
           // this function prompts for and get players name
           String cityName = this.getCityName();
           if (cityName.toUpperCase().equals("Q")) // user wants to quit
               return;
           
           //do the requested action and display the next view
           done = this.doAction(cityName);
           
       } while (!done);
    }
    
    private String getCityName() {
     
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }

            break;
        }

        return value;
}

    private boolean doAction(String cityName) {
               
        if (cityName.length() < 2) {
            System.out.println("\nInvalid city name: "
                + "The name must be in the format [City, ST]");
            return false;
            }    
        // else RelocationControl.calcMoveCost(A, B, C, D, E); To be added when values are populated   
        
        boolean result = RelocationControl.moveChar(cityName);
            
        return result;
            
            
    
        }
        
       
    }
    
    
    
   