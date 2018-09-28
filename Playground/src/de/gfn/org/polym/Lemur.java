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
    
//    public boolean isTailStriped() {
//        return true;
//    }
}

 class Lemur extends Primate implements HasTail {

    public boolean isTailStriped() {
        return false;
    }
    public int age = 10;
    //byte static brick = 127;
    static byte brick = 127;

    public static void main(String[] args) {
        Lemur lemur = new Lemur(); 
// only one object, Lemur, is created and referenced
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println("lemur: " +hasTail.isTailStriped());
//        System.out.println(hasTail.age); // DOES NOT COMPILE
        Primate primate = lemur;
        System.out.println(primate.hasHair());
//        System.out.println("primate: " + primate.isTailStriped());
    }
}
/*
10
false
true
*/