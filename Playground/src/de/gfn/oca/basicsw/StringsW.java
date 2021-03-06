package de.gfn.oca.basicsw;

/**
 *
 * @author w_sen
 */
public class StringsW {
    
    public static void main(String[] args) {
        
        // StringLiteralPool
        System.out.println("===== String Pool =====");
        String s1 = "Hallo Welt";
        String s3 = "Hallo Welt";
        //s3 = "Hallo zweite Welt";
        
//        Object o1 = new Object();
//        Object o2 = new Object();
//        System.out.println(o1 == o2);
//        System.out.println(o1.equals(o2));
        
        System.out.println(s1.hashCode());
        System.out.println(s3.hashCode());
        System.out.print("s1 == s3: "); 
        System.out.println(s1 == s3); //true -> vergleicht Inhalt
        System.out.println("s1.equals(s3): " + s1.equals(s3)); //true -> vergleicht Inhalt
        
        System.out.println("===== String Object =====");
        
        //String as new Object
        String s2 = new String("Hallo andere Welt");
        String s4 = new String("Hallo andere Welt");
        
        System.out.println(s2.hashCode());
        System.out.println(s4.hashCode());
        System.out.print("s2 == s4: "); 
        System.out.println(s2 == s4); //false -> vergleicht Referenz
        System.out.print("s2.equals(s4): "); 
        System.out.println(s2.equals(s4)); //true -> vergleicht Inhalt
        
        System.out.println("--------");
         
        String ss1 = "1";
        String ss2 = ss1.concat("2");
        s2.concat("3");
        System.out.println(ss2);
        
        
    }
    
}
