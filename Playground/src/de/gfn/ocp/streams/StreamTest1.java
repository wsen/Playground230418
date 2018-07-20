/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.streams;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class StreamTest1 {
    
    public static void main(String[] args) {
        
        Stream<String> s1 = Arrays.asList("Peter", "Bruce", "Clark").stream();
        s1
            .filter(s -> s.startsWith("P"))
            .forEach(s -> System.out.println(s));
        
        System.out.println("------------");
        
        Stream.of("Peter", "Bruce", "Clark", "Bob")
            .filter(s -> s.length() >= 5)
            .forEach(s -> System.out.println(s));
        
        System.out.println("------------");
        
        //s1.forEach(s -> System.out.println(s));
        
        Stream<Integer> s3 = Stream.of(1, 7, 9, 6);
        IntStream s4 = IntStream.of(1, 7, 9, 6);
        
        s4 = IntStream.range(0, 200);
        s4.forEach(s -> System.out.println(s));
        
        System.out.println("------------");
        
        s4 = "Das ist das Haus von Nikigraus".chars();
        s4.forEach(s -> System.out.print((char)s));
        
        System.out.println("\n----------");
        
        s1 = Stream.of("Das ist das Haus von Nikigraus".split(" "));
        s1.forEach(s -> System.out.println(s));
        
        System.out.println("------------");
        
        Stream.generate(() -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(StreamTest1.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return (int)(Math.floor(Math.random() * 6) + 1);
        
        }).forEach(s -> System.out.print(s + " "));
        
    }
}
