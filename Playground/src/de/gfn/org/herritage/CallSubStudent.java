/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.herritage;

/**
 *
 * @author wsen
 */

class Person{}

class Student extends Person{
    public void read(){System.out.println("Reading");}
}

public class CallSubStudent {
    public static void main(String[] args) {
        Person stu = new Student();
        ((Student)stu).read();
    }
}
