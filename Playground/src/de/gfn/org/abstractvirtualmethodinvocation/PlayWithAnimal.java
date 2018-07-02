/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.abstractvirtualmethodinvocation;

/**
 *
 * @author wsen
 */
abstract class Animal {

    String name = "???";

    public void printName() {
        System.out.println(name);
    }
}

class Lion extends Animal {

    String name = "Leo";
    
    public void printName() {
        System.out.println(name);
    }
}

public class PlayWithAnimal {

    public static void main(String... args) {
        Animal animal = new Lion();
        animal.printName();
        Lion animal2 = new Lion();
        animal2.printName();
    }
}
