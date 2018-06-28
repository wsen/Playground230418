/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.innerclassw;
//import de.gfn.ocp.innerclassw.Outer1 //brauch keinen static import
// Aufeilen in externe OUter1.java u Outer2.java Files
/**
 *
 * @author student
 */
public class StaticInnerTest {
    public static void main(String[] args) {
        Outer1.StaticInner in1 = new Outer1.StaticInner(); //statisch
        Outer2.MemberInner in2 = new Outer2().new MemberInner(); //
        
        //oder dies in 2 Schrittten
//        Outer2 out2 = new Outer2();
//        out2.new;
//        
    }
}


class Outer1 {
    // Static Inner Class
    static class StaticInner {
        
    }
}


class Outer2{
    // Member Inner Class
    class MemberInner {
        
    }
}