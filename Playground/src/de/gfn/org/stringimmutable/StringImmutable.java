/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.stringimmutable;

/**
 *
 * @author student
 */
public class StringImmutable {

    public static void main(String[] args) {
        Integer i = 10;
        Integer j = i;
        i++;
        System.out.println(i);
        System.out.println(j);
        
        System.out.println("----concat----");
        String abc = "";
        abc.concat("abc");
        abc.concat("def");
        System.out.println(abc);
    }

}
