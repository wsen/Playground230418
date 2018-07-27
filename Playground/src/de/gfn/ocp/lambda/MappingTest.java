package de.gfn.ocp.lambda;

import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class MappingTest {
    
    public static void main(String[] args) {
        
        Stream<Person> ps = Stream.of("Peter", "Bob", "Andrew").map((e) -> new Person(e));
        ps = Stream.of("Peter", "Bob", "Andrew").map(MappingTest::stringToPerson);
        ps.forEach(System.out::println);
        
        System.out.println("--------");
        
        Stream.of("Peter", "Bob", "Andrew").mapToInt((s) -> s.length()).forEach(System.out::println);
        
        System.out.println("--------");
        
        DoubleStream.of(10.0, 2.5, 7.3).peek(System.out::println).mapToInt((l) -> (int) l).forEach(System.out::println);
        
        System.out.println("--------");
        
        DoubleStream.of(10.0, 2.5, 7.3).peek(System.out::println).mapToObj((d) -> new Person("Unbekannt" + d)).forEach(System.out::println);
                
    }
    
    static Person stringToPerson(String s) {
        return new Person(s);
    }
}

class Person {
    
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
    
    
}
