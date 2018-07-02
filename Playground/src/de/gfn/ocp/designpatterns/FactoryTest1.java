package de.gfn.ocp.designpatterns;

//import static de.gfn.ocp.designpatterns.FahrzeugFactory.FahrzeugArt.*;
import de.gfn.ocp.designpatterns.FahrzeugFactory.FahrzeugArt;

/**
 *
 * @author tlubowiecki
 */
public class FactoryTest1 {
    
    public static void main(String[] args) {
        
        Fahrzeug motorrad = FahrzeugFactory.getFahrzeug(FahrzeugArt.BOOT, "Honda", "ABC-5");
        motorrad.gibGas();
        
        Fahrzeug pkw = FahrzeugFactory.getFahrzeug(FahrzeugArt.PKW, "Mercedes", "A-Klasse");
        pkw.gibGas();
        
    }
}

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

    public int getPs() {
        return ps;
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

class LKW extends Fahrzeug {

    public LKW(String marke, String typ) {
        super(marke, typ, 200, 120);
    }
    
    @Override
    public void gibGas() {
        System.out.println("gibBas LKW");
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
        System.out.println("gibBas Motorrad");
    }

    @Override
    public void bremseAb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

class FahrzeugFactory {
    
    public static Fahrzeug getFahrzeug(FahrzeugArt fahrzeug, String marke, String typ) {
        
        switch(fahrzeug) {
            
            case PKW: return new PKW(marke, typ);
            case LKW: return new LKW(marke, typ);
            case MOTORRAD: return new Motorrad(marke, typ);
        }
        
        throw new IllegalArgumentException("Gewünschtes Fahrzeug nicht da");
    }
    
    static public enum FahrzeugArt {
        PKW, LKW, MOTORRAD, BOOT
    }
}
