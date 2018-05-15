/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.polym;

/**
 *
 * @author student
 */
public class Primate {

    public boolean hasHair() {
        return true;
    }
}

public interface HasTail {

    public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {

    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age); // Klassenvariable
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped()); // Referenced interface method
        Primate primate = lemur;
        System.out.println(primate.hasHair()); //Referenced superClass method
    }
}
