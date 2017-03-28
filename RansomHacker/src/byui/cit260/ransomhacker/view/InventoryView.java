/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.control.InventoryControl;
import byui.cit260.ransomhacker.model.Item;
import byui.cit260.ransomhacker.model.Player;
import java.util.ArrayList;
import ransomhacker.RansomHacker;

/**
 *
 * @author 50mm3r
 */
public class InventoryView extends View {

    public InventoryView (Player player, Character character){
        super("\n" + player.getName() + "'s Inventory:");
        
        InventoryControl.DisplayInventory();
        
        System.out.println("Press 1 to calculate total value of your inventory or Q to exit");
    }
    
    
    @Override
    public boolean doAction(String value) {
        
        switch(value) {
            case "1":
            {
                ArrayList<Item> inventory = RansomHacker.getCurrentGame().getCharacter().getInventory();
                InventoryControl icontrol = new InventoryControl();
                icontrol.totalCost(inventory); 
                break;
            }    
            default:
                System.out.println("\nInvalid Selection");
                break;
        }
        
        return false;
    }
    
}