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
class A {
    //Konstruktor
    // Mit Parameter, ohne impliziten no-argument Konstruktor
    A (String satz){
        System.out.println("A");
    }
    
    A () {
        System.out.println("A no Params");
    }
    
    void machWas() {
        System.out.println("A");
    }
}
