/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.model.Character;
import byui.cit260.ransomhacker.model.Player;
import ransomhacker.RansomHacker;

/**
 *
 * @author 50mm3r
 */
public class GameControl {

    public static Character character;
    
    
    public static Player createPlayer(String name) {
        if (name == null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        
        RansomHacker.setPlayer(player);
        
        return player;
    }

    public static void createNewGame(Player player) {
        GameControl.character = new Character();
        GameControl.character.setDaysLeft(90);
        GameControl.character.setDetection(0);
        GameControl.character.setMoney(1000);
        GameControl.character.setMoneyLeft(10000000);
        
        System.out.println("\n*** createNewGame stub function called***");
    }
    
}
