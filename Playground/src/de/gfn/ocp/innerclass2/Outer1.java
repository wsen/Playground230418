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
public class Outer1 {
    
    final static int i;
    private int i2 = 25;
    
    static {
        System.out.println("Static init Outer1");
        i = 10;
    }

    // Static Inner Class
    public static class StaticInner {
        
        final static int i;
    
        static {
            System.out.println("Static init StaticInner");
            i = 20;
        }
        
        public void machWas() {
            
            //System.out.println(new Outer1().i2);
            System.out.println(this);
            System.out.println(i);
            System.out.println(Outer1.i);
            //System.out.println(Outer1.this);
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
}