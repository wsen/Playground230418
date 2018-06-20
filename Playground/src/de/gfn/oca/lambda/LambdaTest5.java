/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.lambda;

import java.util.function.Predicate;

/**
 *
 * @author wsen
 */
public class LambdaTest5 {
    
    static int x = 10;
    
    public static void main(String[] args){
        int i = 100;
        
        //Predicate<Integer> p = (j) -> i+j == 10;
        Predicate<Integer> p = (j) -> x+i == 10; //
        
        //i = 110; //auf Variablen außerhalb kann zugegriffen werden wenn diese effektiv final
        // ... ist nicht mehr das i in 22.
        
        //System.out.println(j);
    }
}
