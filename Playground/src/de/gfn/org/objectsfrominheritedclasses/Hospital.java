/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.objectsfrominheritedclasses;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Hospital {

    public static void main(String args[]) {
        Surgeon s1 = new Surgeon("Liver");
        Surgeon s2 = new Surgeon("Heart");
        s1.age = 45;
        System.out.println(s1.age + s2.getSpecialization());
        System.out.println(s2.age + s1.getSpecialization());

        ArrayList<String> seasons = new ArrayList<>();
        seasons.add(1, "Spring");
        seasons.add(2, "Summer");
        seasons.add(3, "Autumn");
        seasons.add(4, "Winter");
        //seasons.remove(2);
        seasons.forEach((s) -> {
            System.out.print(s + ", ");
        });

//        java.util.List<String> values = new java.util.ArrayList<String>();
//        values.add("Lisa");
//        values.add("Kevin");
//        values.add("Roger");
//        for (String value : values) {
//            System.out.print(value + ", ");
//        }
    }
}
