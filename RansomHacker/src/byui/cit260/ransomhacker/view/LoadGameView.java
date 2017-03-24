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
public class LoadGameView extends View {
   public LoadGameView (){
        super("\nEnter file location to load the game.");
    }
    @Override
    public boolean doAction(String input) {
            if (input.length() < 2) {
            System.out.println("\nInvalid location: "
                + "The location must be greater than one character in length");
            return false;
        }
            
        boolean result = GameControl.LoadGame(input);
     
        this.displayBanner();
        return result;
    }
       
    private void displayBanner() {
        System.out.println("\n|||||||             |||||||||"
                          +"\n|||                       |||"
                          +"\n|||      Game Loaded      |||"
                          +"\n|||                       |||"
                          +"\n|||||||             |||||||||");
    }
}