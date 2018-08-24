/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.stringbuilder;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(15);
        //sb.setLength(10);
        //sb.setLength(10);
        System.out.println(sb.length());
        //Array Def
        java.util.Date[] dates[] = new java.util.Date[2][];
        //----- try to compare StB with Str -----
        String s = "12345678";
        String beans[] = new String[6];
        int[][] scores = new int[5][];
        //if(s == sb) //incomparable types
        if(s.equals(sb)) //
            System.out.println("Haut#s da an Vogl aussi");
        else
            System.out.println("Haut#s da'n hoit net aussi");
        //-----
        String si = "purr";
        si += " two";
        System.out.println(si.length());
        System.out.println("---- another vogel-----");
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals");
    }
    
    ArrayList<String> al = new ArrayList<>();
}
