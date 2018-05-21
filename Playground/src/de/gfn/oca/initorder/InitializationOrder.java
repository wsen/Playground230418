/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.initorder;

/**
 *
 * @author wsen
 */
public class InitializationOrder {

    private String name = "Torchie";

    {
        System.out.println(name);
    }
    private static int COUNT = 0;

    static {
        System.out.println(COUNT);  // 1
    }

    {                               // non-static
        COUNT++;
        System.out.println(COUNT);
    }

    public InitializationOrder() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("read to construct");
        new InitializationOrder();
    }
}
