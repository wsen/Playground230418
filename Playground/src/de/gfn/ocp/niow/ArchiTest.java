/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.niow;

/**
 *
 * @author student
 */
public class ArchiTest {
    public static void main(String[] args) {
        Stecker s = SteckerProvider("EU");
    }
    
}

interface Stecker {
    void gibStrom();
}

class SteckerProvider { // Komplexität verstecken
    // Kein Lambda weil hier konkrete Stecker-Objekte zurückgegeben
    //https://docs.oracle.com/javase/8/docs/api/java/nio/file/Path.html
    
    public static Stecker getStecker(String typ) {
        switch(typ){
            case "EU":
                return new Stecker(){
                    @Override
                    public void gibStrom() {
                        System.out.println("EU Stecker");
                    }
                };
            case "GB":
                return new Stecker(){
                    @Override
                    public void gibStrom() {
                        System.out.println("GB Stecker");
                    }
                };
            case "US":
                return new Stecker(){
                    @Override
                    public void gibStrom() {
                        System.out.println("US Stecker");
                    }
                };
            default:
                return null;
        }
    }
}
