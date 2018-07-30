package de.gfn.ocp.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class LambdaTest {
    
    public static void main(String[] args) {
        
        Consumer<String> c1 = (String e) -> machWas1(e);
        c1.andThen((e) -> machWas2(e)).accept("Hallo");
        
        Function<String, String> upper = e -> e.toUpperCase();
        Function<String, String> lower = e -> e.toLowerCase();
        
        BiFunction<String, Integer, String> bf1 = (e1, e2) -> e1 + e2;
        
        Supplier<Integer> s1 = () -> (int)(Math.floor(Math.random() * 6) + 1);
        System.out.println(s1.get());
        
        UnaryOperator<String> uo1 = (e) -> e.toUpperCase();
        
        BinaryOperator<String> bo1 = (e1, e2) -> (e1 + e2).toUpperCase();
        
        
        ToIntFunction<String> tif = (s) -> Integer.parseInt(s);
        int i = tif.applyAsInt("123");
        
        Stream.of("Peter", "Bob", "Andrew").filter(LambdaTest::gibTrueAus).forEach(LambdaTest::gibWasAus);
        
    }
    
    static void machWas1(String s) {
        System.out.println(s + 1);
    }
    
    static void machWas2(String s) {
        System.out.println(s + 2);
    }
    
    static void gibWasAus(String s) {
        System.out.println(s + 3);
    }
    
    static boolean gibTrueAus(String s) {
        return true;
    }
}
