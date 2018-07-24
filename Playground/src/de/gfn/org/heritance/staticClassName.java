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
public class staticClassName {
    static staticClassName ref;
   String[] arguments;
   public static void main(String args[]){
      ref = new staticClassName();
      ref.func(args);
   }
   public void func(String[] args){
      ref.arguments = args;
   }  
}
