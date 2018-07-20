/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.polym;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
class Animal {

    public String getName() {
        return "Animal";
    }
}

class Gorilla extends Animal {

    //protected String getName() { // DOES NOT COMPILE if nore accessm more narrow as parent
    public String getName() { // 
        return "Gorilla";
    }
}

public class ZooKeeper {

    public static void main(String[] args) {
        Animal animal = new Gorilla();
        System.out.println(animal.getName());
        
        int i = 4;
      int ia[][][] = new int[i][i = 3][i];
      System.out.println( ia.length + ", " + ia[0].length+", "+ ia[0][0].length);
      
      List s1 = new ArrayList( );
        try{
            while(true){
                s1.add("sdfa");
            }
        }catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(s1.size());
    }
}
