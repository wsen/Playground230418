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
public class WaitTest {
    public static void main(String[] args) {
//        Object o = new Object();
//        
//        try {
//            o.wait();
//        } catch (InterruptedException ex) {
//            System.out.println(ex);
//        }

          Arbeiter a1 = new Arbeiter();
          a1.setName("Peter");
          a1.start();

          Arbeiter a2 = new Arbeiter();
          a2.setName("Max");
          a2.start();
          
          while (true) {
              try {
                Thread.sleep(1000); // TIME WAITING
                
                synchronized(Arbeiter.LOCK) {
                    Arbeiter.LOCK.notify();     // Holt einen Trhread asu dem War4ten raus
                    //Arbeiter.LOCK.notifyAll(); // Beide Threads aus Wartezustand geholt
                }
              } catch (InterruptedException ex) {
                  break; //interrupt od. syste.exit(0)(ungeordnet) zum Ausstieg 
              }
          }
    }
}

class Arbeiter extends Thread {
    
    static Object LOCK = new Object();
    static int i = 0;
    
    @Override
    public void run() {
       while(true){
          
           //synchronized(Arbeiter.class){ //wenn ohne LOCK dann Arbeiter.class -> überall gegen Lock getauscht und ohne static Object LOCK
           synchronized(LOCK){
                try {
                   System.out.println(++i + " " + getName());
                    LOCK.wait();    //WAIT           
                    //wait();
               } catch (InterruptedException ex){

               }
           }
       }
    }   
}

