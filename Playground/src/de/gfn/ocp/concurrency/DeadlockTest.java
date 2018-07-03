package de.gfn.ocp.concurrency;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class DeadlockTest {
    
    public static void main(String[] args) {
        
        Object o1 = new Object();
        Object o2 = new Object();
        
        new Thread(() -> {
            while(true) {
                synchronized(o1) { // o1
                    synchronized(o2) { // o2
                        System.out.println(Thread.currentThread().getName() + " " + o1 + ", " + o2);
                    }
                }
            }
        }, "Peter").start();
        new Thread(() -> {
            while(true) {
                synchronized(o2) { // o2
                    synchronized(o1) { // o1
                        System.out.println(Thread.currentThread().getName() + " " + o1 + ", " + o2);
                    }
                }
            }
        }, "Bruce").start();
        
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        sucheDeadLock();
    }
    
    static void sucheDeadLock() {
        
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        long[] ids = bean.findMonitorDeadlockedThreads();
        
        System.out.println("Deadlocks:");
        
        for(long id : ids) {
            System.out.println(id);
        }
    }
}
