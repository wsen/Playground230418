/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.switchi;

/**
 *
 * @author wsen
 */
public class Condition {
    public static void main(String[] args) {
        //Byte condition = 1;
        Integer condition = new Integer("1");
        switch( condition ){
           case 1  : System.out.println("1");   break;
           case 2  : System.out.println("2");   break;
           case 3 : System.out.println("3");  break;
        }
        
//        int i = 5;
//      float f = 5.5f;
//        System.out.println("int + float: " + (i == f));
//      double d = 3.8;
//        char c = 'a';
//        if (i != f) c++;
//        System.out.println("c: " +c);
    }
}
