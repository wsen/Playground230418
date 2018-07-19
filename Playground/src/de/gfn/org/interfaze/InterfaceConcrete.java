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



public class InterfaceConcrete implements Dominator {

    @Override
    public void CanFly() {
        System.out.println("Fliege mal " + MINIMUM_DEPTH);
    }
    
    public static void main(String[] args) {
        Integer condition = new Integer("1");
        System.out.println("condischn: " + condition);
        
        short s = Short.MAX_VALUE;
        //char c = s;
        System.out.println( Short.MAX_VALUE);//c == 
        
        InterfaceConcrete fliege = new InterfaceConcrete();
        fliege.CanFly();
        //System.out.println(fliege.CanFly(););
    }
    
}
