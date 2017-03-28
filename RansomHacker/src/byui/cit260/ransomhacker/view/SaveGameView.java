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

 
public class SaveGameView extends View {
    
    
    public SaveGameView (){
        super("\nEnter file location to save the game?");
        
    }

    @Override
    public boolean doAction(String input) {
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