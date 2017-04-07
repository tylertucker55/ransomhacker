/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        String value = " ";
        boolean valid = false;
        try {
            value = this.keyboard.readLine();
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(),"Error getting Input");
        }

        while (!valid) {
            System.out.println("\n" + this.displayMessage);
            value = value.trim();

            if (value.length() == 0) {
                ErrorView.display(this.getClass().getName(),"\nInvalid value");
                continue;
            }

            break;
        }

        return value;
    }
}
