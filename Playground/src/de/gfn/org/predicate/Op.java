/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.predicate;
import java.util.function.Predicate;

/**
 *
 * @author wsen
 */
public class Op {
    public static void main(String[] args) {
        int a = 0;
//        int b = 0;
//        b = 101;
        boolean b = true;
        Predicate<Integer> compare = (var) -> var++ == 0;
//        if (b++ > 100 && compare.test(a)) {
        if (compare.test(a)) {
//        if (b && true) {
            System.out.println("" + a + b);
        }
    }
}
