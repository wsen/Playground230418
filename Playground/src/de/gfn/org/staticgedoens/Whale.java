/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.staticgedoens;

/**
 *
 * @author wsen
 */
public class Whale {
    public static void main(String[] args) {
 //     boolean hungry = false;
        boolean hungry = true;
 //       while (hungry=true) {
        while (hungry) {
            ++Fish.count;
            hungry = false;
        }
        System.out.println(Fish.count);
    }
}

class Fish {
    static byte count;
}
