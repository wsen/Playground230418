/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.vererbung;

/**
 *
 * @author wsen
 */
public class VererbungTest10 {
    //starke Kopplung
    //Student s = new Student();
    Person s = new Student();
    //jetzt lose Kopplung
    
    public static void main(String[] args) {
        System.out.println(new Object[10]);
        
        System.out.println(new int[10]);
        
        //System.out.println(Array.asList);
    }
}

//besser ein Interface
interface Person {

}


class Student implements Person {
    
}
