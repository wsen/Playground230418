/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
public class Standards {
    public static void main(String[] args) {
        Object obj = new Integer(3);
        //String str = (String) obj; //ClassCastException (Object -> String)
        System.out.println(obj);
        System.out.println(5 / 0); //ArithmeticException
    }
}
