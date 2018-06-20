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
abstract class Animal{
    void run(){
        System.out.println("Animal run");
    }
    abstract void sound();
    abstract Number number();
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Bark");
    }
    
    @Override
    public void run(){
        System.out.println("Dog runs");
    }
    
    @Override
    public Integer number() throws NumberFormatException {
        return 42;
    }
    
}

public class Whiz {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
        dog.run();
        dog.number();
        
//        int xx = 0;
//        while(xx++ < 10) {}
//        String message = xx > 10 ? "Greater than" : false;  //ERROR: false to string
//        System.out.println(message+","+xx);

    }   
}
