package de.gfn.oca.basicsw;

/**
 *
 * @author tlubowiecki
 */
public class StringTest {

    public static void main(String[] args) {

//        String s1 = "Das ist ein Haus von Nikigraus!";
//        String s2 = "Dch bin ein Jakartianer!";
//
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.substring(0, 5).concat(" Nix ").trim());
//
//        StringBuilder sb1 = new StringBuilder();
//        //StringBuilder sb2 = new StringBuilder(sb1);
//        sb1.append("Das ist ein Haus");
//        sb1.append(" ");
//        sb1.append("Nikigraus");
//        sb1.delete(0, 5).append("... ");
//        System.out.println(sb1.capacity());
//        System.out.println(sb1.length());
//        System.out.println(sb1);
//
//        System.out.println("--------");
//
//        StringBuilder sb2 = new StringBuilder(10);
//        System.out.println(sb2.capacity());
//
//        System.out.println("--------");
        

        String s3 = "Hallo";
        String s4 = s3 + " Welt";
        String s5 = s3 + " Welt";
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        System.out.print("s4 == s5: ");
        System.out.println(s4 == s5);
        // "d.h. Concats aus inhaltlichen gleichen Strings aus Stringpool sind unterschiedlich");

        System.out.println("\n--------");
        String s = "Hello"; //String Pool
        String t = new String(s); //String Object
        String u = t;
        if ("Hello".equals(s)) {
            System.out.println("(1) String equals String (String Pool)");  //true
        }
        if (t == s) {
            System.out.println("(2) String (Object) == String (Pool)");
        }
        if (u == t) {
            System.out.println("(3) String (Object) == String (Object)"); //true
        }
        
        if (t.equals(s)) {
            System.out.println("(4) String (Object) equals String (Pool)");  //true
        }
        if (s.equals(t)) {
            System.out.println("(5) String (Pool) equals String (Object)");  //true
        }
        if ("Hello" == s) {
            System.out.println("(6) String == String (Pool)");  //true
        }
        if ("Hello" == t) {
            System.out.println("(7) String == String (Object)");
        }

    }

}
