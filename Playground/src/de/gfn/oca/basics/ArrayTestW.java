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
public class ArrayTestW {
    public static void main(String[] args) {
        int[] zahlen = new int[10]; //Positionen 0 bis 9
        zahlen[8] = 10;
        
        String beans[] = new String[6];
        int[][] types = new int[2][];
        int[] types1[] = new int[2][];
        int types2[][] = new int[2][];
        //int[] nix = new int[];
        int[] nix = new int[0];
        
        System.out.println(zahlen);
        
        int[] z1 = {5,10,20,3,7};
        
        int zahlen2[];
        //String[] wörter = new String[2];
        
        String[] wörter = {"Peter","Bruce","Clark"}; //nur bei Erstzuweisung möglich
        System.out.println(wörter);
        
        
        
    }
}
