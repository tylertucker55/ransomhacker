/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.model.Inventory;
import byui.cit260.ransomhacker.model.Scene;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hansen Muhile
 */
public class PrintReportView extends View{
    
    public PrintReportView() {
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
                this.inventoryReport();
                break;
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
       
       String fileName = "sceneReport.txt";
      
      PrintWriter writer = null;
           
           try {
               writer = new PrintWriter(fileName);
            
        } catch (IOException ex) {
            System.out.println("I/O Error: "+ ex.getMessage());
        } 
           writer.println("\n\n         Scene Report          ");
            writer.printf("%n%-20s%10s","Scene Name","Scene Symbol");
            writer.printf("%n%-20s%10s","-----------","-----------");
           
            for(Scene name: Scene.values()){
           writer.printf("%n%-20s%5s", name
                                     , name.getSymbol());
           }
           
           writer.close();
    }
    private void inventoryReport() {
       
        String fileName = "inventoryReport.txt";
      
      PrintWriter writer = null;
           
           try {
               writer = new PrintWriter(fileName);
            
        } catch (IOException ex) {
            System.out.println("I/O Error: "+ ex.getMessage());
        } 
           writer.println("\n\n         Inventory Report          ");
            writer.printf("%n%-20s%10s","Description","Price");
            writer.printf("%n%-20s%10s","-----------","-----");
           
            for(Inventory name: Inventory.values()){
           writer.printf("%n%-20s%5d", name.setDescription()
                                     , name.setPrice());
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
