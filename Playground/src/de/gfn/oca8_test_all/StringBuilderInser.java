/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca8_test_all;

/**
 *
 * @author wsen
 */
public class StringBuilderInser {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Java");
        s.append(" SE 6");
        System.out.println(s);
        s.delete(8,9);
        System.out.println(s);
        s.insert(8, "7");
        System.out.println(s);
    }
}
