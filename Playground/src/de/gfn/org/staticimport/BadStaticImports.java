/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.staticimport;

//import static java.util.Arrays; 
// import static java.util.Arrays.asList;
//static import java.util.Arrays.*;

import java.util.Arrays;

/**
 *
 * @author student
 */
public class BadStaticImports {
    public static void main(String[] args) {
        Arrays.asList("one");
    }
}
