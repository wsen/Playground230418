package de.gfn.ocp.innerclasses;

/**
 *
 * @author tlubowiecki
 */
public class AnonymeClassTest1 {
    
    public static void main(String[] args) {
        
        Abc abc1 = new Abc() {
            @Override
            void machWas() {
                System.out.println("MachWas");
            }
        };
        
        Abc abc2 = new Abc() {
            @Override
            void machWas() {
                System.out.println("MachWas!!!!");
            }
        };
        
        abc1.machWas();
        abc2.machWas();
        
        Bcd bcd1 = new Bcd() {
            
            void machWasNeues() {
            }
            
            void machWas() {
                machWasNeues();
            }
        };
    }
}

abstract class Abc {
    
    abstract void machWas();
    
    void machWasAnderes() {
        System.out.println("WasAnderes");
    }
}

class Bcd {
    
    void machWas() {
        System.out.println("Bcd WasAnderes");
    };
    
    void machWasAnderes() {
        System.out.println("Bcd WasAnderes");
    }
}


