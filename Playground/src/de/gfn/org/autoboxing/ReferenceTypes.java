package de.gfn.org.autoboxing;

/**
 * boya OCA s194
 *
 * @author student
 */
public class ReferenceTypes {

    public void fly(String s) {
        System.out.print("string ");
    }

//    public void fly(Integer i) {
//        System.out.print("integer");
//    }

    public void fly(Object o) {
        System.out.print("object ");
    }
    
    public static void play(Long l) { 
        System.out.println("escht long, Alter");
    }
    
    public static void play(Long... l) { 
        System.out.println("This is a long Long long way");
    }
    
    public static void main(String[] args) {
        ReferenceTypes r = new ReferenceTypes();
        r.fly("test");
        r.fly(56);
        
        System.out.println("--- s196 boya oca ----");
        //play(4); // DOES NOT COMPILE
        play(4L); // calls the Long version
    }
}
