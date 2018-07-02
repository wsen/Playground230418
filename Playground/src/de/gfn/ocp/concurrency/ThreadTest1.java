package de.gfn.ocp.concurrency;

import static java.lang.Thread.sleep;

/**
 *
 * @author tlubowiecki
 */
public class ThreadTest1 {
    
    static int i = 0;
    static final Object LOCK = new Object();
    
    public static void main(String[] args) {
        
        String name = Thread.currentThread().getName();
        
        // Thread über Extends
//        Thread t1 = new OtherThread();
//        t1.start();
        
        // Thread mit Runnable-Implementierung
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
//                int i = 0;
                while(true) {
                    synchronized(LOCK) {
                        System.out.println(++i + " " + Thread.currentThread().getName());
                    }
//                    try {
//                        Thread.sleep(500);
//                    }
//                    catch(InterruptedException e) {
//                    }
                }
            }
        };
        Thread t11 = new Thread(r1);
        t11.setPriority(1);
        t11.setName("Peter");
        t11.start();
        
        // Thread über anonyme Erweiterung der Thread-Klasse
        Thread t2 = new Thread() {
            @Override
            public void run() {
//                int i = 0;
                while(true) {
                    if(i > 1000 && i < 10000)
                            yield();
                    
                    synchronized(LOCK) {
                        System.out.println(++i + " " + getName());
                    }
//                    try {
//                        sleep(500);
//                    }
//                    catch(InterruptedException e) {
//                    }
                }
            }
        };
        t2.setPriority(10);
        t2.setName("Max");
        t2.start();
        
        // Thread mit Runnable als Lambda
        new Thread(() -> {
//            int i = 0;
            while(true) {
                synchronized(LOCK) {
                    System.out.println(++i + " " + Thread.currentThread().getName());
                }
//                try {
//                    Thread.sleep(500);
//                }
//                catch(InterruptedException e) {
//                }
            }
        }).start();
        
        // Ausführung im Main-Thread
//        int i = 0;
        while(true) {
            synchronized(LOCK) {
                System.out.println(++i + " " + name);
            }
//            try {
//                Thread.sleep(100);
//            }
//            catch(InterruptedException e) {
//            }
        }
    }
}

class OtherThread extends Thread {

    @Override
    public void run() {
        
        int i = 0;
        while(true) {
            System.out.println(++i + " " + getName());
//            try {
//                sleep(100);
//            }
//            catch(InterruptedException e) {
//            }
        }
    }
}