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


public class InterfaceCall {
    public static void main(String[] args) {
        A a = new A();
        I ia = new A();
        I i = new I(){};
        
        System.out.println(a.equals(ia) + "" + i.equals(ia));
    }
}
