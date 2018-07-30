package de.gfn.ocp.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class StreamOperations {
    
    public static void main(String[] args) {
        
        String[] w1 = "Hallo - Ich bin ein Berliner".split(" ");
        String[] w2 = "Hallo meine Welt".split(" ");
        
        Object[] arr = Arrays.asList(
                Arrays.asList(w1),
                Arrays.asList(w2)
        )
        .stream()
        .flatMap(wl -> wl.stream())
        .distinct()
        .sorted((e1, e2) -> e1.length() - e2.length())
        .limit(4)
        .skip(2)
        .toArray();
        
        System.out.println(arr);
        
        
        Arrays.stream("Ich bin ein Berliner".split(" "));
        
        IntStream is = IntStream.of(1,4,5,9,19);
        System.out.println(is.min().orElseGet(() -> (int)Math.floor(Math.random() * 6) + 1));
        //System.out.println(is.min().orElseThrow(() -> new RuntimeException("....")));
        //System.out.println(is.max());
        
        //.forEach(System.out::println);
              
        
//        Comparator<String> c = new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };

        System.out.println("-----------");

        System.out.println(Stream.of("Bob", "Peter", "Andrew").peek(System.out::println).anyMatch((s) -> s.length() > 3));
        
        System.out.println("-----------");
        
        System.out.println(Stream.of("Bob", "Peter", "Andrew").peek(System.out::println).allMatch((s) -> s.length() > 3));
        
        System.out.println("-----------");
        
        System.out.println(Stream.of("Bob", "Peter", "Andrew").peek(System.out::println).noneMatch((s) -> s.length() > 3));
        
        System.out.println("-----------");
        
        System.out.println(IntStream.of(3,7,9).sum());
    }
    
}
