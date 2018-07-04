package de.gfn.ocp.concurrency;

import java.awt.Point;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class ReentrantLockTest {
    
    private static final Lock LOCK = new ReentrantLock();
    final static Point point = new Point();
    
    public static void main(String[] args) {
        
        Runnable r = new Runnable() {
            @Override
            public void run() {
                
                int x = (int)(Math.random() * 1000); 
                int y = x;
                
                while(true) {
                    
                    LOCK.lock();
                    
                    point.x = x;
                    point.y = y;
                    
//                    try {
//                        LOCK.wait();
//                    } catch (InterruptedException ex) {
//                        System.out.println(ex);
//                    }
                    
                    int nx = point.x;
                    int ny = point.y;
                    
                    LOCK.unlock();
                    
                    if(nx != ny) {
                        System.out.println("Problem: x = " + nx + ", y = " + ny);
                        break;
                    }
                    
                    
//                    if(LOCK.tryLock()) {
//                        try {
//                          //...  
//                        } 
//                        finally {
//                            LOCK.unlock();
//                        }
//                    }
                    
//                    try {
//                        LOCK.lockInterruptibly();
//                        try {
//                        //...  
//                        } 
//                        finally {
//                          LOCK.unlock();
//                        }
//                    }
//                    catch(InterruptedException ex) {
//                        System.out.println(ex);
//                    }
                    
                    
                }
            }
        };
        
        new Thread(r).start();
        new Thread(r).start();
        
    }
    
}
