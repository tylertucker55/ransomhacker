/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import java.io.Serializable;
import javax.tools.JavaFileManager;
/**
 *
 * @author 50mm3r
 */
public class Game implements Serializable {

    private int daysLeft;
    
    public Game() {
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
    
    private double totalTime;
    private Player player;
    private Item item;
    private Map map;
    private Scene scene;
    private Skills skills;
    private Attack attack;
    private Character character;
    private Location location;
    private SkillDevelopment skillDevelopment;

    public void setJob(Job job) {
    }

    public void setPlayer(Player player) {
    }

    public void setItem(Item item) {
    }

    public void setMap(Map map) {
    }

    public void setAttack(Attack attack) {
    }

    public void setScene(Scene scene) {
    }

    public void setSkillDevelopment(SkillDevelopment skillDevelopment) {
    }

    public void setSkills(Skills skills) {
    }

    public void setLocation(JavaFileManager.Location location) {
    }
    
}
