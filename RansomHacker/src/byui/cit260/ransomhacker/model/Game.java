/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author 50mm3r
 */
public class Game implements Serializable {

    private int daysLeft;
    private Map map;
    ArrayList<Attack> attacks;
    
    public Game() {
        this.attacks = new ArrayList<>();
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.daysLeft;
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
        final Game other = (Game) obj;
        if (this.daysLeft != other.daysLeft) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "daysLeft=" + daysLeft + '}';
    }
    
    
    
}
