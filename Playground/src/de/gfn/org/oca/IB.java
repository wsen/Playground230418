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
class A {//3 
    int x = 23;
    A() {
        System.out.println(" A " + x);
    }
}

public class IB extends A{
    IB() {//2 ruft dann super
        x++;//4 x= x+1
        System.out.println("this-x dann: " + this.x);
        //super.x = this.x;
        System.out.println(" B " + super.x);
    }
    IB(int y) {
        this(); //1 ruft weiteren KOnstruktor
        this.x = y;
        System.out.println(" B2 " + x);
    }
    
    public static void main(String[] args) {
        IB bx = new IB(200);
    }
}
