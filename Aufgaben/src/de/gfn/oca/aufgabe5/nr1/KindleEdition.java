/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgabe5.nr1;

/**
 *
 * @author student
 */
public class KindleEdition {
    
    private String titel;
    private double preis;
    private int seitenanzahl;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(int seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }
    
    //OUT: Titel, Preis
    public  void anzeigeBuch() {
        System.out.println("Buchtitel: "+ getTitel()+ " Preis: "+ getPreis() + "\n");
    }
    
    //OUT: Bucheigenschaft
    public static<T> void anzeigeEigenschaft(T eigenschaft) {
        System.out.println("> " + eigenschaft);
    }
}
