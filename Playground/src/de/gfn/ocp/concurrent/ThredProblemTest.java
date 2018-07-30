package de.gfn.ocp.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tlubowiecki
 */
public class ThredProblemTest {
    
    public static void main(String[] args) {
        
        
        List<String> namen = new CopyOnWriteArrayList<>();
        namen.add("Bob");
        namen.add("Andrew");
        namen.add("Peter");
        namen.add("Hans");
        namen.add("Anna");
        namen.add("Petra");
        
        for(String s : namen) {
            System.out.println(s);
            //namen.remove(s);
            namen.add("...");
        }
        
        System.out.println("---------");
        
        System.out.println(namen);
    }
}
