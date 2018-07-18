/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

/**
 *
 * @author student
 */
class NewException extends Exception {}
class AnotherException extends Exception {}
public class ExceptionThrowsException {
   public static void main(String [] args) throws Exception{
      Object t = new Integer(106);
    int k = ((Integer) t).intValue()/10;
    System.out.println(k);
    System.out.println(3 + 100/10*2-13);
      try{
         m2();
      }
      finally{ m3(); }
    }
    public static void m2() throws NewException{  throw new NewException();  }
    public static void m3() throws AnotherException{  throw new AnotherException();  }
}
