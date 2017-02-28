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
public class GameMenuView {
    
    private String menu;
    
    public GameMenuView() {
        this.menu = "\nDays until ransom is due: " + GameControl.character.getDaysLeft()
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
                    + "\nQ - Quit";
        System.out.println(menu);
}

  void displayMenu() {
        System.out.println("\n*** displayMenu stub function called ***");
    }
    
}
