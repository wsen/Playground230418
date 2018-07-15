/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.immutableTest;

/**
 *
 * @author wsen
 */
public class StringImmutable {
    public static void main(String[] args) {
        int[] testThis = new int[0];//needs Array Dimension
        
        String test = "";
        test += "a";
        test += "b";
        System.out.println("test (immutable) = "+test);
        test += "c";
        test += "d";
        System.out.println("test (still immutable) = "+test);
    }
}
