package de.gfn.org.objectsAndReferences;

/**
 *
 * @author wsen
 */
class Baap {
    public int h = 4;
    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Beta extends Baap {
    public int h = 44;
    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }
    public static void main(String[] args) {
        Baap b = new Beta();
        System.out.println("Baap b = new Beta(): " + b.h + " " + b.getH());
        // also 1) prints getH(), 2) prints diese mit b.h und b.degH() mit Return Wert
        Beta bb = (Beta) b;
        System.out.println("Beta bb = (Beta) b : " + bb.h + " " + bb.getH());
    }
}
