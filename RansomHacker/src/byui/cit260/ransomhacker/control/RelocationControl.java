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

/**
 *
 * @author 50mm3r
 */
public class RelocationControl {    
    
    public double calcMoveCost() {
        //No clue what this does, but without it there are errors
        Character move = new Character();
        //All Values set to 0 until I figure out what the heck static means
        //Trying to set the currentcoord values to the players location
        //And to set new coord to the values of the players city selection
        int timesMoved = 0;
        double currentCoordX = 0;
        double currentCoordY = 0;
        double newCoordX = 0; 
        double newCoordY = 0;
        
        double distance = Point.distance(newCoordX, currentCoordX, newCoordY, currentCoordY);
         if (distance == 0) {
            return -1;
        }
        
        double moveCost;
        moveCost = (distance * 100) + (timesMoved * 100);
        
        //Checks Money
        double money = GameControl.character.getMoney();
            if (money < moveCost) {
                return -1;
            } 
        //Subtracts cost of move from the character
            else GameControl.character.setMoney(money - moveCost);
        //Adds one to the Move counter
                 timesMoved = move.getTimesMoved();
                 GameControl.character.setTimesMoved(timesMoved++);
        
        
        return moveCost;
    }
        //Moves Character
    public static boolean moveChar(String cityName) {
       // GameControl.character.setLocation(Location.valueOf(cityName));
        return true;
        
    } 

  

   
 
    
    
    
}
