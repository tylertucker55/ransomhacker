/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

/**
 *
 * @author 50mm3r
 */
public class RelocationControl {

    public static boolean moveChar(String cityName) {
        System.out.println("MoveChar() Called");
        return true;
        
    }
   
    public double calcMoveCost(int timesMoved, int newCoordX, int newCoordY, int currentCoordX, int currentCoordY) {
        
        int distance = (Math.abs(newCoordX - currentCoordX) + Math.abs(newCoordY - currentCoordY));
        
        if (distance == 0) {
            return -1;
        }
        
        double moveCost;
        moveCost = (distance * 100) + (timesMoved * 100);
        
        return moveCost;
    }
}
