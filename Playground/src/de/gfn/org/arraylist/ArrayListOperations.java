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
public class ArrayListOperations {
    public static void main(String[] args) {
    List differentTypes = new ArrayList();
    differentTypes.add("goldfish");
    differentTypes.add(0, false);   //[false, goldfish]
    differentTypes.add(1);          //[false, goldfish, 1]
    differentTypes.remove(1);       ////[false, 1]
    boolean b1 = differentTypes.contains("goldfish");
    boolean b2 = differentTypes.contains(new Boolean(false));
    boolean b3 = differentTypes.contains(1);
    System.out.println(b1 + " " + b2 + " " + b3);
    }
}
