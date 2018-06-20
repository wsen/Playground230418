/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.abstractinteface;

import java.util.ArrayList;

/**
 *
 * @author wsen
 */
abstract class Vehicle {
    
}

class Car extends Vehicle implements Driveable{}

class SUV extends Car{
    ArrayList<Vehicle> al1 = new ArrayList<>();
    al1.add(new SUV());
    
    ArrayList<Driveable> al2 = new ArrayList<>();
    al2.add(new Car());
    
    ArrayList<Driveable> al3 = new ArrayList<>();
    al3.add(new SUV());
    
    ArrayList<SUV> al4 = new ArrayList<>();
    al4.add(new Car());
    
    ArrayList<Vehicle> al5 = new ArrayList<>();
    al5.add(new Car());

    
}
