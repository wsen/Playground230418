/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.abstractmethods;

/**
 *
 * @author wsen
 */

 abstract class Reptile {
    //public final void layEggs() { System.out.println("Reptile laying eggs");
    public void layEggs() { System.out.println("Reptile laying eggs");
}
    public static void main(String[] args) {
       Reptile reptile = new Lizard();
       reptile.layEggs();
        System.out.println("Wau: psvm innerhalb abstrakter Klasse !!!");
    }
 }

public class Lizard extends Reptile {
    @Override
    public void layEggs() { System.out.println("Lizard laying eggs"); }
    //!! Does not work with final in Reptile.layEggs 
}
