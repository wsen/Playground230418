/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.canhopinterface;

/**
 *
 * @author wsen
 */
public class Frog implements CanHop {
    public static void main(String[] args) {
        Frog frog1 = new TurtleFrog();
        TurtleFrog frog2 = new TurtleFrog();
        BrazilianHornedFrog frog3 = new BrazilianHornedFrog();
        Object frog4 = new TurtleFrog();
     }
     
}
