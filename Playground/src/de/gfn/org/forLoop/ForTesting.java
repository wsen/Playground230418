/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.forLoop;

/**
 *
 * @author student
 */
public class ForTesting {

    public static void main(String[] args) {
        int x = 0;
        //for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
        for (long y = 0, z = 4; x < 5 || y < 3; x++, y++) { // out: 4 ,Short Curcuit
        //for (long y = 0, z = 4; x < 5 && y < 14; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }
}
