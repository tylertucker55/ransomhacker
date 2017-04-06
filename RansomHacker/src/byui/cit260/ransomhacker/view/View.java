/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;


import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import static javax.xml.bind.DatatypeConverter.parseInt;
import ransomhacker.RansomHacker;

/**
 *
 * @author Hansen
 */
public abstract class View implements ViewInterface {
    protected String displayMessage;
    
    protected final BufferedReader keyboard = RansomHacker.getInFile();
    protected final PrintWriter console = RansomHacker.getOutFile();
    
    public View() {
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        
        boolean done = false;
        do {
            String menuOption = this.getInput();

            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
                
        } while (!done);
    }
    
    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;

        while (!valid) {
            System.out.println("\n" + this.displayMessage);

            value = keyboard.nextLine();
            value = value.trim();

            if (value.length() == 0) {
                System.out.println("\nInvalid value");
                continue;
            }

            break;
        }

        return value;
    }
}
