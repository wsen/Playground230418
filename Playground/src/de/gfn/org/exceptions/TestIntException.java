/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
public class TestIntException {
public static void main(String[] args){
      int j = 1;
      
int a = Integer.MIN_VALUE;
            int b = -a;
            System.out.println( a+ "   "+b);
      try{
         int i = doIt() / (j = 2);
         // int i interessiert gar nix, weils gleich in die Exception geht
         System.out.println("i: " + i + " j: "+ j);
      } catch (Exception e){
         System.out.println(" gecätschtes j = " + j);
      }
   }
   public static int doIt() throws Exception {
       System.out.println("Eksäptjschon");
       throw new Exception("FORGET IT");  
   }
}
