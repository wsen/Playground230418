/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class ListAndArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        System.out.println(numbers);
        numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);
    }
}
