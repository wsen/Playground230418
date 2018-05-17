package de.gfn.oca.lambda;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 *
 * @author tlubowiecki
 */
public class LambdaTestErweitert {
    
    public static void main(String[] args) {
        
        // Function<T, R> 
        // R apply(T t) 
        Function<String, Integer> f1 = (s) -> Integer.parseInt(s);
        System.out.println(f1.apply("1000"));
        
        // BiFunction<T, U, R> 
        // R apply(T t, U u) 
        BiFunction<String, Integer, Integer> f2 = (s, i) -> Integer.parseInt(s) + i;
        System.out.println(f2.apply("1000", 2));
        
        // UnaryOperator<T>
        // T apply(T t) 
        UnaryOperator<String> uo = (s) -> s + "...";
        System.out.println(uo.apply("Hallo"));
        
        // BinaryOperator<T>
        // T apply(T t1, T t2) 
        BinaryOperator<String> bo = (s1, s2) -> s1 + " " + s2;
        System.out.println(bo.apply("Hallo", "Hamburg"));
        
        // Methoden Referenz
        ArrayList<String> liste = new ArrayList<>();
        liste.forEach((s) -> System.out.print(s));
        liste.forEach(System.out::print);
        
        Supplier<String> s = String::new;
        
        Integer i1 = 10;
        Integer i2 = 20;
        i2 += i1;
        BinaryOperator<Integer> bo2 = (Integer i3, Integer i4) -> i3 += i4;
        BinaryOperator<Integer> bo3 = Integer::rotateLeft;
        
        System.out.println(bo2.apply(2, 2));
        System.out.println(bo3.apply(2, 2));
    }
}
