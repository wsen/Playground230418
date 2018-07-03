/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.basics;

/**
 *
 * @author student
 */
public class JustStaticInit {
    static {
        System.out.println("This will be");
        //System.exit(0);
    }
    
    public static void main(String[] args) {
        System.out.println("A");
        
        System.out.println("-------");
        int i = 78;
        int j = 3;
        
        System.out.println(i/j);
    }
    
    public static void main(String args) {
        
    }
    
    public static void main(String[] args, String arg) {
        
    }
    

    
    
}
