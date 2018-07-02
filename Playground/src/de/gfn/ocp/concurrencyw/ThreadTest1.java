/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.concurrencyw;

/**
 * Threads mit start gestartet und in run ausgeführt
 * Look at: Thread.java -> Start, Run-Methode
 * @author student
 */


public class ThreadTest1 {
    public static void main(String[] args) {
        //hier noch sequentiell
        System.out.println("Dös is thread: " + Thread.currentThread().getName());
        
        //jetzt aber aufSplittin in 2. Thread
        String name = Thread.currentThread().getName();
        //new OtherThread().start();
        Thread t1 = new OtherThread();
        t1.start();
//        t1.start(); // bei wiederholter Thread Startung -> Exception !!
//        t1.start();

//        t1.notify(); //Illegal Monitor Exception -> Commands dürfen nur in einem Sync-Block ausgeführt werden.
//        // vgl. Semafore
        
        // Thread mit Runnable Implementierung
        // Runnable erzeugen und an Thread übergeben
        Runnable r1 = new Runnable() { //anonyme innere Klasse
            @Override
            public void run() {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                int i = 0;
                while(true) {
//                    synchronized() {
                        System.out.println(++i + " " + Thread.currentThread().getName());
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {

                        }
//                    } //synchr
                }
            }
            
            
        };
        
        //searching for notify
//        Object o = new Object();
//        o.
        
        //Nicht Parallele Ausführung:
        new Thread(r1).start(); //Neuer Threas wird abgesplittet
        
        //Thread über anonyme Erweiter der Thread-Klasse
        Thread t2 = new Thread() {
            int i = 0;
            while(true) {
                System.out.println(++i + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100); //statische Ausführung (da in main)
                } catch (InterruptedException e) {

                }
            }
        };
        t2.start();
        
        //Thread mit Runnable als Lambda
        new Thread(() -> {
            int i = 0;
            while(true) {
                System.out.println(++i + " " + Thread.currentThread().getName());
                try {
                    Thread.sleep(100); //statische Ausführung (da in main)
                } catch (InterruptedException e) {

                }
            }
        }).start();
        
        // Ausführung in Main-Thread
        int i = 0;
        while(true) {
            System.out.println(++i + " " + name);
            try {
                Thread.sleep(100); //statische Ausführung (da in main)
            } catch (InterruptedException e) {
                
            }
        }
    }
}

class OtherThread extends Thread {

    @Override
    public void run() {
        System.out.println("noch so aana: " + getName());
        // super.run(); //To change body of generated methods, choose Tools | Templates.
        
        int i = 0;
        while(true) {
            System.out.println(++i + " " + getName());
            try {
                Thread.sleep(100); //statische Ausführung (da in main)
            } catch (InterruptedException e) {
                
            }
        }
    }
    
}