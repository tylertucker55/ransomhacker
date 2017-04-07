/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.Arrays;
/**
 *
 * @author muhile
 */
public class Item implements Serializable {
    
     /*COMPUTER,
     WIFICARD,
     EMAILSERVER,
     SUPERCOMPUTER,
     BOTNET,
     VPNSERVICE,
     PROXYNETWORK,
     BEGINNERHACKINGSOFTWARE,
     INTERMEDIATEHACKINGSOFTWARE,
     ADVANCEDHACKINGSOFTWARE,
     EXPERTHACKINGSOFTWARE,
     ZERODAYATTACKS;
     */   

    private String name;
    private String description;
    private double cost;
    private int quantity;
    private boolean owned;
    private int hackingLevel;
    private int socialLevel;
    private int precisionLevel;
    private int speedLevel;
    private int stealthLevel;

    public Item() {
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean getOwned() {
        return owned;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public int getHackingLevel() {
        return hackingLevel;
    }

    public void setHackingLevel(int hackingLevel) {
        this.hackingLevel = hackingLevel;
    }

    public int getSocialLevel() {
        return socialLevel;
    }

    public void setSocialLevel(int socialLevel) {
        this.socialLevel = socialLevel;
    }

    public int getPrecisionLevel() {
        return precisionLevel;
    }

    public void setPrecisionLevel(int precisionLevel) {
        this.precisionLevel = precisionLevel;
    }

    public int getSpeedLevel() {
        return speedLevel;
    }

    public void setSpeedLevel(int speedLevel) {
        this.speedLevel = speedLevel;
    }

    public int getStealthLevel() {
        return stealthLevel;
    }

    public void setStealthLevel(int stealthLevel) {
        this.stealthLevel = stealthLevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.description);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 23 * hash + (this.owned ? 1 : 0);
        hash = 23 * hash + this.hackingLevel;
        hash = 23 * hash + this.socialLevel;
        hash = 23 * hash + this.precisionLevel;
        hash = 23 * hash + this.speedLevel;
        hash = 23 * hash + this.stealthLevel;
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.quantity) != Double.doubleToLongBits(other.quantity)) {
            return false;
        }
        if (this.owned != other.owned) {
            return false;
        }
        if (this.hackingLevel != other.hackingLevel) {
            return false;
        }
        if (this.socialLevel != other.socialLevel) {
            return false;
        }
        if (this.precisionLevel != other.precisionLevel) {
            return false;
        }
        if (this.speedLevel != other.speedLevel) {
            return false;
        }
        if (this.stealthLevel != other.stealthLevel) {
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
        return "Item{" + "name=" + name + ", description=" + description + ", cost=" + cost + ", quantity=" + quantity + ", owned=" + owned + ", hackingLevel=" + hackingLevel + ", socialLevel=" + socialLevel + ", precisionLevel=" + precisionLevel + ", speedLevel=" + speedLevel + ", stealthLevel=" + stealthLevel + '}';
    }

    
    
   
    
}