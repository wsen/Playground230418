/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.heritance;

/**
 *
 * @author wsen
 */
// Filename: TestClass.java
public class SuperSuper{
   public static void main(String args[]){
      Integer String = 0; 
       
      AAA a = new CCC();
      BBB b = new CCC();
      CCC c = new CCC();
      System.out.println(a.max(10, 20));
      System.out.println(b.max(10, 20));
      System.out.println(c.max(10, 20));
   }
}
class AAA{
   int max(int x, int y)  { if (x>y) return x; else return y; }
}
class BBB extends AAA{
  int max(int x, int y)  {  return 2 * super.max(x, y) ; }
}
class CCC extends BBB{
  int max(int x, int y)  {  return super.max( 2*x, 2*y); }
}
