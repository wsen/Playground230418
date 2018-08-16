package de.gfn.org.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * boya OCA
 * 210 Chapter 4 ■ Methods and Encapsulation
 * @author student
 */
class AnimaL {

    private String species;
    private boolean canHop; //false
    private boolean canSwim; //false

    public AnimaL(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}

interface CheckTraitL {

    public boolean test(AnimaL a);
}

class CheckIfHopperL implements CheckTraitL {

    public boolean test(AnimaL a) {
        return a.canHop();
    }
}

class CheckIfSwimmerL implements CheckTraitL {

    public boolean test(AnimaL a) {
        return a.canSwim();
    }
}

public class LambdaSearchAnimal {

    public static void main(String[] args) {
        List<AnimaL> animals = new ArrayList<AnimaL>(); // list of animals
        animals.add(new AnimaL("fish", false, true));
        animals.add(new AnimaL("kangaroo", true, false));
        animals.add(new AnimaL("rabbit", true, false));
        animals.add(new AnimaL("turtle", false, true));

        print(animals, a -> a.canHop()); // lambda
        print(animals, a -> a.canSwim()); // lambda
        //print(animals, new CheckIfSwimmerL()); // pass class that does check
    }

    private static void print(List<AnimaL> animals, CheckTraitL checker) {
        for (AnimaL animal : animals) {
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
//public class TradionalSearchAnimaL {
//
//    private static void print(AnimaL animal, CheckTrait trait) {
//        if (trait.test(animal)) {
//            System.out.println(animal);
//        }
//    }
//
//    public static void main(String[] args) {
//        print(new AnimaL("fish", false, true), a -> a.canHop());
//        print(new AnimaL("kangaroo", true, false), a -> a.canHop());
//    }
//
//}
