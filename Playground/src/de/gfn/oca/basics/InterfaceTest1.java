/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
public class InterfaceTest1 {
    
    public static void main(String[] args) {
        
        I1 i = new C1();
        
    }
}

interface I1 {
    Object machWas();
}

interface I2 extends I1 {
    String machWas();
}

class C1 implements I2 {

    @Override
    public String machWas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    void machWasAnderes(){
        
        try {
            try {

            }
            catch(Exception e) {
               throw new RuntimeException();
            }
        } catch(RuntimeException e) {
            
        }
    }
    
}
