/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.switchi;

/**
 *
 * @author student
 */

class Student { int marks = 10;}

public class Result {
    public static void main(String[] args) {
        Student s = new Student();
        switch (s.marks) {
            default:
                System.out.println("100");
            case 10:
                System.out.println("10");
            case 98:
                System.out.println("98");
        }
    }
}
