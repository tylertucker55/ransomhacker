package byui.cit260.ransomhacker.exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class RelocationControlException extends Exception{

    public RelocationControlException() {
    }

    public RelocationControlException(String message) {
        super(message);
    }

    public RelocationControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public RelocationControlException(Throwable cause) {
        super(cause);
    }

    public RelocationControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
