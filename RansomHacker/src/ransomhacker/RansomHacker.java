/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransomhacker;

import byui.cit260.ransomhacker.model.Item;


/**
 *
 * @author Hansen
 */
public class RansomHacker {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
     Item item1 = new Item();
     item1.setName("Computer");
     item1.setDescription("A device used to hack");
     System.out.println(item1.toString());
     
             
    
    }
    
    
}
