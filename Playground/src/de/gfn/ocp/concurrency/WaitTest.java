package de.gfn.ocp.concurrency;

/**
 *
 * @author tlubowiecki
 */
public class WaitTest {
    
    public static Thread main;
    
    public static void main(String[] args) {
        
        main = Thread.currentThread();
        
       Arbeiter a1 = new Arbeiter();
       a1.setName("Peter");
       a1.start();
       
       Arbeiter a2 = new Arbeiter();
       a2.setName("Max");
       a2.start();
       
        while (true) {
           try {
               Thread.sleep(1000); // TIME_WAITING
               synchronized(Arbeiter.class) {
                    //Arbeiter.class.notify(); // Holt einen Thread aus dem Warten raus
                    Arbeiter.class.notifyAll(); // Holt alle Threads aus dem Warten raus
               }
           } catch (InterruptedException ex) {
               break;
           }
        }
    }
}

class Arbeiter extends Thread {

    //static Object LOCK = new Object();
    static int i = 0;
    
    @Override
    public void run() {
        synchronized(Arbeiter.class) {
            try {
                System.out.println("Teilaufgabe A " + getName());
                Arbeiter.class.wait(); // WAITING
                System.out.println("Teilaufgabe B " + getName());
                Arbeiter.class.wait(); // WAITING
                System.out.println("Teilaufgabe C " + getName());
                Arbeiter.class.wait(); // WAITING
                System.out.println("Teilaufgabe D " + getName());
                Arbeiter.class.wait(); // WAITING
                System.out.println("Teilaufgabe E " + getName());
                Arbeiter.class.wait(); // WAITING
                
                new Thread(() -> System.out.println("Moin " + Thread.currentThread().getName())).start();
                
                WaitTest.main.interrupt();
                
            } catch (InterruptedException ex) {
            }
        }
    }
}
