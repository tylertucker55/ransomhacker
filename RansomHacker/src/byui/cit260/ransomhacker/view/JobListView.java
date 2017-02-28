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
public class JobListView {
    
    private String menu;
    
    public JobListView() {
        this.menu = "\n"
                    + "\n----------------------------"
                    + "\n|       Job List           |"
                    + "\n----------------------------"
                    + "\n1 - Hack a local wifi password"
                    + "\n2 - Steal credit card numbers"
                    + "\n3 - Crash a rival bank"
                    + "\n----------------------------";
        System.out.println(menu);
    }
    
    public void displayJobListView() {
        System.out.println("This is the job list function");
        
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
                this.hackWifiPass();
                break;
            case "2":
                this.stealCreditCard();
                break;
            case "3":
                this.crashRivalBank();
                break;
            default:
                System.out.println("\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private void hackWifiPass() {
        System.out.println("\nSelected Wifi Hack");
    }

    private void stealCreditCard() {
        System.out.println("\nSelected Steal Credit Card");
    }

    private void crashRivalBank() {
        System.out.println("\nSelected Crash Rival Bank");
    }
    
}
