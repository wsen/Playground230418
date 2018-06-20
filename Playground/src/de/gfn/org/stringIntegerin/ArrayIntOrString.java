/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.stringIntegerin;

/**
 *
 * @author wsen
 */
public class ArrayIntOrString {
    public static void main(String[] args) {
        String[] x = {"A","B","C","D","E"};
        nxt(x);
        
        for(String s:x)
            System.out.println(s + "");
    }
    
    static void nxt(Object o){
        String[]y = (String[])o;
        for(int i=5,j=0; i>0; --i,j++){
            System.out.print(" " + y[j] + " ");
            y[j]= Integer.toString(i);
        }
    }
}
