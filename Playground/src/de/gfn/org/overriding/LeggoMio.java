/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.overriding;

/**
 *
 * @author wsen
 */
public class LeggoMio {
    
    void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }
    
    public static void main(String[] args) {
        new LeggoMio().crazyLoop();
    }
}
