/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basicsw;

/**
 *
 * @author wsen
 */


public class CharLetterOrDigit {
    public int[] method(double x,int y){
        return null;    
    }
    
    //final int j = 32; //.-)
    final static int j = 32; //.-)
    
    public static void main(String[] args) {
//        Character ch = new Character('a');
//        System.out.println(Character.isLetterOrDigit(ch));

        char c = 'A'; //.-)
        String s = "abcd";
        System.out.print((char)calc(c)); //.-)
    }
    
       
    //.-)
    static int calc(int i){
        return(i + j);
    }
}
