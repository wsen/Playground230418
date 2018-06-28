/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.innerclass2;

/**
 *
 * @author tlubowiecki
 */
public class Outer2 {
    
    private String name = "Test";
    private static String staticName = "Test2";
    
    public void machWasOuter() {
    }
    
    public static void machWasStaticOuter() {
    }
    
    // Member Inner Class
    public class MemberInner {
        
//        static int x = 10;
//        
//        public static void machWasStatic() {
//            
//        }
        
        public void machWas() {
            System.out.println(this);
            System.out.println(Outer2.this);
            System.out.println(name);
            machWasOuter();
            machWasStaticOuter();
        }

        @Override
        public String toString() {
            return "MemberInner";
        }
    }
    
    @Override
    public String toString() {
        return "Outer";
    }
    
    interface IInner {
        
        void machWas();
        
        default void machWasDefault() {
            //System.out.println(name);
            System.out.println(staticName);
            //machWasOuter();
            machWasStaticOuter();
        }
    }
}