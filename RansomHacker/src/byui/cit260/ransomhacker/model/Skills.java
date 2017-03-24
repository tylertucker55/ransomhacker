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
    
    Hacking("Allows you to execute more complex hacks", "Hacking"),
    Speed("Allows you to execute your attacks faster", "Speed"),
    Stealth("Lowers the rate of detection caused by your attacks", "Stealth"),
    Social("Allows you to execute social engineering attacks", "Social"),
    Precision("Increases your chance of success on your attacks","Precision:");
    
    private final String name;
    private final String description;
    
    Skills (String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.description);
        hash = 61 * hash + this.level;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Skills other = (Skills) obj;
        if (this.level != other.level) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Skills{" + "name=" + name + ", description=" + description + ", level=" + level + '}';
    }
    
    
    
}