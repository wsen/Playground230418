/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.constructorchaining;

/**
 *
 * @author wsen
 */
public class Mouse {

    private int numTeeth;
    private int numWhiskers;
    private int weight;

    public Mouse(int weight) {
        this(weight, 16); // calls constructor with 2 parameters
    }

    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // calls constructor with 3 parameters
    }

    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        mouse.print();
    }
}


