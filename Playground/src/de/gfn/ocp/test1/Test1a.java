/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.test1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class Test1a {
    
    public static void main(String[] args) throws IOException {
        /*
        Path p1 = Paths.get("/usr/main");
        Path p2 = Paths.get("/usr/main/data");
        System.out.println(p1.relativize(p2));
        System.out.println(p2.relativize(p1));
        */
        List<String> s = new ArrayList<>();
        
        BiFunction<String, String, Integer> func = (a, b) -> a.length() - b.length();
        
//        Collections.sort(s, (a, b) -> a.length() - b.length());
        Collections.sort(s, func::apply);
//        
        new Thread(Test1a::machWas);
        
        Optional<String> o1 = Optional.of("Moin");
        Optional<Optional<String>> o2 = o1.map(s1 -> Optional.of("4"));
        Optional<String> o3 = Optional.empty().flatMap(s1 -> Optional.of("4"));
        System.out.println(o3);

        
        Stream<Xyz> stream = Stream.of(new Xyz("Peter"), new Xyz("Bob"), new Xyz("Hans"));
        
        stream.map(Xyz::getAlter);
        
        
        DoubleFunction<Xyz> df = d -> new Xyz("Peter"); 
        ToDoubleFunction<Xyz> tdf = x -> x.getAlter();
        
        System.out.println(Integer.rotateLeft(2, 3));
        
        //10000
        
        
//        Function<String, String> f1 = s3 -> s3.toUpperCase();
//        Function<String, String> f2 = s3 -> s3 + ", ";
//        
//        Function<String, String> f3 = f1.compose(f2); // zuerst f2 dann f1
//        Function<String, String> f4 = f1.andThen(f2); // zuerst f1 dann f2

        Function<Integer, String> func2 = s4 -> s4.toString();
        
        Function<Integer, String> func3 = func2.andThen(s4 -> s4 + "2");
        
        Function<String, String> func4 = func3.compose(s4 -> Integer.parseInt(s4));
        
        
        
    }
    
    static void machWas() {
        
    }
    
}

class Xyz {
    
    private String name;
    
    private int alter;

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    
    public Xyz(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
