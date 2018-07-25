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
public class SuperCountWhile {
    public static void main(String[] args) {
        String s = "hello java";
        char space = ' ';
        int index = 0;
        int count = 0;
        while (index < s.length() -1){// || s.charAt(index) == space) {
            count++;
            index = count;
        }
        System.out.println(s.length() - count);
    }
}
