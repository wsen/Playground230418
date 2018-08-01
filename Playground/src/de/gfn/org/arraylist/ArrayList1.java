/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.arraylist;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wsen
 */
public class ArrayList1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  // empty list
        //ArrayList<String> list = new ArrayList<>();
        list.add("Fluffy"); // [Fluffy]
        list.add("Webby"); // [Fluffy, Webby]
        System.out.println(list.get(0));
        
        String[] array = new String[list.size()]; // empty array
        array[0] = list.get(1); // [Webby]
        array[1] = list.get(0); // [Fluffy]
        for (int i = 0; i < array.length; i++)
        System.out.print(array[i] + "-");
    }
}
