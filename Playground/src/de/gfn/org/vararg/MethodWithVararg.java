/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.vararg;

/**
 *
 * @author wsen
 */


public class MethodWithVararg {
    double howMany(boolean b, boolean... b2) {
        return 20;  //b2.length;
    }
    
    public static void main(String[] args) {
 //        System.out.println(""+new MethodWithVararg().howMany(true, true, true, true));
         System.out.println(""+new MethodWithVararg().howMany(true, new boolean[22]));
    }
    
}
