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

/*
bin damit halb fertig nur die anzahl bekomme ich noch nicht hin
Von Flow-User an alle:  02:46 PM
wie findest du random numbers?
Von Student an alle:  02:47 PM
wie meinst du?
Von Flow-User an alle:  02:47 PM
Schreiben Sie ein Programm, das ein Integer-Array der Länge 100 mit Zufallswerten zwischen 0 und 9 belegt.
Von Andreas_Kreutzer an alle:  03:38 PM
Habt Ihr das auch so implementiert?
import java.util.Random;
...
static int n;
...
Random rn = new Random();
n = rn.nextInt(10);
// Test it:
System.out.println(n);



Von Student an alle:  03:49 PM
klar, wie gesagt wie oft was vorkommt habe ich noch nicht
ich habs schonm gemacht, komme aber nicht drauf

*/
