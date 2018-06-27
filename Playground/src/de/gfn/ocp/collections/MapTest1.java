package de.gfn.ocp.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author tlubowiecki
 */
public class MapTest1 {
    
    public static void main(String[] args) {
        
        Map<String, String> de = new TreeMap<>();
        de.put("firstname", "Vorname");
        de.put("lastname", "Nachname");
        de.put("age", "Alter");
        //de.put("age", "Alter...");
        
        //System.out.println(de.get("lastname"));
        
        //de.remove("age");
        
        de.forEach((k, v) -> System.out.println(k + ": " + v));
        
        System.out.println("----------");
        
        for(Map.Entry<String, String> e : de.entrySet()) {
            System.out.print(e.getKey());
            System.out.print(": ");
            System.out.print(e.getValue());
            System.out.print("\n");
        }
        
        for(String s : de.keySet()) {
            System.out.println(s);
        }
        
        for(String s : de.values()) {
            System.out.println(s);
        }
        
        System.out.println("--------");
        
        System.out.println(de.containsKey("age"));
        
        SortedMap<String, String> sortedDe = (SortedMap<String, String>) de;
        
        System.out.println(sortedDe.subMap("age", "firstname"));
        
        System.out.println("--------------");
        
        Set<Test> set = new HashSet<>();
        Test t = new Test();
        
        set.add(t);
        set.add(t);
        
        set.forEach((v) -> System.out.println(v));
    }
}

class Test {
    
    private int id;
    
    @Override
    public int hashCode() {
        return (int)(Math.random()*100);
    }

    @Override
    public String toString() {
        return ""+ id;
    }
}
