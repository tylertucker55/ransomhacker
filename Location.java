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
public class Location implements Serializable {

    
    private double row;
    private double column;
    private double visited;
    
    public Location() {
    }

    public double getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public double getVisited() {
        return visited;
    }

    public void setVisited(int visited) {
        this.visited = visited;
    }
    
    
    
}
