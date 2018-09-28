package de.gfn.org.oca;

/**
 *
 * @author wsen
 */

class SpecialException extends Exception {
    public SpecialException(String message) {
        super(message);
        System.out.println(message);
    }
}

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            doSomething();
        }
        catch (SpecialException e) {
            System.out.println(e);
        }
    }
    
    static void doSomething() throws SpecialException {
        int[] ages = new int[4];
        ages[4] = 17; //ArrayIndexOutOfBoundsException
//        ages[3] = 17; //alles in Ordnung
        doSomethingElse();
    }
    
    static void doSomethingElse() throws SpecialException {
        throw new SpecialException("Thrown at end of doSomenthingElse");
//        throw new SpecialException(); //no-argument constructor
    }
}

/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
	at de.gfn.org.oca.ExceptionTest.doSomething(ExceptionTest.java:27)
	at de.gfn.org.oca.ExceptionTest.main(ExceptionTest.java:18)
/Users/wsen/LAB/java/gfn/Playground230418/Playground/nbproject/build-impl.xml:1082: The following error occurred while executing this line:
/Users/wsen/LAB/java/gfn/Playground230418/Playground/nbproject/build-impl.xml:778: Java returned: 1
BUILD FAILED (total time: 1 second)
*/