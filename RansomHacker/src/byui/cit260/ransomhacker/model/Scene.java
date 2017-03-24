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
 * @author muhile
 */
public class Scene implements Serializable {

    private Location location;
    ArrayList<Job> jobs;
    ArrayList<Store> itemsAvailable;
    ArrayList<SkillDevelopment> courses;
    private int size;
    private String symbol;
    
    
    
    public Scene(){
        this.jobs = new ArrayList<>();
        this.itemsAvailable = new ArrayList<Store>();
        this.courses = new ArrayList<>();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    
    
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public ArrayList<Store> getItemsAvailable() {
        return itemsAvailable;
    }

    public void setItemsAvailable(ArrayList<Store> itemsavailable) {
        this.itemsAvailable = itemsavailable;
    }

    public ArrayList<SkillDevelopment> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<SkillDevelopment> courses) {
        this.courses = courses;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.location);
        hash = 41 * hash + Objects.hashCode(this.jobs);
        hash = 41 * hash + Objects.hashCode(this.itemsAvailable);
        hash = 41 * hash + Objects.hashCode(this.courses);
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
        final Scene other = (Scene) obj;
        if (this.location != other.location) {
            return false;
        }
        if (!Objects.equals(this.jobs, other.jobs)) {
            return false;
        }
        if (!Objects.equals(this.itemsAvailable, other.itemsAvailable)) {
            return false;
        }
        if (!Objects.equals(this.courses, other.courses)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Scene{" + "location=" + location + ", jobs=" + jobs + ", itemsAvailable=" + itemsAvailable + ", courses=" + courses + '}';
    }
    
    
    
}