package de.gfn.oca.aufgabenblatt5.aufgabe1;

/**
 *
 * @author tlubowiecki
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
    
    public void anzeigeBuch() {
        System.out.println(titel + ", " + preis + "€");
    }
    
    static <T> void anzeigeEigenschaft(T eigenschaft) {
        System.out.println(eigenschaft);
    }
}
