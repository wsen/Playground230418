/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.overriding;

/**
 *
 * @author wsen
 */
class BaseClass{
   public void print(String s) {  System.out.println("BaseClass :"+s); }
}
class SubClass extends BaseClass{
   public void print(String s){
      System.out.println("SubClass :"+s);
      // Line 1
      super.print(s);
   }
   public static void main(String args[]){
      SubClass sc = new SubClass();
      sc.print("location");
   }
}