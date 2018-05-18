/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.statick;

import java.util.ArrayList;
//import de.gfn.oca.staticstuff.Static;

/**
 *
 * @author student
 */
public class Statick {
    private String name = "This is a Statick class";
    private int sinnDesLebens = 42;
    public static int keinSinn = 41;
    
    private static final ArrayList<String> values = new ArrayList<>();

    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }
    
    public int fourth() {
        return sinnDesLebens;
    }
    
    public static void fifth() {
        System.out.println(keinSinn);
    }

    public static void main(String args[]) {
        first();
        second();
        // new Static().third(); //must be imported !!
        new Statick().third();
        //third(); // DOES NOT COMPILE and cannot be made static because      
        // of refering to a nonstatic String method/object.
        // FIX: call third as instance method. f.ex: new Static().third();
        //Static derSinnDesLebensIst = new Static().fourth();
        //Static derSinnDesLebensIst = 
        int derSinnDesLebens = new Statick().fourth();
        System.out.println("Der wahre Sinn des Lebens ist doch: " + derSinnDesLebens );
        fifth();
        
        //
        values.add("changed");
    }
}
