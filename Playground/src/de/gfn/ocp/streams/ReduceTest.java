/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class ReduceTest {
    
    public static void main(String[] args) {
        
        IntStream s1 = IntStream.range(1, 10);
        //System.out.println(s1.parallel().reduce(0,(a,b) -> (a-b)));
        System.out.println(s1.reduce(0,(a,b) -> (a-b)));
        
        Stream<String> s2 = Stream.of("A", "B", "C");
        //System.out.println(s1.parallel().reduce(0,(a,b) -> (a-b)));
        System.out.println(s2.reduce("x", String::concat));
        System.out.println(s2.parallel().reduce("x", String::concat));
        
        
        
        
    }
    
}
