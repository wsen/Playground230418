package de.gfn.ocp.concurrency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class FutureTest {
    
    private static final ExecutorService pool = Executors.newFixedThreadPool(5);
    private static List<Future<Integer>> ergs;
    
    
    public static void main(String[] args) {
        
        List<Callable<Integer>> aufgaben = Arrays.asList(
                new MatheAufgabe(),
                new MatheAufgabe(),
                new MatheAufgabe(),
                new MatheAufgabe(),
                new MatheAufgabe()
        );
        
        final long start = System.currentTimeMillis();
        
//        try {
//            ergs = pool.invokeAll(aufgaben);
//        } catch (InterruptedException ex) {
//            System.out.println(ex);
//        }
        
        ergs = new ArrayList<>();
        ergs.add(pool.submit(new MatheAufgabe()));
        ergs.add(pool.submit(new MatheAufgabe()));
        ergs.add(pool.submit(new MatheAufgabe()));
        ergs.add(pool.submit(new MatheAufgabe()));
        ergs.add(pool.submit(new MatheAufgabe()));
        
        int summe = 0;
        
        try {
            for(Future<Integer> f : ergs) {
                summe += f.get();
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        
        System.out.println("Summe: " + summe);
        
        pool.shutdown();
        
        final long end = System.currentTimeMillis();
        System.out.println("Ausführungszeit: " + (end - start) + " Milis");
        
    }
}

class MatheAufgabe implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random rand = new Random();
        
        Thread.sleep(1000);
        
        return rand.nextInt(100);
    }
}

class MatheAufgabeMitNix implements Callable<Void> {

    @Override
    public Void call() throws Exception {
        
        return null;
    }
}

class MatheAufgabeMitIntArr implements Callable<int[]> {

    @Override
    public int[] call() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
