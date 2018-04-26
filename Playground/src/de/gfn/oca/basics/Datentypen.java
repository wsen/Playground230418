package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
public class Datentypen {
    
    public static void main(String[] args) {
        
        Datentypen dt = new Datentypen();
        
        boolean b = true;
        
        byte by = -128;
        
        short s = 10000;
        
        int i = 10000000;
        
        long l = 10000000000L;
        
        dt.machWas(1000000000000L);
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
