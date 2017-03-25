/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.ransomhacker.exceptions;

/**
 *
 * @author Hansen
 */
public class RansomControlException extends Exception {

    public RansomControlException() {
    }

    public RansomControlException(String message) {
        super(message);
    }

    public RansomControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public RansomControlException(Throwable cause) {
        super(cause);
    }

    public RansomControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
