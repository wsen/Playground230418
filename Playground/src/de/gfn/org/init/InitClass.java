/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.init;

/**
 *
 * @author wsen
 */
public class InitClass {
   public static void main(String args[ ] ){
      InitClass obj = new InitClass(5);
   }
   int m; //4  m=0
   static int i1 = 5; //1
   static int i2 ; //2
   int  j = 100;//5 j=100
   int x; //6  x=0
   public InitClass(int m){  //8
      System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
//                         6        40            0         30          5    
   }
   { j = 30; i2 = 40; }  // Instance Initializer //7 j=30  i2=40
   static { i1++; }      // Static Initializer  //3 i1=5

}
