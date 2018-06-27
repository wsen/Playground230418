/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basicsw;

/**
 *
 * @author tlubowiecki
 */
public class FlowControlTest {
    
    public static void main(String[] args) {
        
        int i = 10;
        
        if(i < 10) {
            
        }
        else if(i < 5) {
            
        }
        else if(i < 2) {
            
        }
        else {
            
        }
        final int x = 100;
        machWas(x);
    }
    
    static void machWas(int x) {
        x += 10;
    }
    
}

class OtherScout {
    public String name;
}