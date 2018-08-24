/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.overriding;

/**
 *
 * @author wsen
 */
class Canine {
    public double getAverageWeight() {
        return 50;
    }
}
public class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
        //return getAverageWeight()+20; // INFINITE LOOP exception
    }
    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}
