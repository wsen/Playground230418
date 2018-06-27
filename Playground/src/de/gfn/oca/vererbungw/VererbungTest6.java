/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.vererbungw;

import java.io.IOException;

/**
 *
 * @author tlubowiecki
 */
public class VererbungTest6 {
    
    Bb b = new Cc();
    
    Aa a = (Aa)b;
    
    
}

interface Aa {
}

class Bb {
    
    void machWas() throws IOException {
    }
}

class Cc extends Bb implements Aa {
    
    @Override
    void machWas() {
        
        try {
            throw new IOException();
        }
        catch(IOException | RuntimeException ex) {
            //ex = new RuntimeException();
        }
        catch(Exception ex) {
            ex = new RuntimeException();
        }
    }
}

class Butterbrot {
    
}