/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.iterator;

/**
 *
 * @author wsen
 */
public class InkrementTest {
    public static void main(String[] args) {
        int i = 1;
        int j = i++;
        System.out.println("vor if i: " + i + " j: " + j);
        if( (i==++j) | (i++ == j) ){
            System.out.println("i: " + i + " j: " + j);
          i+=j;
        }
        System.out.println(i);
    }
}
