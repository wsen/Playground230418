package de.gfn.org.objectsAndReferences;

/**
 * Standard Tests - Test 1 Q 63 
 * @author wsen
 */
class Baap {
    public int h = 4; //2
    public int getH() {
        System.out.println("Baap " + h);
        return h;
    }
}

public class Beta extends Baap {
    public int h = 44; //4 //3
    public int getH() { //1
    // Further, inside Beta's getH(), Beta's h will be accessed instead of Baap's h 
    // because you are accessing this.h ('this' is implicit) and the type of this is Beta.        
        System.out.println("Beta " + h); 
        return h;
    }
    public static void main(String[] args) {
        //However, the type of reference of b is Baap
        //so b.h will always refer to Baap's h
        Baap b = new Beta();    //Here, b refers to an object of class Beta
                                //so b.getH() will always call the overridden (subclass's method)
        System.out.println("Baap b = new Beta(): " + b.h/*2*/ + " " + b.getH())/*1*/;
        // also 1) prints getH(), 2) prints diese mit b.h und b.getH() mit Return Wert
        Beta bb = (Beta) b;
        System.out.println("Beta bb = (Beta) b : " + bb.h/*4*/ + " " + bb.getH()/*3*/);
    }
}


/*
Beta 44 //1
Baap b = new Beta(): 4 //2  44 //3
Beta 44 //1
Beta bb = (Beta) b : 44 //3  44 //4
*/