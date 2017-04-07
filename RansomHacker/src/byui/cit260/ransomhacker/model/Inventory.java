/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

/**
 *
 * @author Hansen Muhile
 */
public enum Inventory {
    COMPUTER(50,"This is a Computer"),
    SERVER(100, "This is a Server"),
    MOUSE(20, "This is a Mouse"),
    KEYBOARD(30, "This is a Keyboard"),
    TABLET(60, "This is a Tablet");
    
    private final int price;
    private final String description;
    
    Inventory(int pri, String des){
        this.price = pri;
        this.description = des;
    }
    
    public int setPrice(){
        return price;
    }
    
    public String setDescription(){
        return description;
    }
}
