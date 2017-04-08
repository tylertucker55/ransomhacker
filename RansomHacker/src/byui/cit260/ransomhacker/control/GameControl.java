/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.exceptions.GameControlException;
import byui.cit260.ransomhacker.model.Attack;
import byui.cit260.ransomhacker.model.Character;
import byui.cit260.ransomhacker.model.Game;
import byui.cit260.ransomhacker.model.Item;
import byui.cit260.ransomhacker.model.Job;
import byui.cit260.ransomhacker.model.Location;
import byui.cit260.ransomhacker.model.Map;
import byui.cit260.ransomhacker.model.Player;
import byui.cit260.ransomhacker.model.Scene;
import byui.cit260.ransomhacker.model.Skill;
import byui.cit260.ransomhacker.model.SkillDevelopment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import ransomhacker.RansomHacker;

/**
 *
 * @author 50mm3r
 */
public class GameControl {

    
    
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
        
        
        //Initialize Game
        Game game = new Game();
        RansomHacker.setCurrentGame(game);
        
        //Initialize Player
        Character character = new Character();
        
        character.setPlayer(player);
        
        
        //Create Player and Initialize starting attributes
        character = new Character();
        character.setDaysLeft(90);
        character.setDetection(0);
        character.setMoney(15000);
        character.setAmountToPay(10000000);
        character.setTimesMoved(0);
        character.setHackingLevel(1);
        
        //Set Starting Location
        character.setCharLocation(Scene.Rexburg.getCoordinates());
        
        game.setCharacter(character);
        
