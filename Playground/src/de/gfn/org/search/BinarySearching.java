/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.search;

import java.util.Arrays;

/**
 *
 * @author wsen
 */
public class BinarySearching {
    public static void main(String[] args) {
        int[] random = { 12, 9, -4, 0, -10 };
        // Needs to be sorted before binarySearch
        Arrays.sort(random); //-10 -4 0 6 12
        int x = 11;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
    }
}
