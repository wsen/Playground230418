/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.lambdapredicate;

import java.util.*;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

import de.gfn.oca.lambdatraditional.Animal;

/**
 *
 * @author wsen
 */
public class PredicateSearch {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));

        print(animals, a -> a.canSwim());
        animals.add(new Animal("fish", false, true));

        print(animals, a -> a.canHop());
    }
    //private static void print(List<Animal> animals, CheckTrait checker) { //Trad
    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
}
