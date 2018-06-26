/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.stringequals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author wsen
 */
public class StringEquals {
    public static void main(String[] args) {
        String s1="Rehka";
        //String s2="Rehka";
        String s2= new String("Rehka");
        
        System.out.println(s1.equals(s2)+""); // true // true
        System.out.println(s1 == s2);         // true // false
        
        System.out.println("---------------");
        
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one - hello.equals(s)"); //true    one
        if (t == s) System.out.println("two");              //false 
        if (t.equals(s)) System.out.println("three - t.equals(s)");       //true  tree
        if ("Hello" == s) System.out.println("four - ==");       //true  four
        if ("Hello" == t) System.out.println("five");       //false
        
        System.out.println("-------------");
        ArrayList l = new ArrayList();
        l.size();
        
        System.out.println("-------------");
        String [] names = {"Tom", "Dick", "Harry"};
        //List<String> list = names.asList(); //!! There is no asList() method on an array instance
        List<String> list = Arrays.asList(names);
        list.set(0, "Sue");
        System.out.println(names[0]);

    }
}
