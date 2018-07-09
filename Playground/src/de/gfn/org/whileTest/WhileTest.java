/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.whileTest;

/**
 *
 * @author student
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 1, j = 10;
        do {
            if (i++ > --j) continue; //
                System.out.println("i mittenDrin: " + i + " j: " +j);
        } while (i<5);
        System.out.println("i Ende: " + i + " j: " +j);
    }
}
