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
    

    
    
}
