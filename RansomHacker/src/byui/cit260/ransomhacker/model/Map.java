/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import byui.cit260.ransomhacker.view.ErrorView;
import java.io.Serializable;
/**
 *
 * @author tylertucker
 */
public class Map implements Serializable{
    
    private int rowCount;
    private int columnCount;
    public Location[][] locations;
    

      public Map() {
      }

      public Map(int noOfRows, int noOfColumns) {
          
          if (noOfRows < 1 || noOfColumns < 1) {
              ErrorView.display(this.getClass().getName(),"The number of rows and columns must be > zero");
              return;
          }
          
          this.rowCount = noOfRows;
          this.columnCount = noOfColumns;
          
          this.locations = new Location[noOfRows][noOfColumns];
          
          for(int row = 0; row < noOfRows; row++) {
              for(int column = 0; column < noOfColumns; column++) {
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
                  
                  /*
                Location.Seattle.getCoordinates();
                Location.Portland.getCoordinates();
                Location.Oakland.getCoordinates();
                Location.LosAngeles.getCoordinates();
                Location.SanDeigo.getCoordinates();
                Location.Spokane.getCoordinates();
                Location.Rexburg.getCoordinates();
                Location.SaltLakeCity.getCoordinates();
                Location.LasVegas.getCoordinates();
                Location.Phoenix.getCoordinates();
                Location.Helena.getCoordinates();
                Location.Cheyenne.getCoordinates();
                Location.Denver.getCoordinates();
                Location.Albuquerque.getCoordinates();
                Location.Lubbock.getCoordinates();
                Location.ElPaso.getCoordinates();
                Location.Bismark.getCoordinates();
                Location.RapidCity.getCoordinates();
                Location.KansasCity.getCoordinates();
                Location.Amarillo.getCoordinates();
                Location.Austin.getCoordinates();
                Location.SanAntonio.getCoordinates();
                Location.McAllen.getCoordinates();
                Location.Minneapolis.getCoordinates();
                Location.DesMoines.getCoordinates();
                Location.StLouis.getCoordinates();
                Location.Tulsa.getCoordinates();
                Location.Dallas.getCoordinates();
                Location.Houston.getCoordinates();
                Location.Milwaukee.getCoordinates();
                Location.Chicago.getCoordinates();
                Location.Indianapolis.getCoordinates();
                Location.LittleRock.getCoordinates();
                Location.BatonRouge.getCoordinates();
                Location.NewOrleans.getCoordinates();
                Location.Detroit.getCoordinates();
                Location.Cleveland.getCoordinates();
                Location.Cincinnati.getCoordinates();
                Location.Louisville.getCoordinates();
                Location.Nashville.getCoordinates();
                Location.Jackson.getCoordinates();
                Location.NewYork.getCoordinates();
                Location.Philidelphia.getCoordinates();
                Location.Baltimore.getCoordinates();
                Location.Richmond.getCoordinates();
                Location.Knoxville.getCoordinates();
                Location.Montgomery.getCoordinates();
                Location.Boston.getCoordinates();
                Location.Trenton.getCoordinates();
                Location.WashingtonDC.getCoordinates();
                Location.Raleigh.getCoordinates();
                Location.Charleston.getCoordinates();
                Location.Atlanta.getCoordinates();
                Location.Miami.getCoordinates();
                  */
              }
          }
      }
      
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.rowCount;
        hash = 37 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
      
    
    
}