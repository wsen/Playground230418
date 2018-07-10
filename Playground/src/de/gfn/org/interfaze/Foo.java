/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.interfaze;

/**
 *
 * @author student
 */
interface Bar{
    void bar();
}

abstract class FooBase{
   
  public static void bar(){
     System.out.println("In static bar");  
  }    
}

public class Foo extends FooBase implements Bar {



}
