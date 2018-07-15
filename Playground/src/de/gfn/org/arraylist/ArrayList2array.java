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
public class ArrayList2array {
    public static void main(String[] args) {
      List<String> stringList = new ArrayList<>();
      stringList.add("BlueJ");
      String[] testArrayA = stringList.toArray(new String[3]);
      System.out.println("length of A: " + testArrayA.length);
      String[] testArrayB = stringList.toArray(new String[0]);
      System.out.println("length of B: " + testArrayB.length);
      stringList.add("Hawk");
      stringList.add("Pigeon");
      String[] testArrayC = stringList.toArray(new String[2]);
      System.out.println("length of C: " + testArrayC.length);
    }
}
