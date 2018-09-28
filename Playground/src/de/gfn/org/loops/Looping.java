package de.gfn.org.loops;

/**
 *
 * @author wsen
 */
public class Looping {

    public static void main(String[] args) {
        //What is the result of the following code snippet? //111
        for (int i = 0; i < 5; i++) {
            System.out.print(1);
            if (i < 2) {
                continue;
            } else {
                break;
            }
        }
    }
}
