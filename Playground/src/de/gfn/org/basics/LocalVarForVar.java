/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.basics;

/**
 *
 * @author student
 */
public class LocalVarForVar {
    public static void main(String[] args) {
        int i;
        int j;
        for(i=0, j=0; j<i; ++j, i++){
            System.out.println(i + " for " + j);
        }
        System.out.println(i + " main " + j);
    }
}
