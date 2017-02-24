/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import java.util.Scanner;

/**
 *
 * @author 50mm3r
 */
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                    + "\nMain Menu:"
                    + "\n1 - New Game"
                    + "\n2 - Open Save File"
                    + "\n3 - Help (How to play)"
                    + "\nQ - Quit";
        System.out.println(menu);
    }
    
    public void displayMainMenuView() {
        
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
        }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\nChoose Menu Option:");

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() != 1) {
                System.out.println("\nInvalid value");
                continue;
            }

            break;
        }

        return value;
    }

    private boolean doAction(String choice) {
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
        System.out.println("newGame Function Called");
    }

    private void openGame() {
        System.out.println("openGame Function Called");
    }

    private void displayHelpMenu() {
        System.out.println("HelpMenu Function Called");
    }
   
}
