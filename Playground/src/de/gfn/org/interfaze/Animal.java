/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.interfaze;

/**
 *
 * @author student
 */
public class Animal {
    
}

class Lion extends Animal implements Jumpable {
    
    @Override
    public void fly(int speed){}
    
    public static void main(String[] args) {
        Jumpable var1 = new Jumpable(); //Jumpable is abstract, cannot be instantiated
        Animal var2 = new Animal();
        Animal var22 = new Lion();
        Lion var3 = new Animal(); //incompatible Types, Parent Class cannot be convertet into a child
        Jumpable var4 = new Animal(); //incompatible
        Jumpable var6 = (Jumpable)(new Animal());
        Jumpable var7 = (Jumpable)(new Lion());
    }
}