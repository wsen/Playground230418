/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.override;

/**
 *
 * @author wsen
 */
class Base {
      public void func(){
            System.out.println("In base func method");         
      };
      public void func2() {
          System.out.println("func2");
          func();
      }
}

class Derived extends Base {
      public void func(){   //  Is this an overriding method?
            System.out.println("In Derived Class func method"); 
      }
}

class InheritDemo {
      public static void main(String [] args) {
            Derived D = new Derived();
            D.func2(); 
      }
}