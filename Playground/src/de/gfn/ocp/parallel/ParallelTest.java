package de.gfn.ocp.parallel;

import java.util.Arrays;

/**
 *
 * @author tlubowiecki
 */
public class ParallelTest {
    
    public static void main(String[] args) {
        
        String[] list = {"1", "2", "3"};
        Arrays.parallelSetAll(list, i -> i + list[i]);
        Arrays.stream(list).forEach(System.out::println);
        
        System.out.println("----------");
        
        int[] intList = {1, 2, 3};
        Arrays.parallelSetAll(intList, i -> i + intList[i]);
        Arrays.stream(intList).forEach(System.out::println);
        
        System.out.println("----------");
        
        for(Wochentag w : Wochentag.values()) {
            System.out.println(w);
        }
        
        
        
        
    }
    
}

enum Wochentag {
    MO, DI, MI, DO, FR;
}
