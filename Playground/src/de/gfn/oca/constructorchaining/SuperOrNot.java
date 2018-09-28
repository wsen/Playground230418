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
class X{
    public X(){
        System.out.println("In X");
    }
}

class Y extends X{
    public Y(){
        //super();  // or not, because super allways implicitly called
        System.out.println("In Y");
    }
}

class Z extends Y{
    public Z(){
        System.out.println("In Z");
    }
}

public class SuperOrNot {

    public static void main(String[] args) {
        Y y = new Z();
    }
}
