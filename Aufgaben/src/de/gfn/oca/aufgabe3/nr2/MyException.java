/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgabe3.nr2;

/**
 *
 * @author student
 * TODO: Print-Ausgabe optimieren
 */
public class MyException extends Exception{
    int meldungsNr;
    String meldung;
    
    public MyException(String meldung){
        super(meldung);
//        this.Meldung = Meldung;
//        System.out.println(Meldung);
    }
    
    public MyException(String meldung, int meldungsNr){
        super(meldung);
//        this.Meldung = Meldung;
//        this.meldungsNr = meldungsNr; // TODO: Mach irgendwas, keine Ahnung was !
//        System.out.println(Meldung);
    }
    
    public int getMeldungsNr() {     
        return meldungsNr; // TODO: Mach irgendwas, keine Ahnung was !
    } 
}
