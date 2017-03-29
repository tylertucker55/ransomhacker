/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransomhacker;

import byui.cit260.ransomhacker.model.Game;
import byui.cit260.ransomhacker.model.Player;
import byui.cit260.ransomhacker.view.SaveGameView;
import byui.cit260.ransomhacker.view.StartProgramView;


       
  


/**
 *
 * @author Hansen
 */
public class RansomHacker {

    
    private static Game currentGame = null;
    private static Player player = null;

   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        StartProgramView startProgramView = new StartProgramView();
        
       
        startProgramView.display();
        
     
    }
    
     public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RansomHacker.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RansomHacker.player = player;
    }
    
    
}