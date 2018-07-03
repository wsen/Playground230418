/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.basics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class AutoboxingTest {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        //ages.add(null);
        for (int age : ages) System.out.print(age);
        // Null Pointer Exception
        // tries to unbox null into an int
    }
}
