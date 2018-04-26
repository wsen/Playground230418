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
public class DatentypenW {
    
    public static void main(String[] args) {
        
        DatentypenW dt = new DatentypenW();
        
        boolean b = true;
        
        byte by = -128;
        
        short s = 10000;
        
        int i = 10000000;
        
        long l = 10000000000L;
        
        //dt.machWas(1000000000000L);
        
        //int z = 0b10101; // 21 LONG
        int z = 0x10101; // 65793 HEXA
        
        System.out.println(z);
        System.out.println(Integer.toHexString(s));
        
        float f = 0.0f;
        double d = 0.0;
        
        char c = 'c';  //EINFACHE ANFÜHRUNGSSTRICHE !!! ansonsten String ""
    
        int x = c;
        System.out.println(x);
        c = 325;  //char max 65.535 geht
        
        System.out.println(c);
    
    }
    
    void machWas(byte i) {
        System.out.println("BYTE");
    }
    
    void machWas(short i) {
        System.out.println("SHORT");
    }
    
    void machWas(int i) {
        System.out.println("INT");
    }
    
    void machWas(long i) {
        System.out.println("LONG");
    }
}