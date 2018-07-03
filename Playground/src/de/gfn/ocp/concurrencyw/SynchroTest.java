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
public class SynchroTest {
    public static void main(String[] args) {
        Work work = new Work();
        
        Worker w1 = new Worker();
        w1.setName("Peter");
        w1.setWork(work);
        w1.start();
        Worker w2 = new Worker();
        w2.setName("Abdullah");
        w2.setWork(work);
        w2.start();

    }
}

class Work {
    private int tasks = 0;
    
    public synchronized void doTask() {
        System.out.println(++tasks + " " + Thread.currentThread().getName());
        
    }
}

class Worker extends Thread {
    
    private static int count = 0;

    public synchronized int getCount() {
        return count;
    }

    // ? synchro nur beim Schreiben?
    // Könnte aber sein dass Lesen abgebrochen und count neu gesetzt wird
    public synchronized void setCount(int count) {
        Worker.count = count;
    }
    
            
    @Override
    public void run() {
       countTo100();
    }
    
    //mit work class
    private Work work;
    
    public void setWork( Work work) {
        this.work = work;
    }
    
    private void doWork(){
        int i = 0;
        while(i < 100) {
            work.doTask();
            i++;
        }
    }
            
            
            
    //synchronized als Methodenparameter Instanz: this, Klassen: class
//    public synchronized void countTo100() { 
//        for(int i = 0; i <= 100; i++){
//            System.out.println(++count + " " + getName());
//        }
//    }
    //hier durcheinander
    //synchronized auf this nur dann interssant wenn Aufgaben aufeinander abgestimmet werden
    //getter und setter -> synchroni
    
//    public static synchronized void countTo100() { 
//        for(int i = 0; i <= 100; i++){
//            System.out.println(++count + " " + Thread.currentThread().getName());
//        }
//    }
    // komplette Aufgabe ist jetzt synchronisiert. Sollange Schlüssel behalten bis Thread abgearbeitet
    // Besser: nur die erhöhung synchronisieren, sstatt der kompletten Aufgabe
    
    public void countTo100() { 
        for(int i = 0; i <= 100; i++){
            synchronized(this){
                System.out.println(++count + " " + getName());
            }
        }
    }
    
    
}
