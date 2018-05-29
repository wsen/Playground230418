/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.trycatch;

/**
 *
 * @author student
 */
public class ExceptionTreter {

    public static void main(String[] args) {
        try {
            String[][] names = {{"Andre", "Mike"}, null,
            {"Pedro"}};
            System.out.println(names[2][1].substring(0, 2));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(1);
        }
    }
}

/*
A. IndexPositionException e
B. NullPointerException e EXISTS
C. ArrayIndexOutOfBoundsException e  OK
D. ArrayOutOfBoundsException e
*/