package de.gfn.org.referencing;

/**
 *
 * @author wsen
 */

interface Jumpable {
    int height = 1;
    default void worldRecord() {
        System.out.println("J "+height);
    }
}

interface Moveable {
    int height = 2;
    static void worldRecord(){
        System.out.println("M"+height);
    }
}

public class Chair implements Jumpable, Moveable {
    int height = 3;
    Chair() {
          worldRecord();
//        Moveable.worldRecord(); //222
    }
//    public void worldRecord() {
//       System.out.println("C"+height); //111
//    }
         
    public static void main(String[] args) {
        Jumpable j = new Chair();
        Moveable m = new Chair();
        Chair c = new Chair();
    }
}

/*
111
*/