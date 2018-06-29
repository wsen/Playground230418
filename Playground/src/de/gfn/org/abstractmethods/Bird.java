/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.abstractmethods;

/**
 *
 * @author wsen
 */

public abstract class Bird {
    private void fly() { System.out.println("Bird is flying"); }
    public static void main(String[] args) {
       Bird bird = new Pelican();
       bird.fly();
       Pelican perlican = new Pelican();
       perlican.fly();
    }
 }

class Pelican extends Bird{
    protected void fly() { System.out.println("Pelican is flying"); }
}
