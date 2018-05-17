/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgabenblatt4.aufgabe1;

/**
 *
 * @author tlubowiecki
 */
public class Adresse {
    
    private static int anzahl = 0;
    
    private String vorname;
    private String nachname;
    private String strasse;
    private String hausnummer;
    private String plz;
    private String ort;
    private String land;

    // Initializer
//    {
//        // wird vor dem Konstruktor aufgerufen
//    }
//    
//    static {
//        // wird beim Laden der Klasse ausgeführt
//    }
    
    public static int getAnzahl() {
        return anzahl;
    }
    
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
        anzahl++;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(vorname).append(" ").append(nachname)
          .append("\n").append(strasse).append(" ").append(hausnummer)
          .append("\n").append(plz).append(" ").append(ort)
          .append("\n").append(land);
        return sb.toString();
    }
}
