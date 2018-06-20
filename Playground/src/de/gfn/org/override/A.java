/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.override;

/**
 *
 * @author wsen
 */
class A {
    private void run(){
        System.out.println("A");
    }
    
//    public static void main(String[] args) {
//        B oed = new B();
//        oed.run();
//        A oedi = new B();
//    }
}

class B extends A{
    
    //private void run(){
     void run(){
    // public void run(){    
    // private void run(){    
        System.out.println("B");
    }
    
    
}
