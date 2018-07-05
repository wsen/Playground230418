package de.gfn.ocp.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class ExecutorTest {
    
    private static ExecutorService service1 = Executors.newSingleThreadExecutor();
    
    public static void main(String[] args) {
        service1.execute(new Aufgabe("Bügeln"));
        service1.execute(new Aufgabe("Auto waschen"));
        service1.execute(new Aufgabe("Coden"));
        Future f = service1.submit((Callable<String>)new Aufgabe("Mit dem Hund rausgehen!"));
        
        try {
            System.out.println("Erg: " + f.get());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        service1.shutdown();
        
    }
}

class Aufgabe implements Runnable, Callable<String> {

    private final String name;

    public Aufgabe(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        System.out.println(name + ": erledigt! " + Thread.currentThread().getName());
    }

    @Override
    public String call() throws Exception {
        return name + ": erledigt! " + Thread.currentThread().getName();
    }
}
