/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.datatypes;

/**
 *
 * @author wsen
 */
public class TypeCasts {
    public static void main(String[] args) {
        Byte b1 = (byte)100;
        Integer i1 = 200;
        Long l1 = (long)300;
        Long ln1 = 300L;
        Float f1 = (float)b1 + (int)l1; //4
        String s1 = 300; //5
        if (s1 == (b1 + i1))
            s1 = (String)500;
        f1 = (int)100;
        System.out.println(s1 + " : " + f1);
    }
}
