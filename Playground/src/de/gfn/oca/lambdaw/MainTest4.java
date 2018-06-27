/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.lambdaw;

/**
 *
 * @author tlubowiecki
 */
public class MainTest4 {
    
    //final String z;
    
    static final int a;
    
    boolean abc = false;
    
    static { 
        a = 10;
        b = 120;
    }
    
    static int b = a;
    
    {
        y = 200; // static
        int x = 100; // lokal
        
        System.out.println("Moin");
    }
    
    int x = 50;

    public boolean isAbc() {
        return abc;
    }

    public void setAbc(boolean abc) {
        this.abc = abc;
    }
    
    public static void main(String[] args) {
        System.out.println(y);
        Zzzzzz z1;
        System.out.println("-------");
        z1 = new Zzzzzz();
        z1 = new Zzzzzz();
        
        double d = 10.0/0;
        System.out.println(d);
        
        /*
        Zzzzzz.machWas();
        Zzzzzz.machWas();
        */
        
        final String x = "abc".concat("cde");
        String y = "abc" + "cdef";
        
        switch("Moin") {
            //case x: break;
            //case y: break;
            //case z: break;
        }
        
        
        
    }
    
    static int y = 0;
}


class Zzzzzz {
    
    static String out;
    static int i;
    static int y;
    
    static {
        out = " stat";
        System.out.println(i = y = 100);
    }
    
    {
        System.out.println(Zzzzzz.class.getName() + " inst");
    }
    
    static void machWas() {
        System.out.println("MachWas!");
    }
    
}