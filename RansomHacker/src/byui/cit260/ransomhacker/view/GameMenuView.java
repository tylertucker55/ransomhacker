/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.control.ViewMapControl;
import byui.cit260.ransomhacker.control.ViewMapControl.SceneList;
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
        CharacterStatsView statsMenu = new CharacterStatsView();
        statsMenu.display();
    }

    private void displayJobs() {
        JobListView jobMenu = new JobListView();
        jobMenu.display();
    }

    private void displaySkillDev() {
        DevelopSkillsMenuView skillsMenu = new DevelopSkillsMenuView();
        skillsMenu.display();
    }

    private void displayInventory() {
        System.out.println("displayInventory() Called");
    }

    private void displayStore() {
        StoreView gameMenu = new StoreView();
        gameMenu.display();
    }

    private void displayRelocation() {
        RelocationView relocationView = new RelocationView();
        relocationView.display();
    }

    private void displayPayRansom() {
        System.out.println("displayPayRansom() Called");
        PayRansomView payRansomView = new PayRansomView();
        payRansomView.display();
    }

    private void displaySaveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    private void displayMap() {
        System.out.println("   1   2   3   4   5   6   7   8   9");
        System.out.println("1 "  + SceneList.Seattle.getSymbol()
                                 + SceneList.Spokane.getSymbol()
                                 + SceneList.Helena.getSymbol()
                                 + SceneList.Bismark.getSymbol()
                                 + SceneList.Minneapolis.getSymbol()
                                 + SceneList.Milwaukee.getSymbol()
                                 + SceneList.Detroit.getSymbol()
                                 + SceneList.NewYork.getSymbol()
                                 + SceneList.Boston.getSymbol()
                       + "\n2 "  + SceneList.Portland.getSymbol()
                                 + SceneList.Rexburg.getSymbol()
                                 + SceneList.Cheyenne.getSymbol()
                                 + SceneList.RapidCity.getSymbol()
                                 + SceneList.DesMoines.getSymbol()
                                 + SceneList.Chicago.getSymbol()
                                 + SceneList.Cleveland.getSymbol()
                                 + SceneList.Philidelphia.getSymbol()
                                 + SceneList.Trenton.getSymbol()
                       + "\n3 "  + SceneList.Oakland.getSymbol()
                                 + SceneList.SaltLakeCity.getSymbol()
                                 + SceneList.Denver.getSymbol()
                                 + SceneList.KansasCity.getSymbol()
                                 + SceneList.StLouis.getSymbol()
                                 + SceneList.Indianapolis.getSymbol()
                                 + SceneList.Cincinnati.getSymbol()
                                 + SceneList.Baltimore.getSymbol()
                                 + SceneList.WashingtonDC.getSymbol()
                       + "\n4 "  + SceneList.LosAngeles.getSymbol()
                                 + SceneList.LasVegas.getSymbol()
                                 + SceneList.Albuquerque.getSymbol()
                                 + SceneList.Amarillo.getSymbol()
                                 + SceneList.Tulsa.getSymbol()
                                 + SceneList.LittleRock.getSymbol()
                                 + SceneList.Louisville.getSymbol()
                                 + SceneList.Richmond.getSymbol()
                                 + SceneList.Raleigh.getSymbol()
                        + "\n5 " + SceneList.SanDiego.getSymbol()
                                 + SceneList.Phoenix.getSymbol()
                                 + SceneList.Lubbock.getSymbol()
                                 + SceneList.Austin.getSymbol()
                                 + SceneList.Dallas.getSymbol()
                                 + SceneList.BatonRouge.getSymbol()
                                 + SceneList.Nashville.getSymbol()
                                 + SceneList.Knoxville.getSymbol()
                                 + SceneList.Charleston.getSymbol()
                        + "\n6 " + "[--]" + "[--}"
                                 + SceneList.ElPaso.getSymbol()
                                 + SceneList.SanAntonio.getSymbol()
                                 + SceneList.Houston.getSymbol()
                                 + SceneList.NewOrleans.getSymbol()
                                 + SceneList.Jackson.getSymbol()
                                 + SceneList.Montgomery.getSymbol()
                                 + SceneList.Atlanta.getSymbol()
                        + "\n7 " + "[--]" + "[--]" + "[--]"   
                                 + SceneList.McAllen.getSymbol()
                                 + "[--]" + "[--]" + "[--]" + "[--}"
                                 + SceneList.Miami.getSymbol());
        
        
        
        
       ;
    }

    private void displayHelpMenu() {
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.display();    
    }

 
    
    
}
    
