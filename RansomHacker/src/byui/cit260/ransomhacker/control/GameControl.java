/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.model.Character;
import byui.cit260.ransomhacker.model.Game;
import byui.cit260.ransomhacker.model.Item;
import byui.cit260.ransomhacker.model.Location;
import byui.cit260.ransomhacker.model.Map;
import byui.cit260.ransomhacker.model.Player;
import byui.cit260.ransomhacker.model.Skills;
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
        GameControl.character.setTimesMoved(0);
        
        Game game = new Game();
        RansomHacker.setCurrentGame(game);
        
        character.setPlayer(player);
        //character.setLocation();
        
        Item[] inventory = GameControl.createInventoryList();
        character.setInventory(inventory);
        
        Skills[] skillLevels = GameControl.createSkillsList();
        character.setSkillLevels(skillLevels);
        
        Map map = ViewMapControl.createMap();
        game.setMap(map);
        
        
        System.out.println("\n*** createNewGame stub function called***");
    }

    public static boolean LoadGame(String input) {
        System.out.println("\n*** loadGame stub function called***");
        return true;
    }

    public static Item[] createInventoryList() {
        Item[] inventory;
        inventory = new Item[12];
        Item computer = new Item();
        computer.setName("Computer");
        computer.setDescription("A basic computer, can be used to launch basic attacks");
        computer.setQuantity(1);
        computer.setCost(0);
        computer.setOwned(true);
        computer.setHackingLevel(0);
        inventory[Items.computer.ordinal()] = computer;
        
        Item wificard = new Item();
        wificard.setName("Wireless Card");
        wificard.setDescription("A wireless adapter that supports packet injection,"
                + " can be used to launch wireless attacks");
        wificard.setCost(100);
        wificard.setOwned(false);
        wificard.setQuantity(0);
        inventory[Items.wificard.ordinal()] = wificard;
        
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
        beginnerhackingsoftware.setCost(0);
        beginnerhackingsoftware.setOwned(true);
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
    
    public static Skills[] createSkillsList() {
        Skills[] skillLevels;
        skillLevels = new Skills[5];
        
        Skills hackingLevel = new Skills();
        hackingLevel.setName("Hacking Level");
        hackingLevel.setDescription("Level of expertise carrying out software exploits");
        hackingLevel.setLevel(1);
        skillLevels[SkillNames.hacking.ordinal()] = hackingLevel;
        
        Skills socialLevel = new Skills();
        socialLevel.setName("Social Engineering Level");
        socialLevel.setDescription("Level of expertise carrying out social engineering attacks");
        socialLevel.setLevel(1);
        skillLevels[SkillNames.social.ordinal()] = socialLevel;
        
        Skills stealthLevel = new Skills();
        stealthLevel.setName("Stealth Level");
        stealthLevel.setDescription("Ability to avoid detection while carrying out attacks,"
                + "each level lowers detection by 5%");
        stealthLevel.setLevel(0);
        skillLevels[SkillNames.stealth.ordinal()] = stealthLevel;
        
        Skills precisionLevel = new Skills();
        precisionLevel.setName("Precision Level");
        precisionLevel.setDescription("Ability to execute attacks more successfully, "
                + "each level increases chance of success by 5%");
        precisionLevel.setLevel(0);
        skillLevels[SkillNames.precision.ordinal()] = precisionLevel;
        
        Skills speedLevel = new Skills();
        speedLevel.setName("Speed Level");
        speedLevel.setDescription("Ability to carry out attacks more quickly, "
                + "each level decreases the time cost by 1 day");
        speedLevel.setLevel(0);
        skillLevels[SkillNames.speed.ordinal()] = speedLevel;
                
                
        return skillLevels;
        
    }
    
    public enum SkillNames {
        hacking,
        social,
        stealth,
        precision,
        speed;
    }
    
}
