package de.gfn.org.staticgedoens;

/**
 *
 * @author wsen
 */
class Koala {

    public static int count = 0; // static variable

    public static void main(String[] args) { // static method
        System.out.println(count);
    }
}

public class KoalaTester {

    public static void main(String[] args) {
        //Koala.main(new String[0]); // call static method
        Koala k = new Koala();
        System.out.println(k.count); // k is a Koala
        k = null;
        System.out.println(k.count); // k is still a Koala
        
        System.out.println("-----------");
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count);
    }
}
