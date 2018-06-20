/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.herritage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wsen
 */
class Animal {
    public void eat() throws Exception {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
    
//-------- + throws Exception
//    public static void main(String[] args) throws Exception {
//        Animal a = new Dog();
//        Dog d = new Dog();
//        d.eat();
//        a.eat();
//    }
    
//-------- + try catch 4 statement
//    public static void main(String[] args) {
//        Animal a = new Dog();
//        Dog d = new Dog();
//        d.eat();
//        try {
//            a.eat();
//        } catch (Exception ex) {
//            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//-------- + try catch 4 block    
//    public static void main(String[] args) {
//        try {
//            Animal a = new Dog();
//            Dog d = new Dog();
//            d.eat();
//            a.eat();
//        } catch (Exception ex) {
//            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

//-------- ORIGINAL    
    public static void main(String[] args) {
            Animal a = new Dog();
            Dog d = new Dog();
            d.eat();
            a.eat();
    }     
}
