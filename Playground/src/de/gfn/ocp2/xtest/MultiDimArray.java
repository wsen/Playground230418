/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp2.xtest;

/**
 *
 * @author student
 */
public class MultiDimArray {
    public static void main(String[] args) {
        //String[][] twoD = new String[3][2];
//        String ejgStr[] = new String[][]{{null}, new String[] {"a","b","c"}, {new String()}}[0];
        String[] twoD = new String[][]{{null}, new String[] {"a","b","c"}, {new String("oca")}}[1];
        for (int i = 0; i < twoD.length; i++) {
            //for (int j = 0; j < twoD[i].length; j++)
            //    System.out.print(twoD[i][j] + " "); // print element
            System.out.println(i + ": " + twoD[i]); //row
            //System.out.println(); // time for a new row
            
        }
    }
}
