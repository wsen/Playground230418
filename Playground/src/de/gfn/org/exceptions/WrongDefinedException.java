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
public class WrongDefinedException {
   public static void main(String args[]){
      try{
         RuntimeException re = null;
         throw re;
      }
      catch(Exception e){
         System.out.println(e);
      }
   }
}