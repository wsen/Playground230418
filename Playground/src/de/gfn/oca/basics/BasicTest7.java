/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class BasicTest7 {
    
    public static void main(String[] args) {
        
        Integer i1 = 1 + 3;
        Integer i2 = 4;
        
        System.out.println(i1 == i2);
        
        Object[] arr = new String[10][10][10];
        
        Object o = new ArrayList<String>();
        List<String> l = (List<String>) o;
        ArrayList<String> a = (ArrayList<String>) o;
        
        //List<String> l2 = new ArrayList();
        
        //Object[] arr1 = new String[10];
        
        Long l1 = 10l;
        Long l2 = 10l;
        
        Integer i5 = 128;
        Integer i6 = 128;
        
        int i7 = 10;
        
        System.out.println(l1.hashCode() + " " + i5.hashCode());
        System.out.println(((Number)l1) == ((Number)i5));
        System.out.println(l1 == l2);
        System.out.println(i5 == i6);
        
        System.out.println(i7 == l1);
        
        double d7 = 10.0;
        Integer i8 = 10;
        
        System.out.println(d7 == i8);
        
        long l10 = new Integer(10); // AutoUmboxing und Widening von int > long
        
        Number n1 = 10; // AutoBoxing und Widening von Integer > Number
        
        //double d15 = new Object(); 
        
        //int i10 = new Long(10);
        
        char c = 'A';
        
        int i15 = c;
        i15++;
        
        System.out.println(c);
        // c = (char) c + 1;
        
        
    }
    
    /**
     * Macht irgendwas nettes
     * 
     * @param i Alter des Scouts
     * @return liefert einen wichten Wert
     */
    public String machWas(int i) {
        return null;
    }
}
