/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.exceptions.GameControlException;
import byui.cit260.ransomhacker.model.Game;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ransomhacker.RansomHacker;

/**
 *
 * @author Hansen Muhile
 */
public class SaveGameView extends View{
    
    public SaveGameView() {
        super("Enter File Location for save file:");
    }
  

    @Override

    public boolean doAction(String input) {
            if (input.length() < 2) {
            ErrorView.display(this.getClass().getName(),"\nInvalid file location: "
                + "The location must be greater than one character in length");
            }
   
            else {
            Game game = RansomHacker.getCurrentGame();
            
                try {
                    GameControl.saveGame(game, input);
                    this.console.println("Game Saved");
                } catch (GameControlException ex) {
                    ErrorView.display(this.getClass().getName(),"Game not Saved");
                }
                    }
        return true;
        }
            
         
       
    

    
    
    
}
