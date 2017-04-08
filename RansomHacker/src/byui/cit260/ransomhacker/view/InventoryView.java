/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.control.InventoryControl;
import byui.cit260.ransomhacker.exceptions.InventoryControlException;
import byui.cit260.ransomhacker.model.Item;
import byui.cit260.ransomhacker.model.Player;
import java.util.ArrayList;
import ransomhacker.RansomHacker;
import byui.cit260.ransomhacker.model.Character;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 50mm3r
 */
public class InventoryView extends View {

    public InventoryView (Player player, Character character) {
        super("\n" + player.getName() + "'s Inventory:");
         
        ArrayList<Item> inventory = RansomHacker.getCurrentGame().getCharacter().getInventory(); //why does this display before the line before?
        this.displayInventory(inventory);
        
        this.console.println("Press 1 to calculate total value of your inventory, 2 to print your inventory to a list or Q to exit");
    }
    
    public static void displayInventory(ArrayList<Item> inventory) {
        for (int index = 0; index <inventory.size(); index++) {
            if (inventory == null) {
                break;
            }
            else {
                String name = inventory.get(index).getName();
                int quantity = inventory.get(index).getQuantity();
                System.out.println(name +" x" + quantity );
            }    
        }
}
    
    @Override
    public boolean doAction(String value) {
        
        switch(value) {
            case "1":
            {
                ArrayList<Item> inventory = RansomHacker.getCurrentGame().getCharacter().getInventory();
                InventoryControl icontrol = new InventoryControl();
                if (icontrol.totalCost(inventory) == -1)
                    ErrorView.display(this.getClass().getName(),"Items cannot have a negative cost");
                else
                this.console.println("$" + icontrol.totalCost(inventory) + "0");
                break;
            }
            case "2":
            
            default:
                ErrorView.display(this.getClass().getName(),"\nInvalid Selection");
                break;
        }
        
        return true;
    }
    
}
