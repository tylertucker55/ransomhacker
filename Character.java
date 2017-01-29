/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransomhacker;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author 50mm3r
 */
public class Character implements Serializable {

private String name;
private int hackingLevel;
private int socialLevel;
private int stealthLevel;
private int coordinateX;
private int coordinateY;
private String items;
private double money;
private int daysLeft;
private double detection;
private double moneyLeft;
  
public Character() {
    
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getStealthLevel() {
        return stealthLevel;
    }

    public void setStealthLevel(int stealthLevel) {
        this.stealthLevel = stealthLevel;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public double getDetection() {
        return detection;
    }

    public void setDetection(double detection) {
        this.detection = detection;
    }

    public double getMoneyLeft() {
        return moneyLeft;
    }

    public void setMoneyLeft(double moneyLeft) {
        this.moneyLeft = moneyLeft;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.hackingLevel;
        hash = 89 * hash + this.socialLevel;
        hash = 89 * hash + this.stealthLevel;
        hash = 89 * hash + this.coordinateX;
        hash = 89 * hash + this.coordinateY;
        hash = 89 * hash + Objects.hashCode(this.items);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 89 * hash + this.daysLeft;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.detection) ^ (Double.doubleToLongBits(this.detection) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.moneyLeft) ^ (Double.doubleToLongBits(this.moneyLeft) >>> 32));
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
        final Character other = (Character) obj;
        if (this.hackingLevel != other.hackingLevel) {
            return false;
        }
        if (this.socialLevel != other.socialLevel) {
            return false;
        }
        if (this.stealthLevel != other.stealthLevel) {
            return false;
        }
        if (this.coordinateX != other.coordinateX) {
            return false;
        }
        if (this.coordinateY != other.coordinateY) {
            return false;
        }
        if (Double.doubleToLongBits(this.money) != Double.doubleToLongBits(other.money)) {
            return false;
        }
        if (this.daysLeft != other.daysLeft) {
            return false;
        }
        if (Double.doubleToLongBits(this.detection) != Double.doubleToLongBits(other.detection)) {
            return false;
        }
        if (Double.doubleToLongBits(this.moneyLeft) != Double.doubleToLongBits(other.moneyLeft)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", hackingLevel=" + hackingLevel + ", socialLevel=" + socialLevel + ", stealthLevel=" + stealthLevel + ", coordinateX=" + coordinateX + ", coordinateY=" + coordinateY + ", items=" + items + ", money=" + money + ", daysLeft=" + daysLeft + ", detection=" + detection + ", moneyLeft=" + moneyLeft + '}';
    }



}
