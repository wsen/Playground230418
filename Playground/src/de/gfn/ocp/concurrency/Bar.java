package de.gfn.ocp.concurrency;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author tlubowiecki
 */
public class Bar {
    
    ExecutorService getränkeService = Executors.newFixedThreadPool(4);
    
    public void bestellen(Bestellung bestellung) {
        try {
            Future f = getränkeService.submit(bestellung);
            f.get();
        } catch (Exception ex) {
            System.out.println(ex);
            //System.out.println(ex.getCause().getMessage());
        }
    }
    
    public void feierabend() {
        getränkeService.shutdown();
    }
    
    public void wirklichEnde() {
        getränkeService.shutdown();
        try {
            if(!getränkeService.awaitTermination(500, TimeUnit.MILLISECONDS)) {
                getränkeService.shutdownNow();
            }
        }
        catch(InterruptedException ex) {
            getränkeService.shutdownNow();
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Bar bar = new Bar();
        
        while(true) {
            System.out.print("Bestellung: ");
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
        
        if(bestellText.equalsIgnoreCase("wein"))
            throw new Exception("Wir haben keinen Wein!");
        
        Thread.sleep(2000);
        System.out.println(bestellText);
        
        return null;
    }
}