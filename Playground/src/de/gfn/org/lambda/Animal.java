package de.gfn.org.lambda;

/**
 *
 * @author wsen
 */
public class Animal {

    private String species;
    private boolean canHop;     //false
    private boolean canSwim;    //false

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
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