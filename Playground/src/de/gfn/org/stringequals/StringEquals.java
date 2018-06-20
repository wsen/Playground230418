/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.stringequals;

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
        
    }
}
