/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.subclass;

/**
 *
 * @author student
 */
public class SubSub extends Sup{
    SubSub(){
        s += "subsub ";
    }
    
    public static void main(String[] args) {
        System.out.println(new SubSub().s);
    }
}
