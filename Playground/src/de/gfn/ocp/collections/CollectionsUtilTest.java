/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tlubowiecki
 */
public class CollectionsUtilTest {
    
    public static void main(String[] args) {
        
        List<String> l1 = new ArrayList<>();
        Collections.addAll(l1, "Peter", "Clark", "Bruce", "David", "David", "david");
        Collections.sort(l1);
        
        l1.forEach(System.out::println);
        
        System.out.println("-----------");
        
//        Collections.shuffle(l1);
//        l1.forEach(System.out::println);
        
//        Collections.reverse(l1);
//        l1.forEach(System.out::println);
        
        System.out.println(Collections.binarySearch(l1, "David"));
    }
}
