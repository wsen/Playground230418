/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wsen
 */
public class PredicateRemoveIf {
    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h'); //RemoveIf from ArrayList
        System.out.println(bunnies); // [hoppy]
    }
}
