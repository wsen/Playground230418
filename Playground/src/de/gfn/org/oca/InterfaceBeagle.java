package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
interface Pet {
    void eat();
}

class Dog2 implements Pet { public void eat (){}}
class Beagle extends Dog2 { public void eat (){}}

class PetFoodA {
    public void go(Beagle b){
        b.eat();
    }
}

class PetFoodB {
    public void go(Pet p){
        p.eat();
    }
}

class PetFoodC {
    public void go(Pet p){
        p.eat();
    }
}

public class InterfaceBeagle {
    
}

