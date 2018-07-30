package de.gfn.ocp.forkjoin;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tlubowiecki
 */
public class ForkJoinTest1 {
    
    public static void main(String[] args) {
        
        int[] randoms = new int[10000];
        
        long start = System.currentTimeMillis();
        for(int i = 0; i < randoms.length; i++) {
            randoms[i] = new Random().nextInt(10);
        }
        long end = System.currentTimeMillis();
        System.out.println("----- " + (end - start) + " ------");
        
        
//        long start = System.currentTimeMillis();
//        
//        ForkJoinTask<?> task = new RandomNumbersAction(0, randoms.length, randoms);
//        ForkJoinPool pool = new ForkJoinPool(4);
//        pool.invoke(task);
//        
//        long end = System.currentTimeMillis();
//        System.out.println("----- " + (end - start) + " ------");
        
        //Arrays.stream(randoms).forEach(System.out::println);
        
        
    }
}

class RandomNumbersAction extends RecursiveAction {

    private int start;
    private int end;
    private int[] randoms;

    public RandomNumbersAction(int start, int end, int[] randoms) {
        this.start = start;
        this.end = end;
        this.randoms = randoms;
    }
    
    
    @Override
    protected void compute() {
        
        if(end - start <= 5) {
            for(int i = start; i < end; i++) {
                //System.out.println(Thread.currentThread().getName() + " - start: " + start + ", end: " + end);
                randoms[i] = new Random().nextInt(10);
            }
        }
        else {
            int middle = start + ((end - start)/2);
            //System.out.println("Geteilt - start: " + start + ", mitte: " + middle + ", end: " + end);
            invokeAll(new RandomNumbersAction(start, middle, randoms), new RandomNumbersAction(middle, end, randoms));
        }
    }
}
