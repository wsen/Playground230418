/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
public class StringBuilderEquals {
    public static void main(String[] args) {
        String s = "blooper";
        StringBuilder sb = new StringBuilder(s);        
        StringBuilder s1 = new StringBuilder("meow");
        StringBuilder s2 = new StringBuilder("meow");
        System.out.println("-- Ausgabe --");
        if (s1 == s2) System.out.println("one");
        if (s1.equals(s2)) System.out.println("two");
//        if (s1 == "meow") System.out.println("three");
        if (s1.toString() == "meow") System.out.println("four");
    }
}
