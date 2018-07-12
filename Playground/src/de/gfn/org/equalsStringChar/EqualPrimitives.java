/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.equalsStringChar;

/**
 *
 * @author wsen
 */
public class EqualPrimitives {
    public static void main(String[] args) {
        Integer i1 = 1; 
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;
        
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println("i1 == b1");
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(g1));
        System.out.println(i1.equals(b1));

    }
}
