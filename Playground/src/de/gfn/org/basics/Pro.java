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
class Pro {
    public static void main(String[] args) {
        Print p = new Print();
        p.print(6);
        System.out.println("1" + 2 + 3); // would print 15 f
        System.out.println(4 + 1.0f); //would print 5.0
        System.out.println(5/4); //would print 1.25 f 1
        System.out.println('a' + 1 ); //would print b. f 98


    }
}

class Print {
    private static void p2(int i){
        System.out.println(i * 2);
    }
    
    static void print(int i){
        System.out.println(i);
    }
}
