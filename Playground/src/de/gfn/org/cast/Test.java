/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.cast;

/**
 *
 * @author wsen
 */
class Super { static String ID = "QBANK"; }

class Sub extends Super{
   static { System.out.print("In Sub"); }
}
public class Test{
   public static void main(String[] args){
      System.out.println(Sub.ID);
   }
}
