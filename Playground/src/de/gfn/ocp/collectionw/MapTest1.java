/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collectionw;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author student
 */
public class MapTest1 {
    public static void main(String[] args) {
        Map<String, String> werte = new HashMap<>();  //nicht von Collections abgeleitet -> keine add Methode -> sondern mit put
        // String, Klasssen, etc
        Map<String, String> werte1 = new LinkedHashMap<>();
        Map<String, String> werte2 = new TreeMap<>();
        werte.put("", ""); // leerer String bereits gültig
        werte.put("firstname", "Vorname");
        werte.put("lastname", "Nachname");
        werte.put("age", "Alter");
        werte.put("age", "Alter..."); // put gedanklich add + set in Einem
        
        System.out.println(werte.get("lastname"));
        
        werte.remove("age");
        
        werte.forEach((k, v)-> System.out.println(k + ": " + v));  //BiCosumer (mit 2 Werten)
        
        //https://docs.oracle.com/javase/8/docs/api/java/util/Map.Entry.html
        for(Map.Entry<String, String> e: werte.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(": ");
            System.out.println(e.getValue());
            System.out.println("\n");
        }
        
        for(String s: werte.keySet()) {
            System.out.println(s);
        }
        
        for(String s: werte.values()) {
            System.out.println(s);
        }
        
        //Contains
        System.out.println(werte.containsKey("age"));
        
        //Submaps
        //LinkedHashMap: behält ihre Reihefolge bei
        
        SortedMap<String, String> sortedWerte = (SortedMap<String, String>) werte2;
        System.out.println(sortedWerte.subMap("age","firstname")); //{age=Alter}
        
        //
        System.out.println("------SET-----");
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
        return (int)Math.random()*100;
    }
    
    @Override
    public String toString() {
        return "" + id;
    }
    
    
}
