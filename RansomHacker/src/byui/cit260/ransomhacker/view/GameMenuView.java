/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import java.util.Scanner;
import ransomhacker.RansomHacker;

/**
 *
 * @author Hansen
 */
public class GameMenuView extends View {
    
    
    public GameMenuView() {
        super("\nDays until ransom is due: " + GameControl.character.getDaysLeft()
                    + "\nFBI detection: " + GameControl.character.getDetection() + "%"
                    + "\nMoney: $" + GameControl.character.getMoney() + "/$" + GameControl.character.getMoneyLeft()
                    + "\n------------------------------"
                    + "\n1 - Character Stats"
                    + "\n2 - Available Jobs"
                    + "\n3 - Available Courses"
                    + "\n4 - Equipment"
                    + "\n5 - Store"
                    + "\n6 - Relocate"
                    + "\n7 - Pay Ransom"
                    + "\n8 - Save Game"
                    + "\n9 - View Map"
                    + "\n10 - Help"
                    + "\nQ - Quit");
    
}  
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.displayCharStats();
                break;
            case "2":
                this.displayJobs();
                break;
            case "3":
                this.displaySkillDev();
                break;
            case "4":
                this.displayInventory();
                break;
            case "5":
                this.displayStore();
                break;
            case "6":
                this.displayRelocation();
                break;
            case "7":
                this.displayPayRansom();
                break;
            case "8":
                this.displaySaveGame();
                break;
            case "9":
                this.displayMap();
                break;
            case "10":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\nInvalid Selection");
                break;
   
        }
        
        return false;
    }      

    private void displayCharStats() {
        System.out.println("displayCharStats() Called");
    }

    private void displayJobs() {
        System.out.println("displayJobs() Called");
    }

    private void displaySkillDev() {
        System.out.println("displaySkillDev() Called");
    }

    private void displayInventory() {
        System.out.println("displayInventory() Called");
    }

    private void displayStore() {
        System.out.println("displayStore() Called");
    }

    private void displayRelocation() {
        RelocationView relocationView = new RelocationView();
        relocationView.display();
    }

    private void displayPayRansom() {
        System.out.println("displayPayRansom() Called");
    }

    private void displaySaveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    private void displayMap() {
        System.out.println("displayMap() Called");
    }

    private void displayHelpMenu() {
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.display();    
    }

 
    
    
}
    
