package de.gfn.ocp.concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class InterruptTest {
    
    public static void main(String[] args) {
        
        Runnable r = () -> {
            while(true) {
                System.out.println("Moin...");
                    
                if(Thread.currentThread().isInterrupted()) {
                    break;
                }
            }
        };

        Thread t1 = new Thread(r);
        t1.start();
        
        
        
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
        }
        
        t1.interrupt();
    }
}
