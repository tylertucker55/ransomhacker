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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.job);
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + this.skillRequired;
        hash = 19 * hash + this.detectionCost;
        hash = 19 * hash + this.timeCost;
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.chanceOfSuccess) ^ (Double.doubleToLongBits(this.chanceOfSuccess) >>> 32));
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
        final Attack other = (Attack) obj;
        if (this.skillRequired != other.skillRequired) {
            return false;
        }
        if (this.detectionCost != other.detectionCost) {
            return false;
        }
        if (this.timeCost != other.timeCost) {
            return false;
        }
        if (Double.doubleToLongBits(this.chanceOfSuccess) != Double.doubleToLongBits(other.chanceOfSuccess)) {
            return false;
        }
        if (!Objects.equals(this.job, other.job)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Attack{" + "job=" + job + ", name=" + name + ", skillRequired=" + skillRequired + ", detectionCost=" + detectionCost + ", timeCost=" + timeCost + ", chanceOfSuccess=" + chanceOfSuccess + '}';
    }
    
    
}
