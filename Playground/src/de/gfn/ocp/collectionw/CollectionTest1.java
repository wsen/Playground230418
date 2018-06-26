/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collectionw;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class CollectionTest1 {
    public static void main(String[] args) {
        System.out.println("--------List----------");
        Collection<String> c1 = new ArrayList<>();
        c1.add("Peter");
        c1.add("Bruce");
        c1.add("Clark");
        
        for(String s : c1) {
            System.out.println(s);
        }
//       Geht nur enhanced Loop -> ginge bei List (z17) 
//        for(int i=0; i< c1.size(); i++) {
//            System.out.println(c1.get(i)); //i als Indizes haben nur List
//        }

    System.out.println("------------------");
// andere Möglichkeit: sich Iterator geben lassen:
        Iterator<String> itr = c1.iterator(); //<String> Parametrisierung dafür wichtig (z17) sind Object, wenn die sich nicht caten lassen dann -> Exepcton
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
         System.out.println("------------------");
         c1.forEach((s) -> System.out.println(s)); //Consumer, nimmt Wert engegegen und gibt nichts zurück.
         
         System.out.println("------------------");
         Object[] o1 = c1.toArray(); //Standardmethode Objectmethode
         String[] s1 = c1.toArray(new String[0]); // Typ selber bestimmbar
         //Integer[] i1 = c1.toArray(new Integer[0]); // Typ: Integer -> Exception
         
         System.out.println("------------------");
         // Unterschied: LinkedList <> ArrayList
          
        for(String s : s1) {
            System.out.println(s);
        }
         
        System.out.println("--------ArrayList----------");
        
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Peter");
        c2.add("Bruce");
        c2.add("Clark");
        
        System.out.println(c2.equals(c1));
        
        System.out.println("--------LinkedList----------");

        LinkedList<String> c3 = new LinkedList<>();
        c3.add("Peter");
        c3.add(null);
        c3.add("Clark");
        
        System.out.println(c3.equals(c1));
        
        System.out.println("--------SETS----------");
        
        Set<String> set1 = new HashSet<>(); //HashSet erzeugt die Reihenfolge der Ausgabe
//        set1.add("Peter");
//        set1.add("Bruce");
//        set1.add("Clark");
        System.out.println(set1.add("Peter"));
        System.out.println(set1.add("Bruce"));
        System.out.println(set1.add("Clark"));
        System.out.println(set1.add("Peter"));

        System.out.println(set1.remove("Bruce..."));
        
        set1.forEach((s)-> System.out.println(s));
        //set1.forEach((Object s)-> System.out.println(s));
        //set1.forEach((CharSequence s)-> System.out.println(s));
        
        System.out.println("--------TREESET----------");
        
        Set<String> set2 = new TreeSet();
        //Set<String> set2 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        set2.add("A");
        set2.add("D");
        set2.add("G");
        set2.add("a");
        set2.add("1");
        set2.add("17");
        set2.add("2");
        set2.add("#");
        set2.add("!");
        
        set2.forEach((s)-> System.out.println(s));
        
        System.out.println("--------TREESET-avec int---------");
        
        Set<Integer> set3 = new TreeSet();
        set3.add(7);
        set3.add(17);
        set3.add(2);
        set3.add(1);
        set3.add(5);
        set3.add(99);

        set3.forEach((s)-> System.out.println(s));
        
        //String und Integer vewenden das Interface Comparable
        
        System.out.println("--------TREESET-Object---------");
        //Set<Object> set4 = new TreeSet(); Object implementiert kein Comparable
        
        Comparator<Object> comp = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                return o1.hashCode() - o2.hashCode();
            }         
        };
        Set<Object> set4 = new TreeSet(comp);
        set4.add(new Object());
        set4.add(new Object());
        
        
       System.out.println("--------Linkded HashSet---------");
        LinkedHashSet<Integer> set5 = new LinkedHashSet<>(); //nicht sortiert, geordnet
        set5.add(7);
        set5.add(17);
        set5.add(2);
        
        set5.forEach((s)-> System.out.println(s));
    }
    
}

//1 mal null is in einem set möglich
// Tree sortierte Struktur
// Hash Reihenfolge zufällig (bis auf Zusatz), schnelle Struktur
// List Eingabereihenfolge