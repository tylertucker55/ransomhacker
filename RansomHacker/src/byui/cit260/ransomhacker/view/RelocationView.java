/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.control.RelocationControl;
import byui.cit260.ransomhacker.model.Player;
import java.util.Scanner;

/**
 *
 * @author 50mm3r
 */
public class RelocationView extends View {
   
    public RelocationView() {
        super("\nPlease enter the destination City (ex. Rexburg, ID)"
                            + "\n Enter Q to quit");
      }
    
    @Override
    public boolean doAction(String cityName) {
               
        if (cityName.length() < 2) {
            System.out.println("\nInvalid city name: "
                + "The name must be in the format [City, ST]");
            return false;
            }    
        // else RelocationControl.calcMoveCost(A, B, C, D, E); To be added when values are populated   
        
        boolean result = RelocationControl.moveChar(cityName);
            
        return result;
            
            
    
        }
        
       
    }
    
    
    
   