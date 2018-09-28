/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.methods;

/**
 *
 * @author wsen
 */
class Base{
   void methodA(){
      System.out.println("base - MethodA");
   }
}

class Sub extends Base{
   public void methodA(){
      System.out.println("sub - MethodA");
   }
   public void methodB(){
      System.out.println("sub - MethodB");
   }
   public static void main(String args[]){
      Base b=new Sub(); //1
      b.methodA(); //2
      //b.methodB(); //3
   }
}
