/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/**
 *
 * @author tlubowiecki
 */
public class WalkTest {
    
    public static void main(String[] args) throws IOException {
        
        Path p = Paths.get("iotest");
        Files.walk(p, 0).forEach(System.out::println);
        
        Optional<String> op = Optional.of("10");
        
        Optional<Optional<Integer>> op2 = op.map(s -> Optional.of(Integer.decode(s)));
        
        Optional<Integer> op3 = op.flatMap(s -> Optional.of(Integer.decode(s)));
        
        Optional<Integer> op4 = op.map(s -> Integer.decode(s));
        
        UnaryOperator<Integer> o = (x) -> x;
        
        List<Integer> l = Arrays.asList(1,2,3,4,5);
        UnaryOperator<Integer> un = UnaryOperator.identity();
        l.forEach(w -> {
                        un.apply(w);
                    });
        System.out.println(l);
        
        IntFunction<String> func = Integer::toString;
        //Function<Integer, String> func = Integer::toString; 
        
    }
}
