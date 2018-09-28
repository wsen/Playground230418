package de.gfn.org.referencing;

/**
 *
 * @author wsen
 */
class Phone {
    String keyboard = "in-built";
    //boolean playMovie = true;
}

class Tablet extends Phone {
    boolean playMovie = false;
}

public class College2 {
    public static void main(String[] args) {
        Tablet phone = new Tablet();
        System.out.println(phone.keyboard + "" + phone.playMovie);
    }
}
