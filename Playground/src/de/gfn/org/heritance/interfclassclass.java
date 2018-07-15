/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.heritance;

/**
 *
 * @author wsen
 */
public class interfclassclass {
    public static void main(String[] args) {
        
    }
}

interface Automobile { String describe(); }

class FourWheeler implements Automobile{
   String name;
   public String describe(){ return " 4 Wheeler " + name; }
}

class TwoWheeler extends FourWheeler{
    String name;
    public String describe(){ return " 2 Wheeler " + name; }
}