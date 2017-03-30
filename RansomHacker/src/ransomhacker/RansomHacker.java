/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransomhacker;

import byui.cit260.ransomhacker.model.Game;
import byui.cit260.ransomhacker.model.Player;
import byui.cit260.ransomhacker.view.SaveGameView;
import byui.cit260.ransomhacker.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


       
  


/**
 *
 * @author Hansen
 */
public class RansomHacker {

    
    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        RansomHacker.logFile = logFile;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        RansomHacker.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        RansomHacker.inFile = inFile;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
        StartProgramView startProgramView = new StartProgramView();
        
        try {
            RansomHacker.inFile = new BufferedReader(new InputStreamReader(System.in));
            RansomHacker.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            RansomHacker.logFile = new PrintWriter(filePath);
            startProgramView.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }
      
        finally {
            try {
                if (RansomHacker.inFile != null)
                        RansomHacker.inFile.close();
                
                if (RansomHacker.outFile != null)
                RansomHacker.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error CLosing files");
                return;
            }
            
        }
    }
    
     public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        RansomHacker.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        RansomHacker.player = player;
    }
    
   
    
    
    
}
