/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.methods;

/**
 *
 * @author student
 */
public class MethodenKonfizius {
//1. 
   int factorial(int n){
       if(n==1) return 1;
      else return n*factorial(n-1);
   }
//Assume that it is called with a very large integer.
// -> Exception: 
// -> Error: StackOverflow
//2. 
   void printMe(Object[] oa){
       for(int i=0; i<=oa.length; i++)
       System.out.println(oa[i]);
    }
//Assume that it is called as such: printMe(null);
// -> Exception: NullPointerException   
// -> Error:
//3. 
   Object m1(){
       return new Object(); 
    }
    void m2(){
       String s = (String) m1();
    }
//Assume that method m2 is invoked.    
// -> Exception: ClassCastException
// -> Error:    
    public static void main(String[] args) {
        new MethodenKonfizius().factorial(123456789);
        //new MethodenKonfizius().printMe(null);
        //new MethodenKonfizius().m2();       
    }    
}
