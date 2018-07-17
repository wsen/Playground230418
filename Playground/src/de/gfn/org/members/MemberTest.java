/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.members;

/**
 *
 * @author wsen
 */
class A{
    String value = "test";
    A(String val){
        this.value = val;
    }
}

public class MemberTest {
    public static void main(String[] args) throws Exception {
        //new A("new test").print();
        for (int i = 0; i < 10; i++) System.out.print(i + " ");  //1
      for (int i = 10; i > 0; i--) System.out.print(i + " ");  //2
      int i = 20;                  //3
      System.out.print(i + " ");   //4
    }
}
