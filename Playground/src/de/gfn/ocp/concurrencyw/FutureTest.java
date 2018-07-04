package de.gfn.ocp.concurrencyw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.*;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author student
 */
public class FutureTest {
    
    private static final ExecutorService pool = Executors.newFixedThreadPool(4);
    //1 private static final List<Future<Integer>> ergs = new ArrayList<>();
    //2
    private static List<Future<Integer>> ergs;// = new ArrayList<>();
    
    
    public static void main(String[] args) {
       //2
       List<Callable<Integer>> aufgaben = Arrays.asList(
               new MatheAufgabe(), //Optionen auf Ergebnisse, nicht die Ergebnisse selbst
               new MatheAufgabe(),
               new MatheAufgabe(),
               new MatheAufgabe(),
               new MatheAufgabe()
       );
       
       //Zeitmessung
       final long start = System.currentTimeMillis();
       
       try {
           ergs = pool.invokeAll(aufgaben);
//          for(Future<Integer> f : ergs) {
////           }
       } catch(Exception ex) {
           System.out.println(ex);
       }

//1       
//1b zum Zeittest
//       ergs = new ArrayList<>();
//       ergs.add(pool.submit(new MatheAufgabe())); 
//       ergs.add(pool.submit(new MatheAufgabe())); 
//       ergs.add(pool.submit(new MatheAufgabe())); 
//       ergs.add(pool.submit(new MatheAufgabe())); 
//       ergs.add(pool.submit(new MatheAufgabe())); 
//       ergs.add(pool.submit(new MatheAufgabe()));
       
       int summe = 0;
              
       try{
        for(Future<Integer> f : ergs) {
//            while(!f.isDone()){  //coment or not to comment?
            while(!f.isDone()){
                
                //summe += f.get(); // immer nur der Thread blockiert, der aufgerufen wird.-> Main Tread
                summe += f.get(500, TimeUnit.MILLISECONDS);
//                System.out.println("warten ...");
//                Thread.sleep(100);
            }
            summe += f.get();
        }
       } catch(Exception ex) {
           System.out.println(ex);
       }
        System.out.println("Summe: " + summe);
       pool.shutdown();
       final long end = System.currentTimeMillis();
        System.out.println("Ausführungszeit: " +   (end -start) + " Millis");
    }
    
}

class MatheAufgabe implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Random rand = new Random();
        
        Thread.sleep(1000); //Exception bereits oben angegeben, sonst hier behandeln
        
        return rand.nextInt(100);
    }


    
}

