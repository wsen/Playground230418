/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.abstractStuff;

/**
 *
 * @author wsen
 */
abstract class Automobile{
   //void honk(){};   //(2)
   abstract void honk();
}

abstract class Pkw extends Automobile {
    //Automobile auto = new Automobile();
}
