/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransomhacker;

import java.io.Serializable;

/**
 *
 * @author tylertucker
 */
public class Attack implements Serializable {

    // Attributes
    
    private String job;
    private String name;
    private int skillRequired;
    private int detectionCost; 
    private int timeCost;
    private double chanceOfSuccess;
    
    // Default Constructor
    public Attack() {
    }
    
    // Public getter function

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkillRequired() {
        return skillRequired;
    }

    public void setSkillRequired(int skillRequired) {
        this.skillRequired = skillRequired;
    }

    public int getDetectionCost() {
        return detectionCost;
    }

    public void setDetectionCost(int detectionCost) {
        this.detectionCost = detectionCost;
    }

    public int getTimeCost() {
        return timeCost;
    }

    public void setTimeCost(int timeCost) {
        this.timeCost = timeCost;
    }

    public double getChanceOfSuccess() {
        return chanceOfSuccess;
    }

    public void setChanceOfSuccess(double chanceOfSuccess) {
        this.chanceOfSuccess = chanceOfSuccess;
    }
    
    
}
