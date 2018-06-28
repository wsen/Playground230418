package de.gfn.ocp2.xtest;

/**
 *
 * @author student
 */

public class Xtest {

    public static void main(String[] args) {
        String ejgStr[] = new String[][]{{null}, new String[] {"a","b","c"}, {new String()}}[0];
        String ejgStr1[] = null;
        String ejgStr2[] = {null};
        
        System.out.println("ejgStr Array Länge: " + ejgStr.length);       
        
        System.out.println(ejgStr[0]);  //null
        System.out.println(ejgStr2[0]); //null
        System.out.println(ejgStr1[0]); //NullPointerException
//        • Was ist die Ausgabe? (1) 
//        A.null  NullPointerException
//        B.null  null  NullPointerException
//        C.NullPointerException
//        D.null  null  null 
    }
}
