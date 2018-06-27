package de.gfn.oca;

import java.io.IOException;

/**
 *
 * @author tlubowiecki
 */
public class VererbungsTest12 {
    
    public static void main(String[] args) throws IOException {
        
        try {
            //int i = new int[]{1,2,3}[5];
            throw new IOException("Problem");
        }
        finally {
            System.out.println("ENDE");
        }
        
        /*
        SubB b = new SubB();
        b.machWas();
        
        SubC c = new SubC();
        try {
            c.machWas();
        }
        catch(IOException ex) {
            
        }
        
        SuperA a = new SubD();
        try {
            a.machWas();
        }
        catch(IOException ex) {
            
        }
        
        a = new SubC();
        try {
            a.machWas();
        }
        catch(IOException ex) {
            
        }
        */
    }
}

abstract class SuperA {
    
    public void machWas() throws IOException {
        System.out.println("A");
    }
    
}

class SubB extends SuperA {
    
    public void machWas() {
        System.out.println("B");
    }
    
}

class SubC extends SuperA {
    
    public void machWas() throws IOException {
        System.out.println("C");
    }
}

class SubD extends SuperA {
    
    public void machWas() throws IOException {
        System.out.println("D");
    }
}

class SuperGut {
    
    public boolean machWas(Object o) {
        return true;
    }
    
}

interface I {

    default boolean machWas(Object o) {
        return false;
    }
}

class NewSub extends SuperGut implements I {
    
}