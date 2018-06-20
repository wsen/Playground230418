/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.trycatch;

/**
 *
 * @author wsen
 */
public class TryCatchThrow {

    public void bad() {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {// DOES NOT COMPILE
            System.out.print("sad rabbit");
        }
    }

    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }

    private static void eatCarrot() {
    }

}
