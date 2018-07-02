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
public class JoinTest {
     public static Object LOCK = new Object();
    
    public static void main(String[] args) {    
        Runnable r = () -> {
            int i = 0;
            synchronized(LOCK){
                while(i<10) {
                    System.out.println(++i + " " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(500);
                    }catch (InterruptedException ex){
                        System.out.println(ex);
                        break;
                    }
                }
            }//synch
        };
        Thread t1 = new Thread(r);
        t1.setName("Peter");
        Thread t2 = new Thread(r);
        t2.setName("Max");

        t1.start();
        t2.start();
        
        try {
          t1.join(1000);
          t2.join(1000);
          t1.interrupt();
          //join mit timer
          // t1.join(2000);
        } catch (InterruptedException ex) { //checked ex
            
        }
        
        System.out.println("------Ende Main----------");
//        
//        Thread t = new Thread(() -> {
//            
//        });
    }
}
