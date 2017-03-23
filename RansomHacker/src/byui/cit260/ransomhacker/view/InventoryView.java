/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.control.InventoryControl;
import byui.cit260.ransomhacker.model.Player;

/**
 *
 * @author 50mm3r
 */
public class InventoryView extends View {

    public InventoryView (Player player, Character character){
        super("\n" + player.getName() + "'s Inventory:");
        
        InventoryControl.DisplayInventory();
        
    }
    
    
    @Override
    public boolean doAction(String value) {
        return false;
    }
    
}
