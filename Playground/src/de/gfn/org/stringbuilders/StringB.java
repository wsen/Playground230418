/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.stringbuilders;

/**
 *
 * @author wsen
 */
public class StringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(4);
        sb.append("1234");
        
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println("----------");
        
        sb.append(new Object());
        
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        
        System.out.println("---- sb2 animal ------");
        StringBuilder sb2 = new StringBuilder("animal");
        
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        //System.out.println(sb2.get);
        
        System.out.println("---- StringBuilder Object, boya OCA 113 ----");
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
    
}
