package de.gfn.ocp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author tlubowiecki
 */
public class MethodReferencesTest {
    
    public static void main(String[] args) {
        
        List<String> namen = Arrays.asList("Peter", "Hans", "Max", "Bob", "Max");
        
        System.out.println(findInList(namen, (s) -> sucheMax(s)));
        
        // Statische Methode als Methoden-Referenz
        System.out.println(findInList(namen, MethodReferencesTest::sucheMax));
        System.out.println(findInList(namen, MethodReferencesTest::suchePeter));
        
        System.out.println("-----------");
        
        System.out.println(randomPlus10((i1) -> (int)(Math.floor(i1 * 6)) + 1));
        // Konstruktor als Methoden-Referenz
        System.out.println(randomPlus10(Integer::new));
        
        // Instanzmethode
        System.out.println(runActionOnObject(new MyClass("Hallo"), MyClass::getText));
        
        MyClass mc = new MyClass("Moin");
        MyClass mc2 = new MyClass("Nix");
        
        MethodReferencesTest mrt = new MethodReferencesTest();
        
        // Instanzmethode auf einem Objekt
        runNewActionOnObject(Arrays.asList(mc, mc2), mrt::zeige);
    }
    
    private static class MyClass {

        private final String text;
        
        public MyClass(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
    
    public static boolean sucheMax(String s) {
        return s.equals("Max");
    }
    
    public static boolean suchePeter(String s) {
        return s.equals("Peter");
    }
    
    public static int findInList(List<String> list, Predicate<String> suche) {
        List<String> erg = new ArrayList<>();
        return (int) list.stream().filter(suche).count();
    }
    
    public static int randomPlus10(Function<Integer, Integer> zahl) {
        return zahl.apply((int)Math.random()) + 10;
    }
    
    public static String runActionOnObject(MyClass obj, Function<MyClass, String> action) {
        return action.apply(obj);
    }
    
    public static void runNewActionOnObject(List<MyClass> listObj, Consumer<MyClass> c ) {
        listObj.forEach(c);
    }
    
    public void zeige(MyClass c) {
        System.out.println(c + "...Ausgabe");
    }
}


