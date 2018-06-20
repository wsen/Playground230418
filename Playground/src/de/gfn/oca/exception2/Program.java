/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.exception2;

/**
 *
 * @author wsen
 */
public class Program {
//    static{
//        x=10;
//        y=5;
//    }
//    //final int x;
//    final static int x;
//    final static int y;
    
    
    
    public static void main(String[] args) {
//        try{
//            Program pr = new Program();
//            int c = pr.x/y;
//            System.out.println(c);
//        }catch(ArithmeticException E){
//            System.out.println("Arithmetic Exception");
//        }
        Print p = new Print();
        //Print.p2(6);
        //P.p2(6);
        p.print(6);
        //Print.print();
    }
}

class Print{
    private static void p2(int i){
    //protected static void p2(int i){
        System.out.print(i*2);
    }
    
    static void print(int i){
        System.out.print(i);
    }
}