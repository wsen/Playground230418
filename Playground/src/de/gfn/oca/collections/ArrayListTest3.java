/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author tlubowiecki
 */
public class ArrayListTest3 {
    
    public static void main(String[] args) {
        
        // init-cap 10
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Peter");
        al1.add("Bruce");
        
        new ArrayList(50);
        
        new ArrayList(al1);
        
        al1.add(2, "Clark");
//        System.out.println(al1);
        
        al1.set(1, "Clark");
        System.out.println(al1);
        
//        al1.remove("Clark");
//        System.out.println(al1);
        
        while(al1.contains("Clark"))
            al1.remove("Clark");
        
        System.out.println(al1);
        
        al1.add("Peter");
        al1.add("Clark");
        al1.add("Bruce");
        
        al1.removeIf((a) -> a.equals("Peter"));
        
        System.out.println(al1);
        System.out.println(al1.size());
        
        System.out.println(al1.indexOf("Peter"));
        System.out.println(al1.lastIndexOf("Peter"));
        
        
//        ListIterator<String> itr = al1.listIterator();
//        while(itr.hasNext()) {
//            String s = itr.next();
//        }

        System.out.println("------------");
        
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(4);
        
        String as[] = new String[10];
        List<String> l2 = Arrays.asList(as);
        System.out.println(l2);
        
        List<Integer> l1 = Arrays.asList(1,2);
        //l1.add(3);
        
        //al2.removeAll(l1);
        al2.retainAll(l1);
        System.out.println(al2);
        
        String s = "Moin";
        int i = 10;
        
        switch(s) {
            
            case "X":
                
                switch(i) {
                    case 10:
                }
                break;
                
            case "Y":
            
        }
        
        
    }
}
