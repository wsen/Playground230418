package de.gfn.org.passByValue;

/**
 * boya OCA s191
 * @author student
 */
public class ReturningValues {

    public static void main(String[] args) {
        int number = 1; // 1
        String letters = "abc"; // abc
        number(number); // 1
        //number = number(number); // 3
        //letters = letters(letters); // abcd
        letters(letters); // abcd
        System.out.println(number + letters); // 1abcd
    }

    public static int number(int number) {
        number++;
        ++number;
        return number;
    }

    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
}
