/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgabe3.nr2;

/**
 *
 * @author student
 */
public class MyException extends Exception{
    int meldungsNr;
    String Meldung;
    
    public MyException(String Meldung){
        this.Meldung = Meldung;
    }
    
    public MyException(String Meldung, int meldungsNr){
        this.Meldung = Meldung;
        this.meldungsNr = meldungsNr;
    }
    
    public int getMeldungsNr() {     
        return meldungsNr;
    }
    
//    public String showMeldung(String Meldung){
//        return Meldung;
//    }
}
