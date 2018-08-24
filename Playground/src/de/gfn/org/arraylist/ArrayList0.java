/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author wsen
 */
public class ArrayList0 {
    public static void main(String[] args) {
    //    ArrayList<Integer> arrlist = new ArrayList<>(5);
        ArrayList<Integer> arrlist = new ArrayList<>(0);
        arrlist.add(20);
        arrlist.add(15);
        arrlist.add(30);
        arrlist.add(45);

        arrlist.remove(0); // remove bei leerer ArrayList -> komplieren ja run nein!

        for (Integer number : arrlist) {
           System.out.println("Number = " + number);
        }
        
        System.out.println("--- asList ---");
        String [] names = {"Tom", "Dick", "Harry"};
        // List<String> list = names.asList(); //NO asList method on a array instance
        List<String> list = Arrays.asList(names);
        list.set(0, "Sue");
                
        System.out.println(names[0]);
        
        System.out.println("--- String Hexa collection sort ---");
        List<String> hex = Arrays.asList("30", "8", "3A", "FF");
        //List<String> sortmeier = Collections.sort(hex);
        
        //System.out.println("Liste: " + Collections.sort(hex));
        
        int x = Collections.binarySearch(hex, "8");
        int y = Collections.binarySearch(hex, "3A");
        int z = Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " + z);
//A 0 1 –2
//B. 0 1 –3
//C. 2 1 –2
//D. 2 1 –3
//E. None of the above.
//F. The code doesn’t compile.
        
    }
}