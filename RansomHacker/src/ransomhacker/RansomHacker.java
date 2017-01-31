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
import byui.cit260.ransomhacker.model.Attack;
import byui.cit260.ransomhacker.model.Job;
import byui.cit260.ransomhacker.model.Location;
import byui.cit260.ransomhacker.model.Map;
import byui.cit260.ransomhacker.model.Scene;
import byui.cit260.ransomhacker.model.SkillDevelopment;


       
  


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
     item1.setEffects("Required to perform basic attacks");
     item1.setCost(500);
     item1.setQuantity(3);
     item1.setValue(3);
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
     
     Attack attack1 = new Attack();
     attack1.setJob("Hack Credit Card Info");
     attack1.setChanceOfSuccess(60);
     attack1.setDetectionCost(30);
     attack1.setName("Brute Force Attack");
     attack1.setTimeCost(3);
     attack1.setSkillRequired(5);
     System.out.println(attack1.toString());
     
     Job job1 = new Job();
     job1.setName("Hack Credit Card Info");
     job1.setPay(10000);
     job1.setState("Idaho");
     System.out.println(job1.toString());
     
     Location location1 = new Location();
     location1.setColumn(1);
     location1.setRow(1);
     location1.setVisited(true);
     System.out.println(location1.toString());
     
     Map map1 = new Map();
     map1.setColumnCount(100);
     map1.setRowCount(100);
     System.out.println(map1.toString());
     
     Scene scene1 = new Scene();
     scene1.setDisplaySymbol("$");
     scene1.setName("State");
     scene1.setTravelTime(10);
     System.out.println(scene1.toString());
     
     SkillDevelopment skilldevelopment1 = new SkillDevelopment();
     skilldevelopment1.setName("Self-Study");
     skilldevelopment1.setMoneyCost(100);
     skilldevelopment1.setState("Idaho");
     skilldevelopment1.setTimeCost(1);
     skilldevelopment1.setValue(1);
     skilldevelopment1.setDescription("Study Hacking Strategies in a day long Personal Study");
    

    }
    
    
}
