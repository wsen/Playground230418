/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.innerclasses;

import de.gfn.ocp.innerclass2.Outer1;
import de.gfn.ocp.innerclass2.Outer1.StaticInner;
import de.gfn.ocp.innerclass2.Outer2;
import de.gfn.ocp.innerclass2.Outer3;
import de.gfn.ocp.innerclass2.Outer3.InnerInterface;
import de.gfn.ocp.innerclass2.Outer3.InnerStaticInterface;

/**
 *
 * @author tlubowiecki
 */
public class StaticInnerTest {
    
    public static void main(String[] args) {
        
        Outer1.StaticInner in1 = new StaticInner();
        in1.machWas();
        
//        MemberInner in2 = new MemberInner();
//        Outer2 out2 = new Outer2();
//        Outer2.MemberInner in2 = out2.new MemberInner();
//        in2.machWas();
        
        int zahl = 10;

        // Local Inner Class
        class LocalInner {
            
            private int i;
            
            void machWas() {
                System.out.println(args);
            }
        }
        //zahl = 11;
        
        LocalInner loc1 = new LocalInner();
        
        // Anonymus Inner Class
        Comparable<String> comp = new Comparable<String>() {
            @Override
            public int compareTo(String o) {
                return zahl;
            }
        };
        
        Comparable<String> comp2 = (s) -> 1;
    }
}





