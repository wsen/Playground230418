/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.wrapper;

/**
 *
 * @author wsen
 */
public class BooleanWrapper {

    public static void main(String[] args) {
        boolean[] b1 = new boolean[2]; //
        boolean[] b2 = {true, false};
        System.out.println("" + (b1[0] == b2[0]) + ", " + (b1[1] == b2[1]));
    }
}
