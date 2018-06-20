/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.test1;

/**
 *
 * @author wsen
 */
import java.time.LocalDate;
import java.util.*;

class Person {
}

class Emp extends Person {
}

class Course {
    static int enrollments ;
}

class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new String("1234"));
        list.add(new Person());
        list.add(new Emp());
        list.add(new String[]{"abcd", "xyz"});
        //       list.add(LocalDate.now().plus(1));
        /*
 error: no suitable method found for plus(int)
        list.add(LocalDate.now().plus(1));
    method Temporal.plus(TemporalAmount) is not applicable
      (argument mismatch; int cannot be converted to TemporalAmount)
    method ChronoLocalDate.plus(TemporalAmount) is not applicable
         */
        Course c1 = new Course();
        Course c2 = new Course();
        //c1.enrollments = 100;
        c2.enrollments = 200;
        System.out.println(c1.enrollments + c2.enrollments);
    }
}
