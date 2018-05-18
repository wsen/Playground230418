package de.gfn.oca.lambda;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class DiceGen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Dice d = null;

        while (true) {
            System.out.print("\n\nWieviele Seiten soll der Würfel haben? ");
            switch (scanner.nextInt()) {

                case 4:
                    d = () -> (int) (Math.random() * 4 + 1);
                    break;

                case 6:
                    d = () -> new Random().nextInt(6);
                    break;

                case 10:
                    d = () -> new Random().nextInt(10);
                    break;

                case 20:
                    d = () -> new Random().nextInt(20);
                    break;

                case 100:
                    d = () -> new Random().nextInt(100);
                    break;

                default:
                    System.out.println("\nKeine gültige Eingabe!");
                    continue;
            }

            System.out.println(d.role());
        }
    }
}

interface Dice {

    int role();

}
