/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.staticstuff;

/**
 *
 * @author student
 */
public class Statick {
    private String name = "Statick class";
    private int sinnDesLebens = 42;

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }
    
    public int fourth() {
        return 42;
    }


    public static void main(String args[]) {
        first();
        second();
        new Static().third();
        //third(); // DOES NOT COMPILE and cannot be made static because      
        // of refering to a nonstatic String method/object.
        // FIX: call third as instance method. f.ex: new Static().third();
        //Static derSinnDesLebensIst = new Static().fourth();
    }
}
