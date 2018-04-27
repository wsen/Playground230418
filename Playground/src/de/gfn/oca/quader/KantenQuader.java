/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.quader;

/**
 *
 * @author student
 */

public class KantenQuader extends Quader{
    
    private double kantenlaenge;
    private double oberflaeche;
    
    // Boah Konstruktor, echt super
    public KantenQuader (double laenge, double breite, double hoehe) {
        super(laenge, breite, hoehe);   
    }
    
    public double Kantenlaenge(double L, double B, double H){
        kantenlaenge = 4*L + 4*B + 4*H;
        return kantenlaenge;
    }
    
    public double Oberflaeche (double L, double B, double H){
        oberflaeche = 2 * super.KalkFlaeche(L, B) + 2 * super.KalkFlaeche(H, B) + 2 * super.KalkFlaeche(H, L);
        return oberflaeche;
    }
    
    @Override
    public String toString(){
        return "Der Kanten-Quader hat eine Kantenlaenge von " + Kantenlaenge(laenge, breite, hoehe) + " Einheiten\n" +
               "Der Kanten-Quader hat eine Oberflaeche von " + Oberflaeche(laenge, breite, hoehe) + " Einheiten";
    }
}
