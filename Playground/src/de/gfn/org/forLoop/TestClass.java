/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.forLoop;

/**
 *
 * @author wsen
 */
public class TestClass{
   public static void main(String args[]){
      int x  = 0;
      //labelA:   for (int i=10; i<0; i--){  //never entering the loop!!!
      labelA:   for (int i=10; i>0; i--){
         int j = 0;
         labelB:
         while (j < 10){
            if (j > i){ System.out.println("tatsächlich: " + i + ":" + j); break labelB; };
            if (i == j){
               x++;
                System.out.println("kontinhu: "+ i + ":" + j + ":"+x);
               continue labelA;
            }
            j++;
         }
         x--;
      }
      System.out.println(x);
   }
}