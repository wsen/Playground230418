/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.designpatternsw;
import de.gfn.ocp.designpatternsw.FahrzeugFactory.FahrzeugArt;
/**
 * Factory Pattern
 * @author wsen
 */
public class FacroryTest1 {
        Fahrzeug motorrad = FahrzeugFactory.getFahrzeug(FahrzeugArt.BOOT, "Honda", "ABC-5");
        motorrad.gibGas();
        
        Fahrzeug pkw = FahrzeugFactory.getFahrzeug(FahrzeugArt.PKW, "Mercedes", "A-Klasse");
        //pkw.gibGas();
        pkw.gibGas();
}

//Abstrakte Klasse als Basis
abstract class Fahrzeug {
    private String marke;
    private String typ;
    private int ps;
    private int geschwindigkeit;

    public Fahrzeug(String marke, String typ, int ps, int geschwindigkeit) {
        this.marke = marke;
        this.typ = typ;
        this.ps = ps;
        this.geschwindigkeit = geschwindigkeit;
    }
    
    

    public String getMarke() {
        return marke;
    }

    public String getTyp() {
        return typ;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }
    
    public abstract void gibGas();
    
    public abstract void bremseAb();
    
}

class PKW extends Fahrzeug {

    public PKW(String marke, String typ) {
        super(marke, typ, 50, 180);
    }

    @Override
    public void gibGas() {
        System.out.println("gibBas PKW");
    }

    @Override
    public void bremseAb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}

class Motorrad extends Fahrzeug {

    public Motorrad(String marke, String typ) {
        super(marke, typ, 30, 150);
    }
    
    

    @Override
    public void gibGas() {
       
    }

    @Override
    public void bremseAb() {
        
    }   
}

class LKW extends Fahrzeug {

    public LKW(String marke, String typ) {
        super(marke, typ, 30, 150);
    }
    
    

    @Override
    public void gibGas() {
       
    }

    @Override
    public void bremseAb() {
        
    }   
}

//FACTORY class
class FahrzeugFactory{
    
    public static Fahrzeug getFahrzeug(FahrzeugArt fahrzeug, String marke, String typ) {
        switch(fahrzeug){//fahrzeug.toLowerCase()) {
//            case "pkw": return new PKW(marke, typ);
//            case "lkw": return new LKW(marke, typ);
//            case "motorrad": return new Motorrad(marke, typ);
            case PKW: return new PKW(marke, typ);
            case LKW: return new LKW(marke, typ);
            case MOTORRAD: return new Motorrad(marke, typ);
                
        }
        throw new IllegalArgumentException("BOAHH");
    }
    
    static public enum FahrzeugArt { //von Haus aus static
        PKW, LKW, MOTORRAD, BOOT
    }
    
}
