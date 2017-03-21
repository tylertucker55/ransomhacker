/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.model.Map;
import byui.cit260.ransomhacker.model.Scene;
import byui.cit260.ransomhacker.model.Scenetype;

/**
 *
 * @author tylertucker
 */
public class ViewMapControl {

    public static Map createMap() throws ViewMapControlException{
        Map map = new Map(20,20);
        
        Scene[] scenes = ViewMapControl.createScenes();
        
        ViewMapControl.assignScenesToLocations(map, scenes);
        
        System.out.println("\n*** createMap() called ***");
        return map;
    }

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length]; 
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
