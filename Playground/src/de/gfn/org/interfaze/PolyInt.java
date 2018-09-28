/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.interfaze;

/**
 *
 * @author wsen
 */
public class PolyInt {
   public static void main(String[] args){
      Ap a = new Ap();
      B b = new B();
       System.out.println("");
      System.out.println(a instanceof T1); //will return true.
      System.out.println(a instanceof T2); //will return true.
      System.out.println(b instanceof T1); //will return true.
      System.out.println(b instanceof T2); //will return true.
      System.out.println(b instanceof Ap); //will return false.
   };
}
class Ap implements T1, T2{}
class B extends Ap implements T1{}
interface T1 { }
interface T2 { }