/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
class Animal {
    public String noise() {
        return "peep";
    }
}

class Dogg extends Animal {
    public String noise() {
        return "bark";
    }
}

class Cat extends Animal {
    public String noise() {
        return "meow";
    }
}

public class AnimalZoo {
    public static void main(String[] args) {
        Animal animal = new Dogg();
        Cat cat = (Cat)animal;
        System.out.println(cat.noise());
    }    
}

/*
ClassCastException Dogg cannot be cast to Cat
*/
