/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.polym;

/**
 *
 * @author wsen
 */
class TestClass implements I1, I2{
   @Override
   public void m1() { System.out.println("Hello"); }
   public static void main(String[] args){
      TestClass tc = new TestClass();
      ( (I1) tc).m1();
//      ( (I2) tc).m1();
      System.out.println(( ( I2) tc).VALUE);
       tc.m1();
   }
}
interface I1{
   int VALUE = 1;
   void m1();
}
interface I2{
   int VALUE = 2;
   void m1();
}
