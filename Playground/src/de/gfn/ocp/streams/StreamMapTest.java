package de.gfn.ocp.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class StreamMapTest {
    
    public static void main(String[] args) {
        
        
        Stream.of("Max ", " Peter", " Hans Solo ", "Bo b")
           .peek(System.out::println)
           .map(s -> s.trim())
           .forEach(System.out::println);
        
        System.out.println("--------");
        
        Stream.of(1,2,3,4,5,6)
           .map(i -> i * i)
           .forEach(System.out::println);
        
        System.out.println("---------");
        
        long c = Stream.of(1,2,3,4,5,6)
           .map(i -> i * i)
           .count();
        
        System.out.println("Anzahl: " + c);
        
        int sum = IntStream.of(1,2,3)
           .map(i -> i * i)
           .sum();
        
        System.out.println("Summe: " + sum);
        
    }
}
