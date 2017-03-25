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
public enum Skills implements Serializable {
    
    Hacking("Allows you to execute more complex hacks", "Hacking", 1),
    Speed("Allows you to execute your attacks faster", "Speed", 0),
    Stealth("Lowers the rate of detection caused by your attacks", "Stealth", 0),
    Social("Allows you to execute social engineering attacks", "Social", 1),
    Precision("Increases your chance of success on your attacks","Precision:", 0);
    
    private final String name;
    private final String description;
    private final int skillLevel;
    
    Skills (String description, String name, int skillLevel) {
        this.description = description;
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    
}