/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.initOrder;

/**
 *
 * @author student
 */
public class YetMoreInitializationOrder {

    static {
        add(2); //2
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    YetMoreInitializationOrder() { //7
        add(5);
    }

    static {
        add(4); //3
    }

    {
        add(6); //4
    }

    static {
        new YetMoreInitializationOrder(); //5 Objekt wird erzeugt -> init: //6 Instanzvar //7 Constructor
    }

    {
        add(8);//6
    }

    public static void main(String[] args) { //1
        System.out.println("main");
    }
}
