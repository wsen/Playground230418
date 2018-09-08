/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.array;

/**
 *
 * @author wsen
 */
public class OrderTest {
    public void initData(String[] arr){
        int ind = 0;
        for(String str : arr){
            str.concat(str+" "+ind);
            ind++;
            System.out.println(str);
        }
    }
    
    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {
        OrderTest ot = new OrderTest();
        //String[] arr = new String[2];
        String[] arr = new String { "cricket", "beetle", "ladybug" };
        ot.initData(arr);
        //ot.printData(arr);
    }    
}
