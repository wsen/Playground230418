package de.gfn.oca.generics;

/**
 *
 * @author tlubowiecki
 */
public class GenericTest {
    
    public static void main(String[] args) {
        
        Box<String, Integer> b = new Box();
        b.setInhalt("Mein ganz langer Text...");
        String nStr = b.getInhalt();
        
        Box<Integer, String> b2 = new Box();
        b2.setInhalt(1);
        int nInt = b2.getInhalt();
        
    }
    
}

class Box<T, R> {
    
    private T inhalt;

    public T getInhalt() {
        return inhalt;
    }

    public void setInhalt(T inhalt) {
        this.inhalt = inhalt;
    }
    
    public R machWas(T inhalt, boolean b) {
        this.inhalt = inhalt;
        return null;
    }
}
