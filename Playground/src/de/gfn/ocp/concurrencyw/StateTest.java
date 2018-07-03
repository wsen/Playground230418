/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.concurrencyw;

/**
 *
 * @author student
 */
public class StateTest {
    public static void main(String[] args) {
        
        Object LOCK = new Object();
        
        Thread t = new Thread(() -> {
            int i = 0;
            //while(i <2) {
                try {
                    synchronized(LOCK) {
                        LOCK.wait();                        
                        //Thread.sleep(5000);
                    }
                } catch (InterruptedException ex) {
                    
                }
                System.out.println(Thread.currentThread().getState());
                i++;
            //}
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
        } catch (InterruptedException ex){
            System.out.println(Thread.currentThread().getState());
        }
        
    }
    
   
}
