/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.lambdatraditional;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 * @author wsen
 */
public class TraditionalSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        //print(animals, new CheckIfHopper()); // pass class that does check
        print(animals, a -> a.canHop());
        // (Animal a) -> { return a.canHop(); }
        print(animals, a -> a.canSwim());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
            {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
