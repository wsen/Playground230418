/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.methods;

/**
 *
 * @author wsen
 */
public class Test {

    public void print(byte x) {
        System.out.print("byte");
    }

    public void print(int x) {
        System.out.print("int");
//224 Chapter 4 ■ Methods and Encapsulation
    }

    public void print(float x) {
        System.out.print("float");
    }

    public void print(Object x) {
        System.out.print("Object");
    }

    public static void main(String[] args) {
        Test t = new Test();
        short s = 123;
        long y = s * (long) s;
        t.print(s);
        t.print(true);
        t.print(6.789); //0.0 -> immer in double //hier in object (missing double)
        t.print(6.789f); //-> float
    }
}
