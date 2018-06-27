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
    
    static {
        System.out.println("InnerClassTest1 static");
    }

    {
        System.out.println("InnerClassTest1 init");
    }
    
    private static int outerStaticZahl = 4;
    private int outerZahl = 5;
    
    public static int outerStaticPubZahl = 7;
    public int outerPubZahl = 8;
    
    public static void main(String[] args) {
        
        InnerClassTest1 ict1 = new InnerClassTest1();
        InnerClassTest1.Inner i;
        InnerClassTest1.StaticInner si;
    }
    
    static void machWasStatic() {
        
        class LocalInner {
            {
                System.out.println(outerStaticPubZahl);
                //System.out.println(outerPubZahl);
            }
        }
        LocalInner li = new LocalInner();
    }
    
    void machWas() {
        
        abstract class LocalInner {
            {
                System.out.println(outerStaticPubZahl);
                System.out.println(outerPubZahl);
                //machWas();
            }
        }
        
        class LocalInner2 extends LocalInner {
        }
        
        LocalInner li = new LocalInner() {
        };
    }
    
    
    
    final class Inner {
        
        {
            System.out.println("Inner init");
        }
        
        private int zahl = 10;

        public Inner() {
        }
        
        void machWas() {
            //int outerZahl = 500;
            System.out.println(outerStaticZahl);
            System.out.println(outerZahl);
            System.out.println(outerStaticPubZahl);
            System.out.println(outerPubZahl);
            //machWas();
        }
    }
    
    static class StaticInner {
        
        static {
            System.out.println("StaticInner static");
        }
        
        {
            System.out.println("StaticInner init");
        }
        
        public static int staticZahl = 9;
        private int zahl = 10;
        
        private static void machWasStatic() {
            System.out.println("Static");
        }
        
        void machWas() {
            System.out.println(outerStaticZahl);
            //System.out.println(outerZahl);
            System.out.println(outerStaticPubZahl);
            //System.out.println(outerPubZahl);
        }
    }
}
