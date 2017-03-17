/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.model.Map;

/**
 *
 * @author tylertucker
 */
public class ViewMapControl {

    public static Map createMap() {
        Map map = null;
        System.out.println("\n*** createMap() called ***");
        return map;
    }
    public int calcReductionInDetection(int detectionPercent, int distanceA, int distanceB) {
        
        if (distanceA < 0 || distanceB < 0) {
	return -1;
        }
        
        if (detectionPercent < 1) { 
	return -1;
        }
        
        int newDetectionPercent = (int) detectionPercent - ((distanceA + distanceB) * 5);
        
  
        
        return newDetectionPercent;

    }
}
