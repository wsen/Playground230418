/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.cast;

/**
 *
 * @author wsen
 */
public class CastTest {
    
    static int x = 10;
    final int x1= 10;
    
    public static void main(String[] args) {
        //byte b = 127;
        
        byte b = -128;
        System.out.println("Max Byte: " + Byte.MAX_VALUE);
        int i = b;
        b = (byte) i;
        System.out.println(i+" "+b);
    }
}
