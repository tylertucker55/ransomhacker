/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import java.util.Scanner;

/**
 *
 * @author tylertucker
 */
public class JobListView extends View {
    public JobListView() {
        super("\n"
                    + "\n----------------------------"
                    + "\n|       Job List           |"
                    + "\n----------------------------"
                    + "\n1 - Hack a local wifi password"
                    + "\n2 - Steal credit card numbers"
                    + "\n3 - Crash a rival bank"
                    + "\n----------------------------"
                    + "\nPlease select an option");
    }
    
    @Override
    public boolean doAction(String choice) {
         choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                System.out.println("Job " + choice + " Selected");
                displayAttackMenu();
                break;
            case "2":
                System.out.println("Job " + choice + " Selected");
                displayAttackMenu();
                break;
            case "3":
                System.out.println("Job " + choice + " Selected");
                displayAttackMenu();
                break;
            default:
                System.out.println("\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private void displayAttackMenu() {
        AttackMenuView attackMenu = new AttackMenuView();
        attackMenu.display();
    }
}