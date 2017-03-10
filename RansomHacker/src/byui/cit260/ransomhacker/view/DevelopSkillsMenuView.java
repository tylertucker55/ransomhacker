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
public class DevelopSkillsMenuView extends View {
   
   
    
    public DevelopSkillsMenuView() {
               super( "\n"
                    + "\n----------------------------"
                    + "\n|     Develop Skills        |"
                    + "\n----------------------------"
                    + "\n1 - Self-Study"
                    + "\n2 - Certification Boot Camp"
                    + "\n3 - Psychology Class"
                    + "\nQ - Quit"
                    + "\n----------------------------"
                    + "\nPlease select a skill to develop");
        
    }
    
    

    @Override
     public boolean doAction(String choice) {
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
