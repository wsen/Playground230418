/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgabe3.nr1;

/**
 *
 * @author wsen
 */
public abstract class DreieckArten implements FlaechenInhalt {
    private double a,b,c;
    
    public abstract double berechneWinkel();
    
    public abstract double berechneUmfang();
    
}
