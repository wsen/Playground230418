/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collectionw;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class ComperatorTest1 {
    public static void main(String[] args) {
        
        // Comparator <> Comparable Interface
        // int compare(o1, o2)
        Comparator<ForestScout> c1 = (o1, o2) -> o1.getAge() - o2.getAge(); 
        //Comparator<ForestScout> c2 = (o1, o2) -> o1.getFirstname()compareTo(o2.getFirstname()); 
                
        
        Set<ForestScout> set = new TreeSet<>(c1);
        //Set<ForestScout> set = new TreeSet<>(new AgeComparator());
        
       // Set<Scout> set = new HashSet<>(); // ohne Comparable INterface
        set.add(new ForestScout(22, "Peter", "Parker")); //Comparator muss hier rein muss bei Erzeugung de Trees vorgegeben werden <> im vl zu Interface comparable
        set.add(new ForestScout(33, "Bruce", "Wayne"));
        set.add(new ForestScout(40, "Cöare", "Wax"));
        set.add(new ForestScout(15, "Peter", "kent"));  //HashSet zeigt diesen mit an
        
        set.forEach((s) -> System.out.println(s.getFirstname() + " " + s.getLastname() + ", Ey Alter: " + s.getAge()));        
        
    }
}

class ForestScout { //ohne Comparable Interface
    private final String firstname;
    private final String lastname;
    private final int age;
    
    public ForestScout(int age, String firstname, String lastname) {
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
}

class AgeComparator implements Comparator<ForestScout> {

    @Override
    public int compare(ForestScout o1, ForestScout o2) {
        return o1.getAge() - o2.getAge();
    }
    
}
