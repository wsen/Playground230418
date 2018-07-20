/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.classfinal;

/**
 *
 * @author student
 */
class Holder{
   int value = 1;
   Holder link;  //link vom Typ Holder
   public Holder(int val){ this.value = val; } //Constructor //hier a.value 5, b.value 10
   public static void main(String[] args){
	final Holder a = new Holder(5);
	Holder b = new Holder(10);
	a.link = b; // a final -> eigentlich keine Zuweisung möglich, Holder insgesamt konstant ?=??
	b.link = setIt(a, b);
	System.out.println(a.link.value+" "+b.link.value);
   }
   
   public static Holder setIt(final Holder x, final Holder y){
       x.link = y.link;
       return x;
   }
   
}
