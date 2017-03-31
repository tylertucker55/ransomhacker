/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.model.Character;
import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.model.Location;
import java.awt.Point;
import java.io.Serializable;
import byui.cit260.ransomhacker.model.Scene;
import byui.cit260.ransomhacker.exceptions.RelocationControlException;

/**
 *
 * @author 50mm3r
 */
public class RelocationControl implements Serializable {

    public static void calcMoveCost(Character character, Point cityLocation) throws RelocationControlException {
        //Check Inputs
        if (character == null) {
            throw new RelocationControlException("No character detected");
        }
        if (cityLocation.x > 7 || cityLocation.y > 9) {
            throw new RelocationControlException("Coordinates are not valid");
        }
        //Declare Variables
        Point charLocation = character.getCharLocation();
        int timesMoved = character.getTimesMoved();
        //Calc distance
        double distance = Point.distance(charLocation.x, cityLocation.x, charLocation.y, cityLocation.y);
        //Check distance 
        if (distance == 0) {
            throw new RelocationControlException("Can't move to your existing location");
        }
        //Calc Move Cost
        double moveCost;
        moveCost = (distance * 100) + (timesMoved * 100);

        //Checks Money
        double money = character.getMoney();
        if (money < moveCost) {
            throw new RelocationControlException("Not enough money to move");
        } //Subtracts cost of move from the character
        else {
            character.setMoney(money - moveCost);
        }

        //Lowers Detection
        double detection = character.getDetection();
        double newDetection = detection - (distance * 10);
        //Subtracts detection from the character
        character.setDetection(newDetection);

        //Adds one to the Move counter
        character.setTimesMoved(timesMoved++);
        
    }
    //Moves Character

    public static boolean moveChar(String cityName, Character character) {
        character.setCharLocation(Scene.valueOf(cityName).getCoordinates());
        return true;

    }

}
