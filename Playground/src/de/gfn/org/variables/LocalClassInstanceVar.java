/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.variables;

/**
 *
 * @author wsen
 */
public class LocalClassInstanceVar {
    static double percent; //1
    int offset = 10, base= 50; //2
    public static double calc(double value) {
        //int coupon, offset, base; //3
        int coupon=0, offset=0, base=0; //3
        if(percent <10){ //4
            coupon = 15;
            offset = 20;
            base = 10;
        }
        return coupon*offset*base*value/100; //5
    }
    public static void main(String[] args) {
        System.out.println(calc(100));
    }
}
