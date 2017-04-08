/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.InventoryControl;
import byui.cit260.ransomhacker.exceptions.InventoryControlException;
import byui.cit260.ransomhacker.model.Item;
import byui.cit260.ransomhacker.model.Scene;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import ransomhacker.RansomHacker;

/**
 *
 * @author Hansen Muhile
 */
public class SelectReportView extends View{
    
    public SelectReportView() {
         super( "\n"
                    + "\n----------------------------"
                    + "\n| Print Report Menu        |"
                    + "\n----------------------------"
                    + "\n1 - Print Scene Report"
                    + "\n2 - Print Inventory Report"
                    + "\n3 - Print Store Report"
                    + "\n4 - Print Character Report"
                    + "\nQ - Quit"
                    + "\n----------------------------"
                    + "\nPlease select option ");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "1":
                this.locationReport();
                break;
            case "2":
                {
                this.console.println("Enter desired file path: "
                                     + "\nExample: C:\\Users\\User\\Documents\\");
                String fileName = this.getInput();
                ArrayList<Item> inventory = RansomHacker.getCurrentGame().getCharacter().getInventory();
            try {
                PrintReportView.writeInventory(inventory, fileName);
                this.console.println("Report Printed Successfully");
            } catch (InventoryControlException ex) {
                ErrorView.display(this.getClass().getName(),"Failed to Save");
            }
                break;
            }    
            case "3":
                this.storeReport();
                break;
            case "4":
                this.characterReport();
                break;
            default:
                System.out.println("\nInvalid Selection");
                break;
   
        }
        
        return false;
    }

    private void locationReport() {
      // System.out.println("\n*** locationReport() Stub Function Called.");
       
       String fileName = "SceneReport.txt";
      
      PrintWriter writer = null;
           
           try {
               writer = new PrintWriter(fileName);
            
        } catch (IOException ex) {
            System.out.println("I/O Error: "+ ex.getMessage());
        } 
           writer.println("\n\n         Scene Report          ");
            writer.printf("%n%-20s%10s","Scene Name","Scene Symbol");
            writer.printf("%n%-20s%10s","-----------","-----");
           
            for(Scene name: Scene.values()){
           writer.printf("%n%-20s%5s", name
                                     , name.getSymbol());
           }
           
           writer.close();
    }
    

    private void storeReport() {
        System.out.println("\n*** storeReport() Stub Function Called.");
    }

    private void characterReport() {
       System.out.println("\n*** characterReport() Stub Function Called.");
    }

   
    
}
