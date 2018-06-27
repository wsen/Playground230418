/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.innerclassw;

/**
 *
 * @author student
 */
public class InnerClassTest1 { //TopLever public oder package Scope
    
    private static int outerStaticZahl = 4;
    private int outerZahl = 5;
    
    public static int outerStaticPubZahl = 44;
    public int outerPubZahl = 55;
    
    public static void main(String[] args) {
        InnerClassTest1 ict1 = new InnerClassTest1();
        Inner i = ict1.new Inner();
        //Zugriff außerhalb
        InnerClassTest1.Inner j = ict1.new Inner();
        System.out.println(i.zahl); // so ist ein Zugriff auf inner möglich
        i.machWas();
        
        //System.out.println(zahl); // kein Zugriff auf Var von Inner
        
    }
    
    class Inner { //verträgt alle Scopes halleluja
        //public int zahl = 10;
        private int zahl = 100;
        // public static int staticZahl = 9; // nur in statischen Klassen
        
        
        void machWas() {
            int outerZahl = 500;
            
            System.out.println(outerStaticZahl);
            System.out.println(outerZahl);
            System.out.println(outerStaticPubZahl);
            System.out.println(outerPubZahl);
        }
    }
}
