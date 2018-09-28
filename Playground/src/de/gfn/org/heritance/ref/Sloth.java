package de.gfn.org.heritance.ref;

/**
 *
 * @author wsen
 */
class Animal {

    public int getAge() {
        return 10;
    }
}

class Mammal extends Animal {

    protected int getAge(int input) {
        return 7;
    }
}

public class Sloth extends Mammal {

    public boolean hasFur() {
        return true;
    }

    public static void main(String[] args) {
        //Sloth sloth = new Sloth();
        Mammal sloth = new Sloth();
        System.out.print(sloth.getAge());
        System.out.print(sloth.getAge(2));
        System.out.print(sloth.hasFur()); //cannot find symbol sloth in Mammal
    }
}
