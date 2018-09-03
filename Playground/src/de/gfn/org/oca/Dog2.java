package de.gfn.org.oca;

/**
 *
 * @author wsen
 */

interface Pet2 {
    void eat();
}

class Dog2 implements Pet2 {
    public void eat(){}
}
class Beagle2 extends Dog2 {
    public void eat(){}
}

class PetFood {
    public void go(Pet2 b){
        b.eat();
    }
}

