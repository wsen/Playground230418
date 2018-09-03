/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class MultiArrayLastE {
    static String[][] arr = new String[3][];
    private static void doPrint(){
        for(int i=0; i<arr.length; i++){
            int j = arr[i].length-1;
            System.out.println(arr[i][j]);
        }
    }
    public static void main(String[] args) {
        String[] class1 = {"A","B","C"};
        String[] class2 = {"L","M","N","O"};
        String[] class3 = {"I","J"};
        arr[0] = class1;
        arr[1] = class2;
        arr[2] = class3;
        MultiArrayLastE.doPrint();
    }
}
