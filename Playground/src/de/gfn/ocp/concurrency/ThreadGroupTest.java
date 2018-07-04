package de.gfn.ocp.concurrency;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class ThreadGroupTest {
    
    public static void main(String[] args) {
        
        Runnable r = () -> {
            while(true) {
                System.out.println("Hallo " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                    break;
                }
            }
        };
        
        ThreadGroup tg1 = new ThreadGroup("Meine Threads");
        
        new Thread(tg1, r, "Peter").start();
        new Thread(tg1, r, "Bob").start();
        new Thread(tg1, r, "Andrew").start();
        
        System.out.println(tg1.getName());
        tg1.list();
        
        tg1.interrupt();
    }
}
