/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransomhacker;

import byui.cit260.ransomhacker.model.Item;
import byui.cit260.ransomhacker.model.Character;
import byui.cit260.ransomhacker.model.Game;
import byui.cit260.ransomhacker.model.Player;
import byui.cit260.ransomhacker.model.Skills;
  


/**
 *
 * @author Hansen
 */
public class RansomHacker {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
     Item item1 = new Item();
     item1.setName("Computer");
     item1.setDescription("A device used to hack");
     System.out.println(item1.toString());
     
     Character character1 = new Character();
     character1.setCoordinateX(1);
     character1.setCoordinateY(1);
     character1.setDaysLeft(90);
     character1.setDetection(0);
     character1.setHackingLevel(7);
     character1.setItems("Computer, Laptop");
     character1.setMoney(1000);
     character1.setMoneyLeft(10000000);
     character1.setName("Joe");
     character1.setSocialLevel(5);
     character1.setStealthLevel(3);
     System.out.println(character1.toString());
     
     Game game1 = new Game();
     game1.setDaysLeft(90);
     System.out.println(game1.toString());
     
     Player player1 = new Player();
     player1.setBestTime(78);
     player1.setName("John");
     System.out.println(player1.toString());
     
     Skills skill1 = new Skills();
     skill1.setDescription("Used to increase your stealthiness");
     skill1.setName("Stealth");
     skill1.setValue(3);
     System.out.println(skill1.toString());
     
     
    
    }
    
    
}
