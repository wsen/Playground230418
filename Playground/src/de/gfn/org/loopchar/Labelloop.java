/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.loopchar;

/**
 *
 * @author student
 */
public class Labelloop {
    public static void main(String[] args) {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            System.out.println("forint a vor: " +a );
            for (char x = 'a'; x <= 'c'; x++) {
                System.out.println("  forchar x vor: " +x );
                if (a == 2 || x == 'b') {
                    continue FIRST_CHAR_LOOP;
                }
                System.out.print(" >" + a + x + "<\n");
                System.out.println("  forchar x nach: " +x + "\n-------");
            }
            System.out.println("forint a nach: " +a + "\n--------------");
        }
    }    
}
