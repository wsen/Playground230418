/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.methodcalls;

/**
 *
 * @author wsen
 */
public class Rope {

    public static void swing() {
        System.out.print("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public static void play() {
        swing();
        //climb(); // error: non-static method climb() cannot be referenced from a static context
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();
    }
}

