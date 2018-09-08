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
public class TestArrayIndexMethod {
   public static int[ ] getArray() {  return null;  }
   public static void main(String[] args){
      int index = 1;
      try{
         getArray()[index=2]++;
         //null[2];
         
      }
      catch (Exception e){  }  //empty catch
      System.out.println("index = " + index);
   }    
}

/*
If the array reference expression produces null instead of a reference to an array, 
then a NullPointerException is thrown at runtime, but only after all parts of the array reference 
expression have been evaluated and only if these evaluations completed normally. 

This means, first index = 2 will be executed, which assigns 2 to index. 
After that null[2] is executed, which throws a NullPointerException. 
But this exception is caught by the catch block, which prints nothing. 
So it seems like NullPointerException is not thrown but it actually is.

In other words, the embedded assignment of 2 to index occurs before the check for array reference 
produced by getArray().

In an array access, the expression to the left of the brackets appears to be fully 
evaluated before any part of the expression within the brackets is evaluated. 
Note that if evaluation of the expression to the left of the brackets completes abruptly, 
no part of the expression within the brackets will appear to have been evaluated
*/