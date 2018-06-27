/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.collections;

import java.util.ArrayList;

/**
 *
 * @author tlubowiecki
 */
public class ArrayListTest {
    
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Moin");
        arr.add("Moin");
        arr.add(2, "Moin");
        
        for(String s : arr)
            System.out.println(s);
        
        ArrayList<A> arr2 = new ArrayList<>();
        arr2.add(new B());
        
        int[] arr3 = {1,2,3};
        arr3 = new int[]{1,2,3};
        
        StringBuilder sb = new StringBuilder("12345678");
        
        sb.setLength(5);
        sb.setLength(10);
        System.out.println(sb + "###");
        
        
        
    }
}

class A {
    
}

class B extends A {
    
}
