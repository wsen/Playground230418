package de.gfn.org.oca;

/**
 *
 * @author wsen
 */

class XX {
    public void mX(){
        System.out.println("Xm1");
    }
}

class YY extends XX {
    public void mX(){
        System.out.println("Xm2");
    }
    
    public void mY(){
        System.out.println("Ym");
    }
}

public class ClassCast {
    public static void main(String[] args) {
        XX xRef = new YY(); //OK
        YY yRef = (YY) xRef;
        yRef.mY();
        xRef.mX();
    }
}