        //Initialize Beginner Inventory
        Item[] inventory = GameControl.createInventoryList();
        game.setItems(inventory);
        
        
        character.getInventory().add(inventory[Items.computer.ordinal()]);
        character.getInventory().add(inventory[Items.beginnerhackingsoftware.ordinal()]);
        
        
        //Create Map
        Map map = ViewMapControl.createMap();
        game.setMap(map);
        
        
     
    }
    
    public static void loadGame(String filePath)
                            throws GameControlException {
        Game game = null;
       
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            
            game = (Game)input.readObject();
            RansomHacker.setCurrentGame(game);
            
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void saveGame(Game game, String filePath)
            throws GameControlException {

        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); //Not writing a file?
            
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage(), e.getCause());
        }
        
    }
    
    //Create Game Items
    public static Item[] createInventoryList() {
        Item[] inventory = new Item[12];
        Item computer = new Item();
        inventory[Items.computer.ordinal()] = computer;
        computer.setName("Computer");
        computer.setDescription("A basic computer, can be used to launch basic attacks");
        computer.setQuantity(1);
        computer.setCost(500);
        computer.setOwned(true);
        computer.setHackingLevel(0);
        
        Item wificard = new Item();
        inventory[Items.wificard.ordinal()] = wificard;
        wificard.setName("Wireless Card");
        wificard.setDescription("A wireless adapter that supports packet injection,"
                + " can be used to launch wireless attacks");
        wificard.setCost(100);
        wificard.setOwned(false);
        wificard.setQuantity(0);
        
        Item emailserver = new Item();
        emailserver.setName("Email Server");
        emailserver.setDescription("An email server that allows you to send bulk"
                + " emails and carry out phishing scams");
        emailserver.setOwned(false);
        emailserver.setCost(500);
        emailserver.setQuantity(0);
        inventory[Items.emailserver.ordinal()] = emailserver;
        
        Item supercomputer = new Item();
        supercomputer.setName("Super Computer");
        supercomputer.setDescription("An ultra fast computer whose processing "
                + "capabilites make it ideal for cracking hashes"
                + "/n +1 Speed");
        supercomputer.setCost(5000);
        supercomputer.setOwned(false);
        supercomputer.setQuantity(0);
        supercomputer.setSpeedLevel(1);
        inventory[Items.supercomputer.ordinal()] = supercomputer;
        
        Item botnet = new Item();
        botnet.setName("Bot Net");
        botnet.setDescription("A network of 1000 compromised computers used in "
                + "carrying out DDoS attacks, also allows you to launch attacks "
                + "from comprimised computers, increasing your stealth"
                + "/n +1 Stealth");
        botnet.setStealthLevel(1);
        botnet.setCost(5000);
        botnet.setOwned(false);
        botnet.setQuantity(0);
        inventory[Items.botnet.ordinal()] = botnet;
        
        Item vpnservice = new Item();
        vpnservice.setName("VPN Services");
        vpnservice.setDescription("A VPN Service that allows you to change your "
                + "IP, increasing your stealth"
                + "/n+1 Stealth");
        vpnservice.setCost(200);
        vpnservice.setQuantity(0);
        vpnservice.setOwned(false);
        vpnservice.setStealthLevel(1);
        inventory[Items.vpnservice.ordinal()] = vpnservice;
        
        Item proxynetwork = new Item();
        proxynetwork.setName("Proxy Network");
        proxynetwork.setDescription("A network of proxy servers that further anonymize your location"
                + "/n+2 Stealth");
        proxynetwork.setCost(1000);
        proxynetwork.setQuantity(0);
        proxynetwork.setOwned(false);
        inventory[Items.proxynetwork.ordinal()] = proxynetwork;
        
        Item beginnerhackingsoftware = new Item();
        beginnerhackingsoftware.setName("Hacking Software: Beginner");
        beginnerhackingsoftware.setDescription("A free suite of hacking Tools for basic attacks");
        beginnerhackingsoftware.setCost(50);
        beginnerhackingsoftware.setOwned(true);
        beginnerhackingsoftware.setQuantity(1);
        inventory[Items.beginnerhackingsoftware.ordinal()] = beginnerhackingsoftware;
        
        Item intermediatehackingsoftware = new Item();
        intermediatehackingsoftware.setName("Hacking Software: Intermediate");
        intermediatehackingsoftware.setDescription("A suite of hacking tools for intermediate attacks");
        intermediatehackingsoftware.setCost(1000);
        intermediatehackingsoftware.setOwned(false);
        inventory[Items.intermediatehackingsoftware.ordinal()] = intermediatehackingsoftware;
        
        Item advancedhackingsoftware = new Item();
        advancedhackingsoftware.setName("Hacking Software: Advanced");
        advancedhackingsoftware.setDescription("A suite of hacking tools for advanced attacks");
        advancedhackingsoftware.setCost(5000);
        advancedhackingsoftware.setOwned(false);
        inventory[Items.advancedhackingsoftware.ordinal()] = advancedhackingsoftware;
        
        Item experthackingsoftware = new Item();
        experthackingsoftware.setName("Hacking Software: Expert");
        experthackingsoftware.setDescription("The best hacking tools available, for expert level attacks");
        experthackingsoftware.setCost(10000);
        experthackingsoftware.setOwned(false);
        inventory[Items.experthackingsoftware.ordinal()] = experthackingsoftware;
        
        Item zerodayexploit = new Item();
        zerodayexploit.setName("Zero-day Exploits");
        zerodayexploit.setDescription("The latest unpatched software exploits, fresh from the black market");
        zerodayexploit.setCost(20000);
        zerodayexploit.setOwned(false); 
        inventory[Items.zerodayattacks.ordinal()] = zerodayexploit;
                
        return inventory;
    }


 
    public enum Items {
        computer,
        wificard,
        emailserver,
        supercomputer,
        botnet,
        vpnservice,
        proxynetwork,
        beginnerhackingsoftware,
        intermediatehackingsoftware,
        advancedhackingsoftware,
        experthackingsoftware,
        zerodayattacks,
        ;
    }
    
    public static Job[] createJobsList() {
       Job[] joblist = new Job[8];
        
       Job wifiPasswords = new Job();
       wifiPasswords.setName("Steal Wifi-Passwords");
       wifiPasswords.setDescription("Crack local wifi passwords and sell them");
       wifiPasswords.setPay(100);
       
       Job stealCreditCards = new Job();
       stealCreditCards.setName("Steal Credit Card Numbers");
       stealCreditCards.setDescription("Steal credit card numbers and sell them on the black market");
       stealCreditCards.setPay(1000);
       
       Job crashBank = new Job();
       crashBank.setName("Crash Bank");
       crashBank.setDescription("Disrupt banking services for a bank's rival");
       crashBank.setPay(50000);
       
       Job stealIntel = new Job();
       stealIntel.setName("Steal valuable intel");
       stealIntel.setDescription("Hack into a company's rival and steal valuable information");
       stealIntel.setPay(50000);
       
       Job sabotageDatabase = new Job();
       sabotageDatabase.setName("Sabotage Database");
       sabotageDatabase.setDescription("Sabotage a valuable company database");
       sabotageDatabase.setPay(100000);
       
       Job stealPasswords = new Job();
       stealPasswords.setName("Steal Passwords");
       stealPasswords.setDescription("Steal company log-on credentials and sell them on the black market");
       stealPasswords.setPay(10000);
       
       Job setUpScam = new Job();
       setUpScam.setName("Set up Scam");
       setUpScam.setDescription("Set up scam using ransomware to hijack computers");
       setUpScam.setPay(25000);
       
       Job robExchange = new Job();
       robExchange.setName("Rob an Exchange");
       robExchange.setDescription("Hack into and steal funds from an exchange");
       robExchange.setPay(500000);
       
       return joblist;
    }
    
    public enum Jobs {
        wifiPasswords,
        stealCreditCards,
        crashBank,
        stealIntel,
        sabotageDatabase,
        stealPasswords,
        setUpScam,
        robExchange,
        ;
    }
   
    public static SkillDevelopment[] createCourseList() {
        SkillDevelopment[] courseList = new SkillDevelopment[3];
        
        SkillDevelopment selfStudy = new SkillDevelopment();
        selfStudy.setName("Self-Study");
        selfStudy.setDescription("\nTake a few days to research security and improve your Hacking Skill"
                + "\n+1 Hacking"
                + "\nTime: 3 Days"
                + "\nCost: $0.00");
        selfStudy.setMoneyCost(0);
        selfStudy.setTimeCost(3);
        selfStudy.setValue(1);
        
        SkillDevelopment psychologyClass = new SkillDevelopment();
        psychologyClass.setName("Psychology Class");
        psychologyClass.setDescription("\nTake a short course in Psychology to improve your Social Engineering Skill"
                + "\n+3 Social Engineering"
                + "\nTime: 7 Days"
                + "\nCost: $5000.00");
        psychologyClass.setMoneyCost(5000);
        psychologyClass.setTimeCost(7);
        psychologyClass.setValue(3);
        
        SkillDevelopment hackerBootCamp = new SkillDevelopment();
        hackerBootCamp.setName("Hacker Boot Camp");
        hackerBootCamp.setDescription("\nGo to a week long hacking course to improve your Hacking Skill"
                + "\n+3 Hacking"
                + "\nTime: 7 Days"
                + "\nCost $5000.00");
        hackerBootCamp.setTimeCost(7);
        hackerBootCamp.setMoneyCost(5000);
        hackerBootCamp.setValue(3);
        
        
  
        return courseList;
    }
   
    public enum Courses {
        selfStudy,
        pyschologyClass,
        hackerBootCamp,
        ;
    }
}

