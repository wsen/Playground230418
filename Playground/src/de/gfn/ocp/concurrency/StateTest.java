package de.gfn.ocp.concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class StateTest {
    
    public static void main(String[] args) {
        
        Object LOCK = new Object();
        
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getState());
            int i = 0;
            
                try {
                    synchronized(LOCK) {
                        LOCK.wait();
                    }
                } catch (InterruptedException ex) {
                System.out.println(Thread.currentThread().getState());
            }
        });
        
        System.out.println(t.getState());
        
        t.start();
        System.out.println(t.getState());
        
        try {
            Thread.sleep(2000);
            System.out.println(t.getState());
            synchronized(LOCK) {
                LOCK.notify();
            }
            System.out.println(t.getState());
            t.join();
        } catch (InterruptedException ex) {
        }
        
        System.out.println(t.getState());
        
        
    }
    
}
