/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.invalid;

/**
 *
 * @author wsen
 */
public class TestClassInvalid { //1
    
   int[] ia = new int[1];
   Object oA[]  = new Object[1];
   boolean bool;

   public static void main(String[] args)  { // 2

      int i = 0;
      for (i=1 ;  i<5  ; i++) continue;  //(1)
      for (i=0 ;       ; i++) break;       //(2)
      for (    ; i<5?false:true ;    );     //(3)
      
      char cA[][] = new char[3][];
      for (int ii=0; ii<cA.length; ii++) cA[i] = new char[4];
      
       System.out.println("-------chaos-------");
       TestClassInvalid test = new TestClassInvalid();
       System.out.println(test.ia[0] + "  " + test.oA[0]+"  "+test.bool);
   }
}
