/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

import java.util.Arrays;

/**
 *
 * @author tlubowiecki
 */
public class ArrayTest2 {
    public static void main(String[] args) throws Error {
        
        int[] arr1 = new int[]{1,7,8,5,2};
        int[] arr4 = new int[]{1,7,8,5,2};
        
        Arrays.sort(arr1);
        //Arrays.sort(arr4);
        //Arrays.asList(arr1).forEach((e) -> System.out.println(e));
        for(int i : arr1) {
            System.out.println(i);
        }
        
        System.out.println("--------");
        
        System.out.println(Arrays.binarySearch(arr1, 3));
        
        System.out.println("--------");
        
        System.out.println(Arrays.equals(arr1, arr4));
        
        //System.out.println(Arrays.deepEquals(arr1, arr4));
        
        // Möglich aber nicht üblich
        try {
            throw new Error("dfsghksdfhfdskhdfs");
        }
        catch(Error e) {
            System.out.println("Fehler");
        }
        
        /*
        String[] arr2 = {"Peter", "Bob", "Bruce", "bob", "-1", "-2", "!"};
        Arrays.sort(arr2);
        for(String s : arr2) {
            System.out.println(s);
        }
        
        Scout[] arr3 = {new Scout("Peter"), new Scout("Bob")};
        Arrays.sort(arr3);
        for(Scout s : arr3) {
            System.out.println(s.getName());
        }
        */
    }
}

class Scout {
    private final String name;

    public Scout(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
