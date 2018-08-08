package de.gfn.ocp.innerclasses;

/**
 *
 * @author tlubowiecki
 */
public class LocalClassTest {
    
    public static void main(String[] args) {
        
    }
    
}

class Thing {
    
    private int zahl1 = 10;
    private static int sZahl = 1;
    
    
    public void machWas(int zahl2) {
        
        abstract class OtherThing {
            abstract int machWasAnderes(int zahl3);
        }
        
        int lZahl = 2;
        
        OtherThing ot = new OtherThing() {
            @Override
            int machWasAnderes(int zahl3) {
                ++sZahl;
                return zahl3 - zahl1++ - lZahl;
            }
        };
    }
}