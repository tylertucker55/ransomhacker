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

/**
 *
 * @author 50mm3r
 */
public class RelocationControl implements Serializable {

    public static boolean calcMoveCost(Character character, Point cityLocation) {
        //Check Inputs
        if (character == null) {
            return false;
        }
        if (cityLocation.x > 7 || cityLocation.y > 9) {
            return false;
        }
        //Declare Variables
        Point charLocation = character.getCharLocation();
        int timesMoved = character.getTimesMoved();
        //Calc distance
        double distance = Point.distance(charLocation.x, cityLocation.x, charLocation.y, cityLocation.y);
        //Check distance 
        if (distance == 0) {
            return false;
        }
        //Calc Move Cost
        double moveCost;
        moveCost = (distance * 100) + (timesMoved * 100);

        //Checks Money
        double money = character.getMoney();
        if (money < moveCost) {
            return false;
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
        return true;
    }
    //Moves Character

    public static boolean moveChar(String cityName, Character character) {
        character.setCharLocation(Scene.valueOf(cityName).getCoordinates());
        return true;

    }

}
