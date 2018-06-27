/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.lambda;

import java.util.function.Predicate;

/**
 *
 * @author tlubowiecki
 */
public class LambdaTest5 {
    
    static int x = 10;
    Predicate<Integer> p = (j) -> j == 10;
    
    public static void main(String[] args) {
        
        int i = 100;
        
        Predicate<Integer> p = (j) -> i == 10;
        
        x = 10;
        //i = 110;
        //System.out.println(j);
        
    }
    
}
