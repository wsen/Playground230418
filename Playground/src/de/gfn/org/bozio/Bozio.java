package de.gfn.org.bozio;

/**
 *
 * @author wsen
 */

interface Terry {
    //int type = 0;
    public final static int type = 0;
    public void jump();
}

public class Bozio implements Terry {

    public Bozio() {
        type = 1; 
//cannot assign a value to final variable (of inteface Terry)
    }
    
    public void jump(){
        System.out.println("jumping ..." + type);
    }
    
    public static void main(String[] args) {
        Terry b = new Bozio();
        b.jump();
    }
    
}
