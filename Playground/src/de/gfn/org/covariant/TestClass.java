package de.gfn.org.covariant;

/**
 *
 * @author wsen
 */

class Base {
    public Object getValue(){return new Object();}
}

class Base2 extends Base {
    public String getValue(){return "hello";}
    
//wird überschrieben wenn return typ covariant
//Methode auf Objekt ausgeführt, nicht auf der Referenz
//falls getValue in Base2 nicht existieren würde, dann die von Base wirksam
}

public class TestClass {
    public static void main(String[] args) {
        Base b = new Base2();
        System.out.println(b.getValue());
    }
}
