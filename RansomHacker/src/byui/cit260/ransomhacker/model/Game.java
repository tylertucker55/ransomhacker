/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author 50mm3r
 */
public class Game implements Serializable {

    private int daysLeft;
    private Map map;
    private Player player;
    private Character character;
    private Item[] items;
    private Attack[] attacks;
    private SkillDevelopment[] skills;
    
   
    
          
            
    
    public Game() {
     
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Attack[] getAttacks() {
        return attacks;
    }

    public void setAttacks(Attack[] attacks) {
        this.attacks = attacks;
    }

    public SkillDevelopment[] getSkills() {
        return skills;
    }

    public void setSkills(SkillDevelopment[] skills) {
        this.skills = skills;
    }
    
    
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
    
    public int getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.daysLeft;
        hash = 23 * hash + Objects.hashCode(this.map);
        hash = 23 * hash + Objects.hashCode(this.player);
        hash = 23 * hash + Objects.hashCode(this.character);
        hash = 23 * hash + Objects.hashCode(this.attacks);
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
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (!Objects.equals(this.character, other.character)) {
            return false;
        }
        if (!Objects.equals(this.attacks, other.attacks)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "daysLeft=" + daysLeft + ", map=" + map + ", player=" + player + ", character=" + character + ", attacks=" + attacks + '}';
    }


    
}
