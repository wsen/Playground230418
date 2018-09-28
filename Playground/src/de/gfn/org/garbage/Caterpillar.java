package de.gfn.org.garbage;

/**
 *
 * @author wsen
 */
public class Caterpillar {

    public static void main(String[] args) {
        Caterpillar c1 = new Caterpillar();
        Caterpillar c2 = new Caterpillar();
        c1 = c2;
        c2 = null;
        // garbage collection runs
        c1 = null;
    }

    protected void finalize() {
        System.out.println("becomes a butterfly");
    }
}
