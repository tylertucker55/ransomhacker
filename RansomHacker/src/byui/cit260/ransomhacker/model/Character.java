/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
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
public Point charLocation;
private double money;
private int daysLeft;
private double detection;
private double moneyLeft;
private double amountPaid;
private int timesMoved;
private int hackingLevel;
private int socialLevel;
private int precisionLevel;
private int speedLevel;
private int stealthLevel;
private ArrayList<Item>  inventory = new ArrayList<>();
private Skill[] skillLevels; 
  
public Character() {
    
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

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
    
    public Point getCharLocation() {
        return charLocation;
    }

    public void setCharLocation(Point charLocation) {
        this.charLocation = charLocation;
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

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
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

    public Skill[] getSkillLevels() {
        return skillLevels;
    }

    public void setSkillLevels(Skill[] skillLevels) {
        this.skillLevels = skillLevels;
    }
    
}