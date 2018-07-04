/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.concurrencyw;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class ExecutorTest {
    
    private static ExecutorService service1 = Executors.newSingleThreadExecutor(); //sind unabhängig
    private static ExecutorService service2 = Executors.newSingleThreadExecutor();
    
    public static void main(String[] args) {
        
        
            service1.execute(new Aufgabe("Bügeln"));
            service2.execute(new Aufgabe("Auto waschen"));
            service2.execute(new Aufgabe("Coden"));
            //service1.submit(new Aufgabe("Mit dem Hund rausgehen")); // weiß nicht ob Callable  or Runnable
            Future f = service1.submit((Callable<String>) new Aufgabe("Mit dem Hund rausgehen")); //deswegen Casten !
            
            service1.shutdown(); //wichtig, sonst wird Prozess nie beendet.
        try {   
            System.out.println("Erg: " + f.get()); //Normales get blockiert ->
        } catch (Exception ex) {
            System.out.println(ex);;
        }
        
                    //Runnable r =
            
//        Thread t1 = new Thread(() -> System.out.println("Moin"));
//        t1.start();
// t1.start(); //wiederholte Abarbeitung geht nicht !!
    }
}

class Aufgabe implements Runnable, Callable<String> {
    
    private final String name;
    
    public Aufgabe(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " : erledigt von " + Thread.currentThread().getName());
    }

    @Override
    public String call() throws Exception {
        return name + ": erledigt von " + Thread.currentThread().getName();
    }
    
}
