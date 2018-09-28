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
public class FinalDefault {
    static final int id; //variable id not initialized in the default constructor
    // Also keine default Initialiesierung  bei final !!
    
    public static void main(String[] args) {
        System.out.println("id: " + id);
    }
}
