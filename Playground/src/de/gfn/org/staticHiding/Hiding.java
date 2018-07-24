/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.staticHiding;

/**
 *
 * @author wsen
 */
class Hiding {
    public static void sM1() {  System.out.println("In base static"); }
}

class B extends Hiding {

//Line 1 --> // 
    public static void sM1() {  System.out.println("In sub static"); }

//Line 2 --> // 
//    public  void sM1() {  System.out.println("In sub non-static"); }
    
    public static void main(String[] args) {
//        B b = new B();
//        b.sM1();
//        Hiding h = new Hiding();
//        h.sM1();
//        Hiding bh = new B();
//        bh.sM1();
        String argss=null;
        boolean hasParams = (args == null ? false : true);
        if(hasParams){
            System.out.println("has params");
        }{
            System.out.println("no params");
        }
    }
}