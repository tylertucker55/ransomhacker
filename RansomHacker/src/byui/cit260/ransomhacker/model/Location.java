/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author tylertucker
 */
public enum Location implements Serializable {

    Seattle(1,1),
    Portland(2,1),
    Oakland(3,1),
    LosAngeles(4,1),
    SanDeigo(5,1),
    Spokane(1,2),
    Rexburg(2,2),
    SaltLakeCity(3,2),
    LasVegas(4,2),
    Phoenix(5,2),
    Helena(1,3),
    Cheyenne(2,3),
    Denver(3,3),
    Albuquerque(4,3),
    Lubbock(5,3),
    ElPaso(6,3)
    
    ;
    
    
    
    
    private final Point coordinates;

    Location(int row, int column) {
    this.coordinates = new Point(row, column);
}

    public Point getCoordinates() {
        return coordinates;
    }

    
    
    
}
