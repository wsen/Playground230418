/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.objectsfrominheritedclasses;

/**
 *
 * @author student
 */
public class Surgeon extends Doctor {
    
    
    Surgeon(String val) {
        specialization = val;
    }
    String specialization;

    String getSpecialization() {
        return specialization;
    }
}
