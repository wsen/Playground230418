/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca8_test_all;

/**
 *
 * @author wsen
 */
class ProGrKl {
    public static void main(String[] args) {
        Print p = new Print();
        //FPrint p = new FPrint();
        //System.out.println(p.print(5));
        p.print(5);
        //FPrint.print(2);
    }
}

class Print {
    
    public void print(int i) {
        System.out.println(i);
    }
}

//class FPrint {
//    private static void p2(int i){
//        System.out.println(i * 2);
//    }
//    static void print(int i){
//        System.out.print(i);
//    }
//}
