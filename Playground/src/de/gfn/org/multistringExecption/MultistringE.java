/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.multistringExecption;

/**
 *
 * @author wsen
 */
public class MultistringE {

    public static void main(String[] args) {
        String ejgStr[] = new String[][]{{null}, new String[]{"a", "b", "c"}, {new String()}}[0];
        String ejgStr1[] = null;
        String ejgStr2[] = {null};
        System.out.println(ejgStr[0]);
        System.out.println(ejgStr2[0]);
        System.out.println(ejgStr1[0]);
    }
}


