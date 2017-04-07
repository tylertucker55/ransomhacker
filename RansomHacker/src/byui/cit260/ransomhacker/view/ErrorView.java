/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.view;

import java.io.PrintWriter;
import ransomhacker.RansomHacker;

/**
 *
 * @author tylertucker
 */
public class ErrorView {
     private static final PrintWriter errorFile = RansomHacker.getOutFile();
     private static final PrintWriter logFile = RansomHacker.getLogFile();
     
     public static void display(String className, String errorMessage) {
         errorFile.println(
                 "----------------------------------------------------"
               + "\n- ERROR - " + errorMessage
               + "\n--------------------------------------------------");
         // log error
         logFile.println(className + " - " + errorMessage);
     }
}
