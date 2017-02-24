/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.model.Player;
import byui.cit260.ransomhacker.view.MainMenuView;
import java.util.Scanner;

/**
 *
 * @author Hansen
 */
public class StartProgramView {
    
    private String promptMessage;
    public StartProgramView (){
        this.promptMessage = "\nPlease enter your name";
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
        "\n****************************************************************************************************"
        +"\n*                                                                                                  *"
        +"\n*                          This is your author Hansen Muhile                                       *"
        +"\n*                                                                                                  *"
        +"\n*                        This is a great game. Hope you like it                                    *"
        +"\n*                                                                                                  *"
        +"\n*     The game is a text-based role playing game in which you take the role of a computer hacker.  *"
        +"\n* Just after winning a cyber security competition, his one and only friend, a cat, is kidnapped by *"
        +"\n* an unknown organization! He receives a message stating that unless he pays a hefty ransom of     *"
        +"\n* $10,000,000.00 within 90 days, he will never see his beloved friend again.                       *"
        +"\n*                                                                                                  *"
        +"\n*                                                                                                  *"
        +"\n* Being a cyber security major at his local college, he knows that a good hacker can make a lot of *"
        +"\n* money quick and decides the only way to get the huge ransom together in time to save his         *"
        +"\n* friend is by turning to a life of cybercrime.                                                    *"
        +"\n*                                                                                                  *"
        +"\n*                                                                                                  *"
        +"\n*     The game begins in his home town of Rexburg, ID. During the game you will develop your       *"
        +"\n* hacking skills by studying attack methods, taking courses, getting infosec certifications which  *"
        +"\n* you will then use to carry out cyber attacks. In order to execute your attacks, you will need    *"
        +"\n* equipment and resources, things that don’t come cheap. You work for various criminal             *"
        +"\n* organizations, who will pay you for your skills, but they know how sneaky you hackers are and    *"
        +"\n* insist that all payments be done in person, cash only, meaning you will have to live wherever    *"
        +"\n* the attack takes place. The United States government also doesn’t take too kindly to people who  *"
        +"\n* make a career of cybercrime, so you will need to relocate frequently to avoid being caught by    *"
        +"\n* the FBI… but with new locations come new opportunities. The game ends when the allotted         *"
        +"\n* time has passed, you get caught by the FBI or when you have enough money to pay off the          *"
        +"\n* ransom.                                                                                          *"
        +"\n*                                                                                                  *"
        +"\n*                                                                                                  *"
        +"\n****************************************************************************************************"
        );
    }

    public void displayStartProgramView() {
       boolean done = false;
       do {
           // this function prompts for and get players name
           String name = this.getName();
           if (name.toUpperCase().equals("Q")) // user wants to quit
               return; //exit the game
           
           //do the requested action and display the next view
           done = this.doAction(name);
           
       } while (!done);
       
    }
    
    private String getName() {
     
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }

            break;
        }

        return value;
}

    private boolean doAction(String name) {
        
        if (name.length() < 2) {
            System.out.println("\nInvalid player name: "
                + "The name must be greater than one character in length");
            return false;
        }
     
        Player player = GameControl.createPlayer(name);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
         
        System.out.println("Good Luck " + player.getName());
    
    
    
    MainMenuView mainMenuView = new MainMenuView();
    
    mainMenuView.displayMainMenuView();

    }

    
}
    
    
