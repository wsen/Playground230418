package de.gfn.ocp.concurrency;

/**
 *
 * @author tlubowiecki
 */
public class JoinTest {
    
    public static Object LOCK = new Object();
    
    public static void main(String[] args) {
        
        Runnable r = () -> {
            int i = 0;
            synchronized(LOCK) {
                while(i < 10) {
                    System.out.println(++i + " " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                        break;
                    }
                }
            }
        };
        
        Thread t1 = new Thread(r);
        t1.setName("Peter");
        Thread t2 = new Thread(r);
        t2.setName("Max");
        
        t1.start();
        t2.start();
        
        try {
            t1.join(2000);
            t2.join(2000);
            t1.interrupt();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        
        System.out.println("----- ENDE MAIN -----");
    }
}
