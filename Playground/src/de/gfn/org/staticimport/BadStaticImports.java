/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.staticimport;

//import static java.util.Arrays; 
import static java.util.Arrays.asList;
//  import java.util.Arrays;
//static import java.util.Arrays.*;

public class BadStaticImports {
    
    Object oheinz;
    
    public static void main(String[] args) {
        asList("one");
        System.out.println("da Heinz: " + new BadStaticImports().oheinz);
    }
}
