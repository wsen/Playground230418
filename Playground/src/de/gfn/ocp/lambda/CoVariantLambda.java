/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 *
 * @author tlubowiecki
 */
public class CoVariantLambda {
    
    public static void main(String[] args) {
        
        UnaryOperator<B> test = B::machWas;
        //UnaryOperator<A> test2 = B::machWas;
        
        
        Function<Integer, Integer> f1 = (z) -> z * 3;
        Function<Integer, Integer> f2 = (z) -> z * z;
        
        System.out.println(f1.compose(f2).apply(2));
        // 12 erst f2, dann f1
        
        System.out.println(f1.andThen(f2).apply(2));
        // 36 erst f1, dann f2
        
        BinaryOperator<Integer> bo = (Integer e1, Integer e2) -> e2 += e1;
        BinaryOperator<Integer> bo2 = Integer::rotateLeft;
        
        System.out.println(Integer.rotateLeft(1, 3)); // 00000001 -> 00001000
        System.out.println(Integer.rotateRight(8, 3)); // 00001000 -> 00000001
    }
    
}

class A {
}

class B extends A {
    static B machWas(B b) {
        return b;
    }
}