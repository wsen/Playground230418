/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.lambda;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class MethodReferenzTest {
    
    
    
    public static void main(String[] args) {
        
        Stream<MethodReferenzTest> s = Stream.of(new MethodReferenzTest(),
                new MethodReferenzTest(),
                new MethodReferenzTest(),
                new MethodReferenzTest());
        
        Stream<String> str = s.map(MethodReferenzTest::machWas);
        
        str.forEach(System.out::println);
        
    }
    
//    static String machWas(MethodReferenzTest i) {
//        return i.toString();
//    }
    
    String machWas() {
        return "Hallo";
    }
}
