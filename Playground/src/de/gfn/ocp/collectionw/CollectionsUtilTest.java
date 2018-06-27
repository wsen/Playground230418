/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collectionw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author student
 */
public class CollectionsUtilTest {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        //alternativ mit Collectinons statt add
        Collections.addAll(l1, "Peter", "Clark", "Bruce", "peter", "David", "david");
        //        l1.add("Peter");
        //        l1.add("Clark");
        //        l1.add("Bruce");

        // Collections.sort(l1); // Objekte vergleichbar
        // oder 
        Collections.sort(l1, String.CASE_INSENSITIVE_ORDER); // 
        
        
        
        //l1.sort(); //without Utility Klasse

        l1.forEach(System.out::println);
        
        System.out.println("---shuffle---");
        Collections.shuffle(l1); // geht nur mit Liste aber nicht mit set treeSet 
        
        l1.forEach(System.out::println);
        
        System.out.println("---reverse order---");
        
        Collections.reverse(l1);
        l1.forEach(System.out::println);
        
        System.out.println("---binarySearch---");
        // 
        Collections.sort(l1); // Sortieren wichtig für binarySearch
        System.out.println(Collections.binarySearch(l1,"Cindy")); //Rückgabe -2
        
        //nicht gefunden: -> Rückgabe: Positon -1  * (-1) 
        
    }
}
