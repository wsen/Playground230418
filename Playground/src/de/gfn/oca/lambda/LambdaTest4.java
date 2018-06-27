/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.lambda;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 *
 * @author tlubowiecki
 */
public class LambdaTest4 {
    
    public static void main(String[] args) {
        
        //Object o = (e) -> true;
        
        Predicate<String> p1 = (e) -> true;
        
        Object o2 = p1;
    }
    
    
}
