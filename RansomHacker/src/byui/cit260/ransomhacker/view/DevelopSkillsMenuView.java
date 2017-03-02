/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import java.util.Scanner;

/**
 *
 * @author Hansen
 */
public class DevelopSkillsMenuView {
   
    private String menu;
    
    public DevelopSkillsMenuView() {
        this.menu = "\n"
                    + "\n----------------------------"
                    + "\n|     Develop Skills        |"
                    + "\n----------------------------"
                    + "\n1 - Self-Study"
                    + "\n2 - Certification Boot Camp"
                    + "\n3 - Psychology Class"
                    + "\nQ - Quit"
                    + "\n----------------------------"
                    + "\nPlease select a skill to develop";
        
    }
    
     public void displayDevelopSkillsMenuView() {
        
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
            System.out.println(this.menu);

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
                this.openSelfStudy();
                break;
            case "2":
                this.openCertificationBootCamp();
                break;
            case "3":
                this.openPsychologyClass();
                break;
            default:
                System.out.println("\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private void openSelfStudy() {
        System.out.println("\n*** openSelfStudy Function Called ***"); 
    }

    private void openCertificationBootCamp() {
        System.out.println("\n*** openCertificationBootCamp Function Called ***");
    }

    private void openPsychologyClass() {
        System.out.println("\n*** openPsychologyClass Function Called ***");
    }

}
