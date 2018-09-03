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
public class NullPrint {
    static double dvalue;
    static NullPrint ref;                     //null
    //static NullPrint ref = new NullPrint(); //de.gfn.org.oca.NullPrint@70dea4e
    public static void main(String[] args) {
        System.out.println(ref);
        System.out.println(dvalue);
    }
}
