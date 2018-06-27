/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collections;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author tlubowiecki
 */
public class CollectionTest1 {
    
    public static void main(String[] args) {
        
        System.out.println("----LISTS----");
        
        Collection<String> c1 = new ArrayList<>();
        c1.add("Peter");
        c1.add(null);
        c1.add("Clark");
        
        System.out.println("--------");
        
        for(String s : c1) {
            System.out.println(s);
        }
        
//        for(int i = 0; i < c1.size(); i++) {
//            System.out.println(c1.get(i));
//        }

        System.out.println("--------");

        Iterator<String> itr = c1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        System.out.println("--------");
        
        c1.forEach((s) -> System.out.println(s));
        
        System.out.println("--------");
        
        Object[] o1 = c1.toArray();
        String[] s1 = c1.toArray(new String[2]);
        
        for(String s : s1) {
            System.out.println(s);
        }
        
        System.out.println("--------");
        
        LinkedList<String> c2 = new LinkedList<>();
        c2.add("Peter");
        c2.add(null);
        c2.add("Clark");
       
        System.out.println(c2.equals(c1));
        
        System.out.println("---SETS---");
        
        Set<String> set1 = new HashSet<>();
        System.out.println(set1.add("Peter"));
        System.out.println(set1.add("Bruce"));
        System.out.println(set1.add("Clark"));
        System.out.println(set1.add("Peter"));
        
        System.out.println(set1.remove("Bruce..."));
        
        set1.forEach((s) -> System.out.println(s));
        
        System.out.println("---TREESET---");
        
        Set<String> set2 = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        set2.add("A");
        set2.add("D");
        set2.add("G");
        set2.add("a");
        set2.add("1");
        set2.add("17");
        set2.add("2");
        set2.add("#");
        set2.add("!");
        
        set2.forEach((s) -> System.out.println(s));
        
        System.out.println("---------");
        
        Set<Integer> set3 = new TreeSet();
        set3.add(7);
        set3.add(17);
        set3.add(2);
        set3.add(1);
        set3.add(5);
        set3.add(99);
        
        set3.forEach((s) -> System.out.println(s));
        
        System.out.println("-----------");
        
        Comparator<Object> comp = new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return o1.hashCode() - o2.hashCode();
            }
        };
        
        TreeSet<Object> set4 = new TreeSet(comp);
        set4.add(new Object());
        set4.add(new Object());
        
        System.out.println("-----------");
        
        LinkedHashSet<Integer> set5 = new LinkedHashSet<>();
        set5.add(7);
        set5.add(17);
        set5.add(2);
        
        set5.forEach((s) -> System.out.println(s));
        
        System.out.println("-----------");
        
        NavigableSet<String> set6 = new TreeSet<>();
        set6.add("c");
        set6.add("D");
        set6.add("d");
        set6.add("a");
        
        set6.forEach((s) -> System.out.println(s));
        
        System.out.println("-------");
        
        System.out.println(set6.higher("a"));
        System.out.println(set6.lower("a"));
        
        System.out.println(set6.ceiling("b"));
        System.out.println(set6.floor("b"));
        
        System.out.println("-------");
        
        SortedSet<String> set7 = set6.subSet("a", "e");
        set7.forEach((s) -> System.out.println(s));
        
        System.out.println("-------");
        
        NavigableSet<LocalDate> set8 = new TreeSet<>();
        
        set8.add(LocalDate.of(2010, Month.MARCH, 15));
        set8.add(LocalDate.of(1992, 7, 8));
        set8.add(LocalDate.of(2015, 5, 8));
        
        set8.forEach((s) -> System.out.println(s));
        
        System.out.println("-------");
        
    }
}
