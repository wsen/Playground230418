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
public class Dog {
    public String name;
    public void parseName() {
       System.out.print("1");
       try {
          System.out.print("2");
          int x = Integer.parseInt(name);
          System.out.print("3");
       } catch (NumberFormatException e) {
       System.out.print("4");
     }
    }
    public static void main(String[] args) {
       Dog leroy = new Dog();
       leroy.name = "Leroy";
       leroy.parseName();
       System.out.print("5");
       
        System.out.println("----Unnecessary Boxing -> ClassCastExeption----");
        Object obj = new Integer(3);
        String str = (String) obj;
        System.out.println(str);
} }