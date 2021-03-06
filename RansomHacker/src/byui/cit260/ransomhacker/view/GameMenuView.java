/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.exceptions.GameControlException;
import byui.cit260.ransomhacker.model.Player;
import byui.cit260.ransomhacker.model.Scene;
import ransomhacker.RansomHacker;
import byui.cit260.ransomhacker.model.Character;

/**
 *
 * @author Hansen
 */
public class GameMenuView extends View {
   
    
    public GameMenuView() {
        this.displayMessage = this.getMenu();
    
}  
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();

        // Try-catch statement for the menu, displays error when entering invalid number //
        try {
              
           
        switch (Integer.parseInt(choice)) {
            case 1:
                this.displayCharStats();
                break;
            case 2:
                this.displayJobs();
                break;
            case 3:
                this.displaySkillDev();
                break;
            case 4:
                this.displayInventory();
                break;
            case 5:
                this.displayStore();
                break;
            case 6:
                this.displayRelocation();
                break;
            case 7:
                this.displayPayRansom();
                break;
            case 8:
                this.displaySaveGame();
                break;
            case 9:
                this.displayMap();
                break;
            case 10:
                this.displayHelpMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid Selection");
                break;
            
        }
        }
        catch (NumberFormatException nf) {
            ErrorView.display(this.getClass().getName(),"This value must be a number. Press Q to quit.");
        }
        
        this.displayMessage = this.getMenu();
        
        return false;
    }      

    private void displayCharStats() {        
        this.console.println("\n"
                    + "\n----------------------------"
                    + "\n|       Character stats    |"
                    + "\n----------------------------"
                    + "\nHacking: " + RansomHacker.getCurrentGame().getCharacter().getHackingLevel()
                    + "\nSocialEngineering: " + RansomHacker.getCurrentGame().getCharacter().getSocialLevel()
                    + "\nStealth: " + RansomHacker.getCurrentGame().getCharacter().getStealthLevel()
                    + "\nPrecision: " + RansomHacker.getCurrentGame().getCharacter().getPrecisionLevel()
                    + "\nSpeed: " + RansomHacker.getCurrentGame().getCharacter().getSpeedLevel()
                    + "\n----------------------------");
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
        InventoryView inventoryview = new InventoryView(RansomHacker.getPlayer(), RansomHacker.getCurrentGame().getCharacter());
        inventoryview.display();
    }

    private void displayStore() {
        StoreView storeView = new StoreView();
        storeView.display();
    }

    private void displayRelocation() {
        RelocationView relocationView = new RelocationView();
        relocationView.display();
    }

    private void displayPayRansom() {
         PayRansomView payRansomView = new PayRansomView();
        payRansomView.display();
    }

    private void displaySaveGame() {
        SaveGameView saveGameView = new SaveGameView();
        saveGameView.display();
    }

    private String getMenu() {
        return "\nDays until ransom is due: " + RansomHacker.getCurrentGame().getCharacter().getDaysLeft()
                    + "\nFBI detection: " + RansomHacker.getCurrentGame().getCharacter().getDetection() + "%"
                    + "\nMoney: $" + RansomHacker.getCurrentGame().getCharacter().getMoney() + "/$" + RansomHacker.getCurrentGame().getCharacter().getAmountToPay() //how to display like a dollar amount?
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
                    + "\nQ - Quit";
    }
    
    private void displayMap() {
        this.console.println("   1   2   3   4   5   6   7   8   9");
        this.console.println("1 "  + Scene.Seattle.getSymbol()
                                 + Scene.Spokane.getSymbol()
                                 + Scene.Helena.getSymbol()
                                 + Scene.Bismark.getSymbol()
                                 + Scene.Minneapolis.getSymbol()
                                 + Scene.Milwaukee.getSymbol()
                                 + Scene.Detroit.getSymbol()
                                 + Scene.NewYork.getSymbol()
                                 + Scene.Boston.getSymbol()
                       + "\n2 "  + Scene.Portland.getSymbol()
                                 + Scene.Rexburg.getSymbol()
                                 + Scene.Cheyenne.getSymbol()
                                 + Scene.RapidCity.getSymbol()
                                 + Scene.DesMoines.getSymbol()
                                 + Scene.Chicago.getSymbol()
                                 + Scene.Cleveland.getSymbol()
                                 + Scene.Philidelphia.getSymbol()
                                 + Scene.Trenton.getSymbol()
                       + "\n3 "  + Scene.Oakland.getSymbol()
                                 + Scene.SaltLakeCity.getSymbol()
                                 + Scene.Denver.getSymbol()
                                 + Scene.KansasCity.getSymbol()
                                 + Scene.StLouis.getSymbol()
                                 + Scene.Indianapolis.getSymbol()
                                 + Scene.Cincinnati.getSymbol()
                                 + Scene.Baltimore.getSymbol()
                                 + Scene.WashingtonDC.getSymbol()
                       + "\n4 "  + Scene.LosAngeles.getSymbol()
                                 + Scene.LasVegas.getSymbol()
                                 + Scene.Albuquerque.getSymbol()
                                 + Scene.Amarillo.getSymbol()
                                 + Scene.Tulsa.getSymbol()
                                 + Scene.LittleRock.getSymbol()
                                 + Scene.Louisville.getSymbol()
                                 + Scene.Richmond.getSymbol()
                                 + Scene.Raleigh.getSymbol()
                        + "\n5 " + Scene.SanDiego.getSymbol()
                                 + Scene.Phoenix.getSymbol()
                                 + Scene.Lubbock.getSymbol()
                                 + Scene.Austin.getSymbol()
                                 + Scene.Dallas.getSymbol()
                                 + Scene.BatonRouge.getSymbol()
                                 + Scene.Nashville.getSymbol()
                                 + Scene.Knoxville.getSymbol()
                                 + Scene.Charleston.getSymbol()
                        + "\n6 " + "[--]" + "[--}"
                                 + Scene.ElPaso.getSymbol()
                                 + Scene.SanAntonio.getSymbol()
                                 + Scene.Houston.getSymbol()
                                 + Scene.NewOrleans.getSymbol()
                                 + Scene.Jackson.getSymbol()
                                 + Scene.Montgomery.getSymbol()
                                 + Scene.Atlanta.getSymbol()
                        + "\n7 " + "[--]" + "[--]" + "[--]"   
                                 + Scene.McAllen.getSymbol()
                                 + "[--]" + "[--]" + "[--]" + "[--}"
                                 + Scene.Miami.getSymbol());
        
        
        
        
       ;
    }

    private void displayHelpMenu() {
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.display();    
    }

 
    
    
}
   
