/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.herritage;

/**
 *
 * @author student
 */

class Mammal {
   public Mammal(){}
    
    public Mammal(int age) {
        System.out.println("Mammal");
    }
}

public class Platypus extends Mammal {
    public Platypus() {
       System.out.print("Platypus");
    }
    public static void main(String[] args) {
       new Mammal(5);
    }
 }