/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgabe4.nr1;

/**
 *
 * @author student
 */
public class Heinzi {
    private String firstname;
    private String lastname;
    
    public Heinzi() {
        this("ohne Vornamen", "ohne Nachnamen");
    }
    
    public Heinzi(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    @Override
    public String toString() {
        return "Name: " + firstname + " " + lastname;
    }
}
