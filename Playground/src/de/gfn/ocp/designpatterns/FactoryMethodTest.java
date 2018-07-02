package de.gfn.ocp.designpatterns;

import java.time.LocalTime;

/**
 *
 * @author tlubowiecki
 */
public class FactoryMethodTest {
    
    public static void main(String[] args) {
        
        Creator c = new PKW2Creator();
        Fahrzeug2 pkw = c.create();
        Fahrzeug2 pkw1 = c.factoryMethod();
        
    }
    
}

abstract class Creator {
    
    public Fahrzeug2 create() {
        Fahrzeug2 f = factoryMethod();
        //f.setPs(100);
        return f;
    }
    
    public abstract Fahrzeug2 factoryMethod();
}

class PKW2Creator extends Creator {

    @Override
    public Fahrzeug2 factoryMethod() {
        return new PKW2(200);
    }
}

abstract class Fahrzeug2 {
    
    private int ps;
    
    public Fahrzeug2(int ps) {
        this.ps = ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public int getPs() {
        return ps;
    }
    
    public abstract void gibGas();
    
    public abstract void bremseAb();
    
}

class PKW2 extends Fahrzeug2 {

    public PKW2(int ps) {
        super(ps);
    }
    
    @Override
    public void gibGas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bremseAb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}