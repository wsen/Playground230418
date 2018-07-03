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
public class InterruptedTest {
    
    public static void main(String[] args) {
    Runnable r = () -> {
        while(true) {
            System.out.println("mOIN");
            
            //Bsp
            // Thread.sleep(10); // + Try Catch Bock notwendig
//            if(Thread.currentThread().isInterrupted()){
//                break;
//            }
        }
    };
    
    Thread t1 = new Thread(r);
    t1.start();
    
    try { // für main thread
        Thread.sleep(100);
        t1.interrupt();
    } catch (InterruptedException ex) {
        
    }
    
    t1.interrupt();
    
  }

    
    
}
