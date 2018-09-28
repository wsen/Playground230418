package de.gfn.org.basics;

/**
 *
 * @author wsen
 */
class Toy {

    private boolean containsIce = false;

    public boolean containsIce() {
        return containsIce;
    }

    public void removeIce() {
        this.containsIce = true;
    }
}

public class Otter {

    private static void play(Toy toy) {
        toy.removeIce();
    }

    public static void main(String[] args) {
//         int x = 9;
// long y = x * (long) (++x);
// System.out.println(y);
byte b1 = 2;
        
        Toy toy = new Toy();
        Otter.play(toy);
        System.out.println(toy.containsIce());
    }
}
