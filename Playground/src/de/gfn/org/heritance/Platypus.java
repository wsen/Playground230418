/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.heritance;

/**
 *
 * @author student
 */

class Mammal {
   public Mammal(){System.out.println("Mammal pur");} //no argument constructor -> without no compiles
    
    public Mammal(int age) {
        System.out.println("Mammal");
    }
}

public class Platypus extends Mammal {
    
    public Platypus() {
       super();
       System.out.print("Platypus");
    }
    public static void main(String[] args) {
       new Mammal(5);
       new Platypus();
    }
 }