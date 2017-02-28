/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import java.util.Scanner;

/**
 *
 * @author Hansen
 * 
 * The end user is prompted to enter the file location where the game will be saved.
 * If a valid file location is specified, save the the player, profile, inventory items, progress data to a file.
 * Display a message saying that the game was saved successfully and then return back to the Main Menu.
 * An error message will be displayed if the end user enters an invalid file location and the end user prompted again to enter a valid file location.
 */

 
public class SaveGameView {
    
    private String promptMessage;
    public SaveGameView (){
        this.promptMessage = "\nEnter file location to save the game?";
        
    }

    
    
     public void displaySaveGameView() {
          
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
            System.out.println("\nInvalid file location: "
                + "The location must be greater than one character in length");
            return false;
        }
     
        this.displayBanner();
        return true;
    }
       
    private void displayBanner() {
        System.out.println("\n|||||||             |||||||||"
                          +"\n|||                       |||"
                          +"\n|||      Game Saved       |||"
                          +"\n|||                       |||"
                          +"\n|||||||             |||||||||");
    }
    
}
