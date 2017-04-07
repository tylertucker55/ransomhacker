/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.exceptions.GameControlException;
import byui.cit260.ransomhacker.exceptions.InventoryControlException;
import byui.cit260.ransomhacker.model.Game;
import byui.cit260.ransomhacker.model.Item;
import java.util.ArrayList;
import ransomhacker.RansomHacker;
import byui.cit260.ransomhacker.view.View;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author 50mm3r
 */
public class InventoryControl {


    public double totalCost(ArrayList<Item> inventory) {

        double total = 0;
        for (int index = 0; index < inventory.size(); index++) {
            if (inventory.get(index).getCost() < 0) {
                return -1;
        }
            total = total + inventory.get(index).getCost();
        }

        return total;
    }
    
    public static void writeInventory(ArrayList<Item> inventory, String fileName)
            throws InventoryControlException {
            
            
                    PrintWriter writer = null;
                    
                    try { writer = new PrintWriter(fileName + "InventoryReport.txt");}
                    catch (IOException ex) {
                        System.out.println("I/O Error: " + ex.getMessage());
                    }
            writer.println("\n\n         Inventory Report          ");
            writer.printf("%n%-30s%-10s%-50s","Name","Price","Description");
            writer.printf("%n%-30s%-10s%-50s","-----------","-----","-------------------");
            for (Item item : inventory) {
                writer.printf("%n%-30s%-10.2f%-50s", item.getName()
                                                 , item.getCost()
                                                 , item.getDescription()); //Not writing a file?
            }
            writer.close();
            
            
            
        }
      

    public void addItemtoInventory() {
        
    }
    
    
}
