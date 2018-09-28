/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.forifcontinue;

/**
 *
 * @author wsen
 */
public class ForIfBreak {
    public static void main(String[] args) {
        int ctr = 10;
        char[] arrC1 = new char[]{'P','a','u','l'};
        char[] arrC2 = {'H','a','r','r','y'};
        
        for (char c1 : arrC1) {
            System.out.println("c1: " + c1);
            for (char c2 : arrC2) {
                System.out.println("c2: " + c2);
                if (c2 == 'a') break;
                System.out.println("ctr v: " + ctr);
                ++ctr;
            }
            System.out.println("----");
        }
        System.out.println(ctr+"\n");
        
        ctr= 10;
        for (char c1 : arrC1) 
            for (char c2 : arrC2) {
                if (c2 == 'a') break;
                System.out.println("ctr v: " + ctr);
                ++ctr;
            }
        
            System.out.println(ctr);
    }
}
