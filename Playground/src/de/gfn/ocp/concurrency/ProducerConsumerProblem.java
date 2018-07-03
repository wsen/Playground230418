package de.gfn.ocp.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class ProducerConsumerProblem {
    
    public static void main(String[] args) {
        
        Lager lager = new Lager();
        
        Holzfaeller hf1 = new Holzfaeller(lager);
        Thread t1 = new Thread(hf1, "Bob");
        t1.start();
        
        Holzfaeller hf2 = new Holzfaeller(lager);
        Thread t2 = new Thread(hf2, "Hans");
        t2.start();
        
        Holzfaeller hf3 = new Holzfaeller(lager);
        Thread t3 = new Thread(hf3, "John");
        t3.start();
        
        Haendler hl1 = new Haendler(lager);
        Thread t6 = new Thread(hl1, "Peter");
        t6.start();
    }
}

class Lager {
    
    private final List<Holz> holz = new ArrayList<>(10);
    
    public synchronized void einlagern() {
        System.out.println("Holzfäller ("+ Thread.currentThread().getName() + "): will einlagern");
        while(holz.size() == 10) {
            try {
                System.out.println("Holzfäller ("+ Thread.currentThread().getName() + "): wartet");
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        holz.add(new Holz());
        System.out.println("Holzfäller ("+ Thread.currentThread().getName() + "): hat Holz eingelagert, Bestand: " + holz.size());
        this.notifyAll();
    }
    
    public synchronized Holz abholen() {
        
        System.out.println("Händler ("+ Thread.currentThread().getName() + "): will abholen");
        while(holz.size() == 0) {
            try {
                System.out.println("Händler ("+ Thread.currentThread().getName() + "): wartet");
                this.wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        Holz ware = holz.remove(holz.size() - 1);
        System.out.println("Händler ("+ Thread.currentThread().getName() + "): hat Holz abgeholt, Bestand: " + holz.size());
        this.notifyAll();
        return ware;
    }
}

class Holz {
}

class Holzfaeller implements Runnable {

    private final Lager lager;

    public Holzfaeller(Lager lager) {
        this.lager = lager;
    }
    
    @Override
    public void run() {
        while(true) {
            lager.einlagern();
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

class Haendler implements Runnable {

    private final Lager lager;

    public Haendler(Lager lager) {
        this.lager = lager;
    }
    
    @Override
    public void run() {
        while(true) {
            lager.abholen();
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}
