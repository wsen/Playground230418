/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ccp.concurrencyw;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author student
 */
public class Bar {
    ExecutorService  getränkeService = Executors.newFixedThreadPool(4);
    
    public void bestellen(Bestellung bestellung) {
        try {
            Future f = getränkeService.submit(bestellung);
            //f.get();  //Problem: Main Thread blockiert durch f.get()
            //Eingabe in main Thread: wait 2sec
            //vlad: mit invokeAll arbeiten ??
            //vlad: mit f1.get f2.get arbeiten ??
            //vlad: runable arbeiten -> excepton im call abarbeiten ???
        }
        catch(Exception ex){
            System.out.println(ex);
            System.out.println(ex.getCause().getMessage());
        }
    }
    
    public void feierabend() {
        getränkeService.shutdown();
    }
    
     public void wirklichEnde() {
        getränkeService.shutdown();
        try {
            if(!getränkeService.awaitTermination(500, TimeUnit.MILLISECONDS)){
                getränkeService.shutdownNow();
            }
        }
        catch (InterruptedException ex) {
            getränkeService.shutdown();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Bar bar = new Bar();
        
        while(true){
            System.out.println("^Bestellung: ");
            String input = scanner.next();
            
            if(input.equalsIgnoreCase("exit"))
                break;
            
            bar.bestellen(new Bestellung(input));
        }
        
        bar.wirklichEnde();
    }
    
}

class Bestellung implements Callable<Void>{

    private String bestellText;
    
    public Bestellung(String bestellText) {
        this.bestellText = bestellText;
    }

    @Override
    public Void call() throws Exception {
        if(bestellText.equalsIgnoreCase("Wein"))
            throw new Exception("Wir haben keine Wein!");
        
        Thread.sleep(2000);
        
        System.out.println(bestellText);
      
        return null;
    }   
}
