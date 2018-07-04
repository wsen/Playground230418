package de.gfn.ocp.concurrency;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class SynchroTest2 {
    
    public static void main(String[] args) {
        
        new Thread(() -> {
            SynchClass1.machWasStatic();
        }).start();
        
        new Thread(() -> {
            SynchClass1.machWasAnderesStatic();
        }).start();
        
        try {
            Thread.sleep(5000);
            SynchClass1.setExit(true);
        } catch (InterruptedException ex) {
        }
        
    }
    
}

class SynchClass1 {
    
    static boolean exit = false;
    
    static Object machWasLOCK = new Object();
    static Object machWasAnderesLOCK = new Object();

    public static void setExit(boolean exit) {
        SynchClass1.exit = exit;
    }
    
    static void machWasStatic() {
        synchronized(machWasLOCK) {
            while(!exit) {
                System.out.println("Moin machWas");
            }
        }
    }
    
    static void machWasAnderesStatic() {
        synchronized(machWasAnderesLOCK) {
            while(!exit) {
                System.out.println("Moin machWasAnderes");
            }
        }
    }
}
