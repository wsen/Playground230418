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
public class ExceptionMitReturn {
    public static void main(String args[]){
      try{
          StringBuilder b = new StringBuilder("1");
StringBuilder c = b.append("2");
b.append("234");
c.deleteCharAt(1);
System.out.println("Equals? " + (b == c));
System.out.println("B=" + b);
System.out.println("C=" + c);

StringBuilder s1 = new StringBuilder();
 StringBuilder s2 = new StringBuilder(5);
 StringBuilder s3 = new StringBuilder(6.0);
 StringBuilder s4 = new StringBuilder("b");
 StringBuilder s5 = new StringBuilder(false);

         m1();
      }catch(IndexOutOfBoundsException e){
         System.out.println("1");
         throw new NullPointerException();
         //As this exception is not thrown inside the try block, it will not be caught by any of the remaining catch blocks. 
         //It will actually be sent to the caller of the main() method after the finally block is executed
      }catch(NullPointerException e){
         System.out.println("2");
         return; //wirft mit und ohne Return: NullPointerException
      }catch (Exception e) {
         System.out.println("3");
      }finally{
         System.out.println("4");
      }
      System.out.println("END");
   }

   static void m1(){
      System.out.println("m1 Starts");
      throw new IndexOutOfBoundsException( "Big Bang " );
   }
}
