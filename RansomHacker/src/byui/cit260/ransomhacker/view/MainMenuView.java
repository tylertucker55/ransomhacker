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
 * @author 50mm3r
 */
public class MainMenuView extends View {
    
    
    
    public MainMenuView() {
               super( "\n"
                    + "\n----------------------------"
                    + "\n| Main Menu                |"
                    + "\n----------------------------"
                    + "\n1 - New Game"
                    + "\n2 - Open Save File"
                    + "\n3 - Help (How to play)"
                    + "\nQ - Quit"
                    + "\n----------------------------"
                    + "\nPlease select option ");
    }
    
    

   

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.newGame();
                break;
            case "2":
                this.openGame();
                break;
            case "3":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private void newGame() {
        //create a new game
        GameControl.createNewGame(RansomHacker.getPlayer());
        //create a new game Menu view
        
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void openGame() {
        System.out.println("openGame Function Called");
    }

    private void displayHelpMenu() {
        //Display the game menu
        HelpMenuView gameMenu = new HelpMenuView();
        gameMenu.displayHelpMenuView();
        
    }
   
}
