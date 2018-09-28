package de.gfn.org.polym;

/**
 *
 * @author wsen
 */
interface WalksOn4Legs {
}

abstract class Mammal {

    public int numberOfOffspring;
}

class Antelope extends Mammal implements WalksOn4Legs {
}

class ParkRanger {

    public void noteNewOffspring(Mammal mammal) {
        mammal.numberOfOffspring++;
    }

    public static void main(String[] args) {
        new ParkRanger().noteNewOffspring((Mammal)new Object());
    }
}

/*
A. new Mammal()

B. new Antelope()       //OK

C. new WalksOn4Legs()

D. (Mammal)new Object() //OK

E. (Mammal)new String() 

F. null                 //OK
*/