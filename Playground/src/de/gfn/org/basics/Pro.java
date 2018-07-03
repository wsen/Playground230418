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
