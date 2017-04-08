/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.exceptions.InventoryControlException;
import byui.cit260.ransomhacker.model.Item;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author 50mm3r
 */
public class PrintReportView {
    
    
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
                                                 , item.getDescription());
            }
            writer.close();
            
            
            
        }
    
    
}
