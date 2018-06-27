/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author tlubowiecki
 */
public class ComparableTest1 {
    
    public static void main(String[] args) {
        
        Set<Scout> set = new TreeSet<>();
        //Set<Scout> set = new HashSet<>();
        set.add(new Scout(22, "Peter", "Parker"));
        set.add(new Scout(44, "Bruce", "Wayne"));
        set.add(new Scout(33, "Clark", "Kent"));
        set.add(new Scout(15, "Peter", "Kent"));
        
        set.forEach((s) -> System.out.println(s.getFirstname() + " " + s.getLastname() + ", " + s.getAge()));
        
    }
}

class Scout implements Comparable<Scout>{
//class Scout {
    
    private final int age;
    private final String firstname;
    private final String lastname;

    public Scout(int age, String firstname, String lastname) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public int compareTo(Scout o) {
        return this.age - o.getAge();
    }

//    @Override
//    public int hashCode() {
//        return 1;
//    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
    
    
}
