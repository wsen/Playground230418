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
    
    public double KalkFlaeche(double side1, double side2){
        flaeche = side1 * side2;
        return flaeche;
    }
    
    public double KalkQuader(){
        volumen = KalkFlaeche(laenge, breite) * hoehe;
        return volumen;
    }
    
    public double Kantenlaenge(){
        kantenlaenge = 4*laenge + 4*breite + 4*hoehe;
        return kantenlaenge;
    }
    
    public double Oberflaeche (){
        oberflaeche = 2 * KalkFlaeche(laenge, breite) + 2 * KalkFlaeche(hoehe, breite) + 2 * KalkFlaeche(hoehe, laenge);
        return oberflaeche;
    }
    
    @Override
    public String toString(){
        return "Der Quader hat eine Fläche von " + KalkQuader() + " Einheiten\n"
               + "und eine Kantenlaenge von " + Kantenlaenge() + " Einheiten\n"
               + "und eine Oberfläche von " + Oberflaeche() + " Einheiten\n"
               + "-----";
    }
    
    public static void main(String[] args) {
        Quader q1 = new Quader(20.0,20,3);
        System.out.println(q1);
        
        KantenQuader kq1 = new KantenQuader(20.0,20.0,3.0);
        System.out.println(kq1);
    }
}
