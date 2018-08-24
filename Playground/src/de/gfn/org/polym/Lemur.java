/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.polym;

/**
 *
 * @author wsen
 */
class Primate {

    public boolean hasHair() {
        return true;
//280 Chapter 5 ■ Class Design
    }
}

 class Lemur extends Primate implements HasTail {

    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());
    }
}
/*
10
false
true
*/