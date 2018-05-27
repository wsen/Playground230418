/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.overloading;

/**
 *
 * @author wsen
 */
public class Plane {
  public void fly(int i) {
     System.out.print("int ");
  }

  public void fly(long l) {
     System.out.print("long ");
   }
   
   public static void main(String[] args) {
     Plane p = new Plane();
        p.fly(123);
        p.fly(123L);
        p.fly((int)123L); // with cast
    } 
}
