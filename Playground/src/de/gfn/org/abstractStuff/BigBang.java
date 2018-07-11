/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.abstractStuff;

/**
 *
 * @author student
 */
abstract class Bang{
 //abstract void f();  //(0)
   final    void g(){}
 //final    void h(){} //(1)
   protected static int i;
   private int j;
}

final class BigBang extends Bang{
 //BigBang(int n) { m = n; } //(2)
   public static void main(String args[]){
      Bang mc = new BigBang();
   }
   void h(){}
 void k(){ i++; } //(3)
 //void l(){ j++; } //(4)
   int m;
}