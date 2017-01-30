
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
 * @author muhile
 */
public class SkillDevelopent implements Serializable {

    
    private String name;
    private String description;
	private double moneyCost;
	private double timeCost;
	private double value;
	private String state;
    
    public SkillDevelopent() {
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

	public double getMoneyCost() {
        return moneyCost;
    }

    public void setMoneyCost(double moneyCost) {
        this.moneyCost = moneyCost;
    }
	
	public double getTimeCost() {
        return timeCost;
    }

    public void setTimeCost(double timeCost) {
        this.timeCost = timeCost;
    }
	
	public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
	
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.moneyCost) ^ (Double.doubleToLongBits(this.moneyCost) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.timeCost) ^ (Double.doubleToLongBits(this.timeCost) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.state);
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
        final SkillDevelopent other = (SkillDevelopent) obj;
        if (Double.doubleToLongBits(this.moneyCost) != Double.doubleToLongBits(other.moneyCost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeCost) != Double.doubleToLongBits(other.timeCost)) {
            return false;
        }
        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SkillDevelopent{" + "name=" + name + ", description=" + description + ", moneyCost=" + moneyCost + ", timeCost=" + timeCost + ", value=" + value + ", state=" + state + '}';
    }
    
    
    
}