/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

/**
 *
 * @author student
 */
public class BooleanStuff {
    public static void main(String[] args) {
        //boolean x = true == 3; // Will not compile
        boolean x = 5.0 != 5.001;
        System.out.println("Zuweisung eines bools: " + x);
    }
}
