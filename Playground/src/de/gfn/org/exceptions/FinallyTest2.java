package de.gfn.org.exceptions;

/**
 * http://docs.oracle.com/javase/tutorial/essential/exceptions/runtime.html
 * @author wsen
 */
public class FinallyTest2{
   public static void main(String args[]) throws Exception{
       try{
          m1();
          System.out.println("A");
       }
       finally{
          System.out.println("B");
       }
       System.out.println("C");
   }
   public static void m1() throws Exception { throw new Exception(); }
}
