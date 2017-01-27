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
public class Map implements Serializable{
    
    private int rowCount;
    private int columnCount;

      public Map() {
          
      }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
      
}
