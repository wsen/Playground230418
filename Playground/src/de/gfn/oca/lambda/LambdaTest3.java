package de.gfn.oca.lambda;

import de.gfn.oca.aufgabenblatt4.aufgabe1.Adresse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author tlubowiecki
 */
public class LambdaTest3 {
    
    public static void main(String[] args) {
        
        // Predicate
        // Consumer
        // Supplier
        
        System.out.println("--------CONSUMER--------");
        
        // Consumer accept(T t)
        Consumer<String> c1 = (s) -> System.out.println("Start: " + s);
        Consumer<String> c2 = (s) -> System.out.println("Ende: " + s);
        c2.andThen(c1).accept("Lambdas sind soooo schwer...");
        
        List<String> liste = Arrays.asList("Peter", "Bruce", "Clark", "David");
        //liste.forEach(c1);
        liste.forEach((w) -> System.out.println("..." + w + "..."));
        
        
        System.out.println("--------SUPPLIER--------");
        
        // Supplier get()
        Supplier<String> s1 = () -> "Das ist ein Supplier";
        
        Supplier<Adresse> s2 = () -> {
            Adresse a = new Adresse();
            a.setVorname("Max");
            a.setNachname("Mustermann");
            a.setOrt("Hamburg");
            return a;
        };
        
        Adresse max = s2.get();
        
        Supplier<Integer> rand = () -> new Random().nextInt(100);
        
        System.out.println(rand.get());
        System.out.println(rand.get());
        System.out.println(rand.get());
        
        int zahl = rand.get();
        
        System.out.println("--------PREDICATE--------");
        
        // Predicate test(T t)
        
        Predicate<String> p1 = (s) -> false;
        p1 = (s) -> s.equals("Moin");
        System.out.println(p1.test("Moin"));
        
        Predicate<Adresse> p2 = (a) -> a.getOrt().startsWith("H");
        System.out.println(p2.test(max));
        
        List<Bar> bars = new ArrayList();
        bars.add(new Bar("Moo's", "Springfield"));
        bars.add(new Bar("Scum-Bar", "Monkey Island"));
        bars.add(new Bar("Goldener Handschuh", "Hamburg"));
        bars.add(new Bar("Zum betrunkenen Pferd", "Hagen"));
        
        bars.forEach((b) -> System.out.println(b));
        
        System.out.println("----- removeIf -----");
        
        //bars.removeIf((b) -> b.getLocation().equalsIgnoreCase("Hamburg"));
//        bars.removeIf(bar -> bar.getName().startsWith("S"));
//        
//        Predicate<Bar> startsWithS = bar -> bar.getName().startsWith("S");
//        bars.removeIf(startsWithS);
//        
//        bars.forEach((bar) -> System.out.println(bar));
        
        
        
        Predicate<Bar> p6 = (bar) -> bar.getLocation().startsWith("H");
        
        System.out.println("------- AND --------");
        Predicate<Bar> p7 = p6.and((bar) -> bar.getLocation().endsWith("n"));
        
        System.out.println("------- NEGATE --------");
        Predicate<Bar> p8 = p7.negate();
        
        System.out.println("------- OR --------");
        Predicate<Bar> p9 = p6.or((bar) -> bar.getLocation().startsWith("M"));
        
        bars.removeIf(p9);
        bars.forEach((bar) -> System.out.println(bar));
    }
}

class Bar {
    
    private final String name;
    private final String location;

    public Bar(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Ort: " + location;
    }
}