/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

/**
 *
 * @author wsen
 */
public class DoubleDiv {
    public static void main(String[] args) {
        Double d1 = 0.0/0.0;
        
        //System.out.print(Double.isNaN()+ "");
        System.out.print(d1.isNaN()+ "");
        System.out.print(d1.isInfinite());
    }
}
