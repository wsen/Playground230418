package de.gfn.ocp.reduce;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class ReduceTest2 {
    
    public static void main(String[] args) {
        
        Stream<String> s1 = Stream.of("A", "B", "C", "D", "E");
        
        //System.out.println(s1.parallel().reduce("", (a, b) -> a.concat(b)));
        
        //System.out.println(s1.parallel().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString());
        
//        System.out.println(":::::::");
//        System.out.println(s1.parallel().collect(String::new, String::concat, String::concat));
//        System.out.println(":::::::");
        
        
        IntStream s2 = IntStream.range(1, 100);
        //System.out.println(s2.parallel().reduce(0, (a, b) -> a + b));
        // bei parallel: identity + x == x
        
        
        
        System.out.println(s2.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString());
    }
}
