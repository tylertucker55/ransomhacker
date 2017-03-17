/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.model.Attack;
import byui.cit260.ransomhacker.model.Character;
import byui.cit260.ransomhacker.model.Player;
import ransomhacker.RansomHacker;
import byui.cit260.ransomhacker.model.Game;
import byui.cit260.ransomhacker.model.Item;
import byui.cit260.ransomhacker.model.Job;
import byui.cit260.ransomhacker.model.Map;
import byui.cit260.ransomhacker.model.Scene;
import byui.cit260.ransomhacker.model.SkillDevelopment;
import byui.cit260.ransomhacker.model.Skills;
import javax.tools.JavaFileManager.Location;
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
        
        Game game = new Game();
        RansomHacker.setCurrentGame(game);
        
        game.setPlayer(player); // save player in game
        
        Item item = new Item(); //create new item
        game.setItem(item); // save the new item in game
        
        Map map = ViewMapControl.createMap();
        game.setMap(map);
        
        Attack attack = new Attack();
        game.setAttack(attack);
        
        Job job = new Job();
        game.setJob(job);
        
        Scene scene = new Scene();
        game.setScene(scene);
        
        SkillDevelopment skillDevelopment = new SkillDevelopment();
        game.setSkillDevelopment(skillDevelopment);
        
        Skills skills = new Skills();
        game.setSkills(skills);
        
        Location location = new Location() {
            @Override
            public String getName() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean isOutputLocation() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        game.setLocation(location);
        
    }

    public static boolean LoadGame(String input) {
        System.out.println("\n*** loadGame stub function called***");
        return true;
    }
    
}
