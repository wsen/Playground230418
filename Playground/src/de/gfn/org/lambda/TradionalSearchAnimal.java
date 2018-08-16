package de.gfn.org.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * boya OCA
 * 210 Chapter 4 ■ Methods and Encapsulation
 * @author student
 */

interface CheckTrait {

    public boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.canHop();
    }
}

class CheckIfSwimmer implements CheckTrait {

    public boolean test(Animal a) {
        return a.canSwim();
    }
}

class TradionalSearchAnimal {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, new CheckIfHopper()); // pass class that does check
        print(animals, new CheckIfSwimmer()); // pass class that does check
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

//Now  that we’ve defined a structure, let’s do something with it. The following simple program
//uses a lambda expression to determine if some sample animals match the specified criteria:
//public class TradionalSearchAnimal {
//
//    private static void print(Animal animal, CheckTrait trait) {
//        if (trait.test(animal)) {
//            System.out.println(animal);
//        }
//    }
//
//    public static void main(String[] args) {
//        print(new Animal("fish", false, true), a -> a.canHop());
//        print(new Animal("kangaroo", true, false), a -> a.canHop());
//    }
//
//}
