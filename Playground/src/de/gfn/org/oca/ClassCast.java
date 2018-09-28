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
    @Override
    public void mX(){
        System.out.println("Xm2");
    }
    
    public void mY(){
        System.out.println("Ym");
    }
}

public class ClassCast {
    public static void main(String[] args) {
        XX xRef = new YY();
        YY yRef = (YY) xRef;
        //YY yRef = (YY) new XX(); // ClassCastException
        yRef.mY();
        xRef.mX();
    }
}
