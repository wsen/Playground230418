/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.constructors;

/**
 *
 * @author wsen
 */
public class ConstructorInit {
   public static void main(String args[] ){ A b = new B("good bye");  }//0
}
class A{
   A() { this("hello", " world");  }
   A(String s) { System.out.println("4: "+s); }//4
   A(String s1, String s2){ this(s1 + s2); }//3
}
class B extends A{
   B(){ super("good bye"); };
   B(String s){ super(s, " world"); }//2
   B(String s1, String s2){ this(s1 + s2 + " ! "); }
}