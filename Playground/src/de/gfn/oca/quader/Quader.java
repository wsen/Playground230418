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
public class Quader {
    
    public double laenge;
    public double breite;
    public double hoehe;
    private double flaeche;
    private double volumen;
    private double kantenlaenge;
    private double oberflaeche;
    
    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }
    
    public double KalkFlaeche(double L, double B){
        flaeche = L * B;
        return flaeche;
    }
    
    public double KalkQuader(double H){
        volumen = KalkFlaeche(laenge, breite) * H;
        return volumen;
    }
    
    public double Kantenlaenge(double L, double B, double H){
        kantenlaenge = 4*L + 4*B + 4*H;
        return kantenlaenge;
    }
    
    public double Oberflaeche (double L, double B, double H){
        oberflaeche = 2 * KalkFlaeche(L, B) + 2 * KalkFlaeche(H, B) + 2 * KalkFlaeche(H, L);
        return oberflaeche;
    }
    
    @Override
    public String toString(){
        return "Der Quader hat eine Fläche von " + KalkQuader(hoehe) + " Einheiten\n"
               + "und eine Kantenlaenge von " + Kantenlaenge(laenge, breite, hoehe) + " Einheiten\n"
               + "und eine Oberfläche von " + Oberflaeche(laenge, breite, hoehe) + " Einheiten\n"
               + "-----";
    }
    
    public static void main(String[] args) {
        Quader q1 = new Quader(20.0,20,3);
        System.out.println(q1);
        
        KantenQuader kq1 = new KantenQuader(20.0,20.0,3.0);
        System.out.println(kq1);
    }
}
