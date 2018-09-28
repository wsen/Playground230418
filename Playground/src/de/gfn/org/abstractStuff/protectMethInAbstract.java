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

abstract 
        class A{
   protected int m1(){ return 0; }
}

public class protectMethInAbstract  extends A{
   public int m1(){ return 1; }
   
}
    
