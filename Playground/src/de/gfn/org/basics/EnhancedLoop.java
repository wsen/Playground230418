/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.basics;
import static java.lang.System.*;

/**
 *
 * @author student
 */
public class EnhancedLoop {
    static int iks = 9;
    public static void main(String[] args) {
        String [][]a = {{"aad4","b215z7"},{"Awrvq","B453264"}};
        for(String s[]: a)
            for(String n: s)
                System.out.println(n + "");
        out.print("HansWurst");
        
        System.out.println("--------------");
        int iks = 8;
        
        for(;iks>-1;iks--)
            System.out.println("iks: " + iks);
    }
    
}
