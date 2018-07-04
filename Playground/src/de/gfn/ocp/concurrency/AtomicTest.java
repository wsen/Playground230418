package de.gfn.ocp.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author tlubowiecki
 */
public class AtomicTest {
    
    static AtomicInteger count = new AtomicInteger(0);
    static Integer j = 0;
    
    public static void main(String[] args) {
        
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                j++;
                count.incrementAndGet();
            }
        });
        
        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                j++;
                count.incrementAndGet();
            }
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        System.out.println(j);
        System.out.println(count);
    }
}
