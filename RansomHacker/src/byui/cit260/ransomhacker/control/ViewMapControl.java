/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.control;

import byui.cit260.ransomhacker.model.Location;
import byui.cit260.ransomhacker.model.Map;
import byui.cit260.ransomhacker.model.Scene;
import java.awt.Point;

/**
 *
 * @author tylertucker
 */
public class ViewMapControl {
    
    
    public static Location locations[][];
    
    public static Map createMap() {
        
        Map map = new Map(7,9);
       
        Scene[] scenes = ViewMapControl.createScenes();
        
        //ViewMapControl.assignScenesToLocations(map, scenes);
        
        return map;
    }


    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneList.values().length];
        
        Scene seattle = new Scene();
        seattle.setSize(SceneList.Seattle.size);
        seattle.setSymbol(SceneList.Seattle.symbol);
        scenes[SceneList.Seattle.ordinal()] = seattle;
        
        Scene portland = new Scene();
        scenes[SceneList.Portland.ordinal()] = portland;
        
        Scene oakland = new Scene();
        scenes[SceneList.Oakland.ordinal()] = oakland;
        
        
        return scenes;
    }
    
    public enum SceneList {
    Seattle(4,"[WA]",1,1),
    Portland(3,"[OR]",2,1),
    Oakland(4,"[CA]",3,1),
    LosAngeles(5,"[CA]",4,1),
    SanDiego(4,"[CA]",5,1),
    Spokane(2,"[WA]",1,2),
    Rexburg(1,"[ID]",2,2),
    SaltLakeCity(3,"[UT]",3,2),
    LasVegas(3,"[NV]",4,2),
    Phoenix(5,"[AZ]",5,2),
    Helena(2,"[MT]",1,3),
    Cheyenne(1,"[WY]",2,3),
    Denver(4,"[CO]",3,3),
    Albuquerque(3,"[NM]",4,3),
    Lubbock(3,"[TX]",5,3),
    ElPaso(4,"[TX]",6,3),
    Bismark(1,"[ND]",1,4),
    RapidCity(1,"[SD]",2,4),
    KansasCity(3,"[KS]",3,4),
    Amarillo(2,"[TX]",4,4),
    Austin(4,"[TX]",5,4),
    SanAntonio(4,"[TX]",6,4),
    McAllen(3,"[TX]",7,4),
    Minneapolis(4,"[MN]",1,5),
    DesMoines(2,"[IA]",2,5),
    StLouis(4,"[MO]",3,5),
    Tulsa(3,"[OK]",4,5),
    Dallas(4,"[TX]",5,5),
    Houston(5,"[TX]",5,6),
    Milwaukee(3,"[WI]",1,6),
    Chicago(5,"[IL]",2,6),
    Indianapolis(3,"[IN]",3,6),
    LittleRock(2,"[AR]",4,6),
    BatonRouge(2,"[LA]",5,6),
    NewOrleans(3,"[LA]",6,6),
    Detroit(4,"[MI]",1,7),
    Cleveland(3,"[OH]",2,7),
    Cincinnati(3,"[OH]",3,7),
    Louisville(2,"[KY]",4,7),
    Nashville(3,"[TN]",5,7),
    Jackson(2,"[MS]",6,7),
    NewYork(5,"[NY]",1,8),
    Philidelphia(5,"[PA]",2,8),
    Baltimore(4,"[MD]",3,8),
    Richmond(3,"[VA]",4,8),
    Knoxville(1,"[TN]",5,8),
    Montgomery(1,"[AL]",6,8),
    Boston(5,"[MA]",1,9),
    Trenton(2,"[NJ]",2,9),
    WashingtonDC(5,"[DC]",3,9),
    Raleigh(2,"[NC]",4,9),
    Charleston(2,"[SC]",5,9),
    Atlanta(5,"[GA]",6,9),
    Miami(2,"[FL]",7,9);
        
    
        private int column;
        private int row;
        private String symbol;
        private int size;

        public int getColumn() {
            return column;
        }

        public void setColumn(int column) {
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public void setRow(int row) {
            this.row = row;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    
    
        
        
    SceneList(int size, String symbol, int row, int column) {
    this.column = column;
    this.row = row;
    this.symbol = symbol;
    this.size = size;
}
    }

    /* private static void assignScenesToLocations(Map map, Scene[] scenes) {
        locations[0][0].setScene(scenes[SceneList.Seattle.ordinal()]);
        locations[1][0].setScene(scenes[SceneList.Portland.ordinal()]);
        locations[2][0].setScene(scenes[SceneList.Oakland.ordinal()]);
        locations[3][0].setScene(scenes[SceneList.LosAngeles.ordinal()]);
        locations[4][0].setScene(scenes[SceneList.SanDiego.ordinal()]);
        locations[0][1].setScene(scenes[SceneList.Spokane.ordinal()]);
        locations[1][1].setScene(scenes[SceneList.Rexburg.ordinal()]);
        locations[2][1].setScene(scenes[SceneList.SaltLakeCity.ordinal()]);
        locations[3][1].setScene(scenes[SceneList.LasVegas.ordinal()]);
        locations[4][1].setScene(scenes[SceneList.Phoenix.ordinal()]);
        locations[0][2].setScene(scenes[SceneList.Helena.ordinal()]);
        locations[1][2].setScene(scenes[SceneList.Cheyenne.ordinal()]);
        locations[2][2].setScene(scenes[SceneList.Denver.ordinal()]);
        locations[3][2].setScene(scenes[SceneList.Albuquerque.ordinal()]);
        locations[4][2].setScene(scenes[SceneList.Lubbock.ordinal()]);
        locations[5][2].setScene(scenes[SceneList.ElPaso.ordinal()]);
        locations[0][3].setScene(scenes[SceneList.Bismark.ordinal()]);
        locations[1][3].setScene(scenes[SceneList.RapidCity.ordinal()]);
        locations[2][3].setScene(scenes[SceneList.KansasCity.ordinal()]);
        locations[3][3].setScene(scenes[SceneList.Amarillo.ordinal()]);
        locations[4][3].setScene(scenes[SceneList.Austin.ordinal()]);
        locations[5][3].setScene(scenes[SceneList.SanAntonio.ordinal()]);
        locations[6][3].setScene(scenes[SceneList.McAllen.ordinal()]);
        locations[0][4].setScene(scenes[SceneList.Minneapolis.ordinal()]);
        locations[1][4].setScene(scenes[SceneList.DesMoines.ordinal()]);
        locations[2][4].setScene(scenes[SceneList.StLouis.ordinal()]);
        locations[3][4].setScene(scenes[SceneList.Tulsa.ordinal()]);
        locations[4][4].setScene(scenes[SceneList.Dallas.ordinal()]);
        locations[5][4].setScene(scenes[SceneList.Houston.ordinal()]);
        locations[0][5].setScene(scenes[SceneList.Milwaukee.ordinal()]);
        locations[1][5].setScene(scenes[SceneList.Chicago.ordinal()]);
        locations[2][5].setScene(scenes[SceneList.Indianapolis.ordinal()]);
        locations[3][5].setScene(scenes[SceneList.LittleRock.ordinal()]);
        locations[4][5].setScene(scenes[SceneList.BatonRouge.ordinal()]);
        locations[5][5].setScene(scenes[SceneList.NewOrleans.ordinal()]);
        locations[0][6].setScene(scenes[SceneList.Detroit.ordinal()]);
        locations[1][6].setScene(scenes[SceneList.Cleveland.ordinal()]);
        locations[2][6].setScene(scenes[SceneList.Cincinnati.ordinal()]);
        locations[3][6].setScene(scenes[SceneList.Louisville.ordinal()]);
        locations[4][6].setScene(scenes[SceneList.Nashville.ordinal()]);
        locations[5][6].setScene(scenes[SceneList.Jackson.ordinal()]);
        locations[0][7].setScene(scenes[SceneList.NewYork.ordinal()]);
        locations[1][7].setScene(scenes[SceneList.Philidelphia.ordinal()]);
        locations[2][7].setScene(scenes[SceneList.Baltimore.ordinal()]);
        locations[3][7].setScene(scenes[SceneList.Richmond.ordinal()]);
        locations[4][7].setScene(scenes[SceneList.Knoxville.ordinal()]);
        locations[5][7].setScene(scenes[SceneList.Montgomery.ordinal()]);
        locations[0][8].setScene(scenes[SceneList.Boston.ordinal()]);
        locations[1][8].setScene(scenes[SceneList.Trenton.ordinal()]);
        locations[2][8].setScene(scenes[SceneList.WashingtonDC.ordinal()]);
        locations[3][8].setScene(scenes[SceneList.Raleigh.ordinal()]);
        locations[4][8].setScene(scenes[SceneList.Charleston.ordinal()]);
        locations[5][8].setScene(scenes[SceneList.Atlanta.ordinal()]);
        locations[6][8].setScene(scenes[SceneList.Miami.ordinal()]);
    */
       
        
        
        
        
        
        
        
    }
   
    
    /*public int calcReductionInDetection(int detectionPercent, int distanceA, int distanceB) {
    
        if (distanceA < 0 || distanceB < 0) {
	return -1;
        }
        
        if (detectionPercent < 1) { 
	return -1;
        }
        
        int newDetectionPercent = (int) detectionPercent - ((distanceA + distanceB) * 5);
        
  
        
        return newDetectionPercent;
    }
*/

 //  public static Location[][] getLocations() {
  //      return locations;
   // }

 //   public static void setLocations(Location[][] locations) {
   //     ViewMapControl.locations = locations;
   // }

//}