package de.gfn.org.forLoop;

/**
 *
 * @author wsen
 */
public class ForModulo {
    public static void main(String[] args) {
        int a = 10;
        for(; a <= 20; ++a){
            System.out.println("a vorher " + a);
            if (a%3 == 0) a++; else if (a%2 == 0) a=a*2;
            System.out.println(a);
        }
    }
}
