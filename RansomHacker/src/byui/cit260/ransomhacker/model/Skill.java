/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author 50mm3r
 */
public enum Skill implements Serializable {
    
    Hacking("Allows you to execute more complex hacks", "Hacking"),
    Speed("Allows you to execute your attacks faster", "Speed"),
    Stealth("Lowers the rate of detection caused by your attacks", "Stealth"),
    Social("Allows you to execute social engineering attacks", "Social"),
    Precision("Increases your chance of success on your attacks","Precision:");
    
    private final String name;
    private final String description;
    
    Skill (String description, String name) {
        this.description = description;
        this.name = name;
    }
    

    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }

    
    



}