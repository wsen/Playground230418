/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.teststuff.nr2;

/**
 *
 * @author student
 */
public class Test {
    public static void main(String[] args) {
        B bb = new B();
        C c = new C();
        //C a = (C) b;
        bb.machWas(); c.machWas(); //a.machWas();
        System.out.println("-------\n");
        
        String a = "abc";
        String b = a.toUpperCase();
        //a = a.toUpperCase();
        
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        
        System.out.println("---Method Chaining----\n");
        String start = "AniMaL   ";
        String lowercase = start.trim().toLowerCase(); // "animal"
        String result = lowercase.replace('a', 'A'); // "Animal"
        System.out.println(result);
    }
}


