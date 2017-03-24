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
 * @author Brandon
 */
public enum Attack implements Serializable {

    Bruteforce("Brute Force", 5, 0, 60, 3, 70),
    SocialEngineering("Social Engineering", 2, 5, 30, 2, 80),
    XSS("XSS Attack", 4, 3, 30, 1, 80),
    DDoS("DDoS Attack", 9, 2, 40, 1, 100),
    SQLInjection("SQL Injection Attack", 7, 2, 30, 1, 90),
    Phishing("Phishing Attack", 3, 7, 10, 2, 70),
    FollowOnlineTutorial("Google It", 1, 1, 10, 3, 30);
   
    private final String name;
    private final int hackingRequired;
    private final int socialRequired;
    private final int detectionCost; 
    private final int timeCost;
    private final double chanceOfSuccess;
    
    Attack(String name, int hackingRequired, int socialRequired, int detectionCost, int timeCost, double chanceOfSuccess) {
        this.name = name;
        this.hackingRequired = hackingRequired;
        this.socialRequired = socialRequired;
        this.detectionCost = detectionCost;
        this.timeCost = timeCost;
        this.chanceOfSuccess = chanceOfSuccess;
}
    public String getName() {
        return name;
    }
    
    public int gethackingRequired() {
        return hackingRequired;
    }

    public int getsocialRequired() {
        return socialRequired;
    }

    public int getDetectionCost() {
        return detectionCost;
    }
    
    public int getTimeCost() {
        return timeCost;
    }

    public double getChanceOfSuccess() {
        return chanceOfSuccess;
    }
    
}