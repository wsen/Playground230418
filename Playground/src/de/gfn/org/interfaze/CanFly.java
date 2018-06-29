/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.interfaze;

/**
 *
 * @author wsen
 */
public interface CanFly {
    //converted to: public abstract
    void fly();
}

interface HasWings {

    public abstract Object getWindSpan();
}

abstract class Falcon implements CanFly, HasWings {
}

class Casimiro extends Falcon {
    
    @Override
    public void fly(){
        System.out.println("Yes, I can fly");
    }
    
    @Override
    public Object getWindSpan(){
        Object Kradler = new Object();
        System.out.println("Kradler: " + Kradler);
        return Kradler;
    }
    
    public static void main(String[] args) {
        Casimiro c1 = new Casimiro();
        c1.fly();
        c1.getWindSpan();
    }
    
}