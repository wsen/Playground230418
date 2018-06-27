/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.innerclasses;

/**
 *
 * @author tlubowiecki
 */
public class InnerClassTest1 {
    
    private static int outerStaticZahl = 4;
    private int outerZahl = 5;
    
    public static int outerStaticPubZahl = 7;
    public int outerPubZahl = 8;
    
    public static void main(String[] args) {
        
        InnerClassTest1 ict1 = new InnerClassTest1();
        InnerClassTest1.Inner i = ict1.new Inner();
        System.out.println(i.zahl);
        i.machWas();
        
        //System.out.println(zahl);
        
    }
    
    class Inner {
        
        //public static int staticZahl = 9;
        private int zahl = 10;
        
        void machWas() {
            
            int outerZahl = 500;
            
            System.out.println(outerStaticZahl);
            System.out.println(outerZahl);
            System.out.println(outerStaticPubZahl);
            System.out.println(outerPubZahl);
        }
    }
}
