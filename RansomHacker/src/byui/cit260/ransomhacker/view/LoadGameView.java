/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author tylertucker
 */
public class LoadGameView {
    
    private String promptMessage;
    public LoadGameView (){
        this.promptMessage = "\nEnter file location to load the game.";
    }
    
    public void displayLoadGameView() {
          
       boolean done = false;
       do {
           // this function prompts for and get players name
           String input = this.getInput();
           if (input.toUpperCase().equals("Q")) // user wants to quit without saving
               return; //exit the game
           
           //do the requested action and display the next view
           done = this.doAction(input);
           
       } while (!done);
       
    }
    
    private String getInput() {
    
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
    
    private boolean doAction(String input) {
            if (input.length() < 2) {
            System.out.println("\nInvalid location: "
                + "The location must be greater than one character in length");
            return false;
        }
            
        GameControl.LoadGame(input);
     
        this.displayBanner();
        return true;
    }
       
    private void displayBanner() {
        System.out.println("\n|||||||             |||||||||"
                          +"\n|||                       |||"
                          +"\n|||      Game Loaded      |||"
                          +"\n|||                       |||"
                          +"\n|||||||             |||||||||");
    }
}
