package de.gfn.org.interfaze;

/**
 *
 * @author wsen
 */
public class BoyaOwl implements BoyaNocturnal {
//Review Questions 295

    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        //BoyaNocturnal nocturnal = (BoyaNocturnal) new BoyaOwl();
        BoyaNocturnal nocturnal = new BoyaOwl();
        System.out.println(nocturnal.isBlind());
    }
}
