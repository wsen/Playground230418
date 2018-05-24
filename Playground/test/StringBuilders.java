/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wsen
 */
public class StringBuilders {

    public static StringBuilder work(StringBuilder a,
            StringBuilder b) {
        System.out.println("s1 = " + a);
        System.out.println("s2 = " + b);
        a = new StringBuilder("a");

        b.append("b");
        System.out.println("a = " + a);
        return a;
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = work(s1, s2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
    }
}


