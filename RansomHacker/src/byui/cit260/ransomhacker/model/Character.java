/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author 50mm3r
 */
public class Character implements Serializable {

private String name;
private Player player;
private Game game;
private Location location;
private String items;
private double money;
private int daysLeft;
private double detection;
private double moneyLeft;
private int timesMoved;

private Item[] inventory;
private Skills[] skillLevels; 
  
public Character() {
    
}

    public int getTimesMoved() {
        return timesMoved;
    }

    public void setTimesMoved(int timesMoved) {
        this.timesMoved = timesMoved;
    }
  
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Item[] getInventory() {
        return inventory;
    }

    public void setInventory(Item[] inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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

    public Skills[] getSkillLevels() {
        return skillLevels;
    }

    public void setSkillLevels(Skills[] skillLevels) {
        this.skillLevels = skillLevels;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.player);
        hash = 37 * hash + Objects.hashCode(this.game);
        hash = 37 * hash + Objects.hashCode(this.location);
        hash = 37 * hash + Objects.hashCode(this.items);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.money) ^ (Double.doubleToLongBits(this.money) >>> 32));
        hash = 37 * hash + this.daysLeft;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.detection) ^ (Double.doubleToLongBits(this.detection) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.moneyLeft) ^ (Double.doubleToLongBits(this.moneyLeft) >>> 32));
        hash = 37 * hash + Arrays.deepHashCode(this.inventory);
        hash = 37 * hash + Arrays.deepHashCode(this.skillLevels);
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
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        if (this.location != other.location) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.skillLevels, other.skillLevels)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", player=" + player + ", game=" + game + ", location=" + location + ", items=" + items + ", money=" + money + ", daysLeft=" + daysLeft + ", detection=" + detection + ", moneyLeft=" + moneyLeft + ", inventory=" + inventory + ", skillLevels=" + skillLevels + '}';
    }

    
}