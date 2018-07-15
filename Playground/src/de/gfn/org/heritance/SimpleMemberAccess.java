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
class AA{
   private int i = 10;
   public void  f(){}
   public void g(){}
}

class BB extends AA{
   public int i = 20;
   public void g(){}
}

public class SimpleMemberAccess{
    public static void main(String[] args) {
        AA a = new AA();//1
        AA b = new BB();//2
        BB bb = new BB();
        //System.out.println(b.i); //will print 10.
        //class A has f() so b.f() is legal.
        //System.out.println(b.i); //will print 20
        System.out.println(bb.i); //will print 20
    }
}

