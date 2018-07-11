/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
public class SoundsLikeNumberFormat {

    static String s = "heinz";
    //int a = null;

    public static void m0(int a, int b) {
        s += a; 
        m2();
        m1(b);
    }

    public static void m1(int i) {
        s += i;
        System.out.println(s);
    }

    public static void m2() {
        throw new NullPointerException("aa");
    }

    public static void m() {
        m0(1, 2);
        m1(3);
    }

    public static void main(String args[]) {
        try {
            m();
        } catch (Exception e) {
        }
        System.out.println(s);
    }
}
