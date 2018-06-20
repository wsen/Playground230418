/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.tenary;

/**
 *
 * @author wsen
 */
public class Tenary {
    public static void main(String[] args) {
        int x = -10;
        int y = 10;
        if(y<=10 & x%(-3)==-1)
        System.out.println("A");
        
        if (y++ == 10) {
            if (y-- == 10) {
                //if (y == 10){} else {
                if (y == 10); else {
                    y *= 3;
                }
            } else {
                y *= 2;
            }
        }
//          
//        if(y++ == 10)
//            if(y--==10)
//                if(y==10);
//                else y *=3;
//            else y*=2;
        
        System.out.println("y: " + y);
    }
}
