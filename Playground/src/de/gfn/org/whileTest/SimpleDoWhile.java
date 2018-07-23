/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.whileTest;

/**
 *
 * @author student
 */
public class SimpleDoWhile {
    public static void main(String[] args) {
        int x = 10;
        do{
         x--;
         System.out.println(x);  // 1
        }while(x<10); //Unendlichkeit hasta MIN_VALUE:  -2147483648
                      //Rolls over to:  2147483647 Integer.MAX_VALUE
        //}while(x<9);
    }
}
