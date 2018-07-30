package de.gfn.ocp.lambda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class CollectAndReduceTest {
    
    public static void main(String[] args) {
        
        int i1 = IntStream.range(1, 20).reduce(0, (a,b) -> a + b);
        System.out.println(i1);
        
        OptionalInt io = IntStream.range(1, 20).reduce((a,b) -> a + b);
        System.out.println(io.orElse(0));
        
        List<Integer> liste = Arrays.asList(1,3,4,43, 51, 50, 9,3,5,6,22,99,100,21,73);
        liste = liste.parallelStream().filter((w) -> w <= 50).collect(Collectors.toList());
        System.out.println(liste);
        
        Stream<String> s = Stream.of("Peter", "Bruce", "Clark", "Bob", "David");
        Set<String> s2 = s.collect(LinkedHashSet::new, Set::add, Set::addAll);
        System.out.println(s2);
        
        
        s = Stream.of("Peter", "Bruce", "Clark", "Bob", "David");
        String str = s.collect(Collectors.joining(", "));
        System.out.println(str);
        
        
        s = Stream.of("Peter", "Bruce", "Clark", "Bob", "David", "Philipp");
        Map<Integer, List<String>> map = s.collect(Collectors.groupingBy(String::length));
        System.out.println(map);
        
        s = Stream.of("Peter", "Bruce", "Clark", "Bob", "David", "Philipp");
        Map<Integer, List<String>> map2 = s.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
        System.out.println(map2);
        
        Stream<String> s1 = Stream.of("Peter", "Bruce", "Clark", "Bob", "David", "Philipp");
        Map<Boolean, List<String>> map3 = s1.collect(Collectors.partitioningBy(s3 -> s3.startsWith("P")));
        System.out.println(map3);
        
        //DoubleStream.generate(Math::random).forEach(System.out::println);
        
        
        IntStream ints = IntStream.range(5, 15);
        IntSummaryStatistics stats = ints.summaryStatistics();
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());
        System.out.println(stats.getSum());
        
        
    }
}
