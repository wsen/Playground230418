/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collectionw;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class ComparableTest1 {
    public static void main(String[] args) {
        Set<Scout> set = new TreeSet<>();
       // Set<Scout> set = new HashSet<>(); // ohne Comparable INterface
        set.add(new Scout(22, "Peter", "Parker"));
        set.add(new Scout(33, "Bruce", "Wayne"));
        set.add(new Scout(40, "Cöare", "Wax"));
        set.add(new Scout(15, "Peter", "kent"));  //HashSet zeigt diesen mit an
        
        set.forEach((s) -> System.out.println(s.getFirstname() + " " + s.getLastname()));
    }
}

class Scout implements Comparable<Scout>{
// class Scout {  // HashSet
    private final String firstname;
    private final String lastname;
    private final int age;
    
    //KOnstruktor wo ich diese Werte zuweise
    public Scout(int age, String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public int getAge() {
        return age;
    }
    
//    @Override
//    public int compareTo(Scout o){
//        return this.firstname.compareTo(o.getFirstname());
//    }
    
    @Override
    public int compareTo(Scout o){
        return this.age - (o.getAge());
    }
    
//    @Override  // HashSet
//    public boolean equals(Object o){
//        return true;
//    }
    
//    public int hashCode() {
//        return 1;
//    }
    
    
}