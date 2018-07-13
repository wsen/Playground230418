/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.heritance;

/**
 *
 * @author wsen
 */

class Animalo {
    Animalo(String s){super();}
}

//class Cat extends Animalo {
//    Cat(String s){
//        super("");
//        System.out.println(s);
//    }
//    Cat(){ super("Cat");}
//}

//class Cat extends Animalo {
//    Cat(String s){
//        super(null);
//        System.out.println("Cat");
//    }
//    Cat(){ super("Cat");}
//}

class Cat extends Animalo {
    Cat(String s){
        super(null);
        System.out.println(s);
    }
    Cat(){ this("Cat");}
}

public class CatSuper {
    public static void main(String[] args) {
        Animalo ab = new Cat();
    }
}
