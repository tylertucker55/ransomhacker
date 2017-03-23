/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import byui.cit260.ransomhacker.control.GameControl;
import byui.cit260.ransomhacker.control.RelocationControl;
import byui.cit260.ransomhacker.model.Location;
import byui.cit260.ransomhacker.model.Player;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author 50mm3r
 */
public class RelocationView extends View {
   
    public RelocationView() {
        super("List of Cities:"
                + "\nSeattle, WA      Portland, OR        Oakland, CA"
                + "\nLosAngeles, CA   SanDeigo, CA        Spokane, WA"
                + "\nRexburg, ID      SaltLakeCity, UT    LasVegas, NV"
                + "\nPhoenix, AZ      Helena, MT          Cheyenne, WY"
                + "\nDenver, CA       Albuquerque, NM     Lubbock, TX"
                + "\nElPaso, TX       Bismark, ND         RapidCity, ND"
                + "\nKansasCity, KS   Amarillo, TX        Austin, TX"
                + "\nSanAntonio, TX   McAllen, TX         Minneapolis MN"
                + "\nDesMoines, IA    StLouis, MO         Tulsa, OK"
                + "\nDallas, TX       Houston, TX         Milwaukee, WI"
                + "\nChicago, IL      Indianapolis, IN    LittleRock, AR"
                + "\nBatonRouge, LA   NewOreleans, LA     Detroit, MI"
                + "\nCleveland, OH    Cincinnati, OH      Louisville, KY"
                + "\nNashville, TN    Jackson, MS         NewYork, NY"
                + "\nPhilidelphia, PA Baltimore, MD       Richmond, VA"
                + "\nKnoxville, TN    Montgomery, AL      Boston, MA"
                + "\nTrenton, NJ      WashingtonDC, DC    Raleigh, NC"
                + "\nCharleston, SC   Atlanta, GA         Miami, FL"
                + "\nPlease enter the destination City (ex. Rexburg, ID)"
                            + "\n Enter Q to quit");
      }
    
    @Override
    public boolean doAction(String cityName) {
               
        if (cityName.length() < 2) {
            System.out.println("\nInvalid city name: "
                + "The name must be the same as the city on the list");
            return false;
            }    
       
        // ???
        //else 
          //  private void RelocationControl.calcMoveCost() {
                
          //  };
        
        boolean result = RelocationControl.moveChar(cityName);
            
        return result;
            
            
    
        }
        
       
    }
    
    
    
   