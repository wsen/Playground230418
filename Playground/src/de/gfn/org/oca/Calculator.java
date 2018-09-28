/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class Calculator {
    public static void main(String[] args) {
        int num = 5;
        //int sum; //not initialized
        int sum = 0;
        
        do {
            sum += num; //variable sum might not have been initialized
            System.out.println("wsum: " + sum + " num " + num);
        } while ((num--) > 1);
        
        System.out.println("The sum is: " + sum);
        
        num = 5;
        //int sum; //not initialized
        sum = 0;
         //while ((num--) > 1) {
         while (num-- > 1) { // num-- keine Zuweisung, d.h. dekrement kommt nicht zum Tragen
            sum += num; //variable sum might not have been initialized
            System.out.println("wsum: " + sum + " num " + num);
        }
        
         System.out.println("The sum is: " + sum);
         
    }
}
