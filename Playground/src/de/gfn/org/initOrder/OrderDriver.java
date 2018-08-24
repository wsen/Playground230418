/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.initOrder;

/**
 *
 * @author wsen
 */

class Order {
    static String result = "";
    {
        result += "c";
    }
    static { result += "u";}
    { result += "r";}
}

public class OrderDriver {
    public static void main(String[] args) {
        System.out.print(Order.result + " "); 
        System.out.print(Order.result + " ");
        new Order();
        new Order();
        System.out.print(Order.result + " ");
        //System.out.print(new Order().result + " ");
    }
}
