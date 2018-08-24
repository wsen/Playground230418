/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.methodcalls;

/**
 *
 * @author wsen
 */
public class MethodCall {
    
    public void methodA() { return; }        //A
    public void methodB() { return null;}   //B  null nur bei Object
    public void methodD() {}                //C
    public int methodDe() { return 9;}       //D
    public int methodE() { return 9.0;}     //E
    public int methodF() { return;}         //F
    public int methodG() { return null;}    //G 
    public String methodS() { return null;}    //G 

    public void moreA(int... nums) {}
    public void moreB(String values, int... nums) {}
    public void moreC(int... nums, String values) {}
    public void moreD(String... values, int... nums) {}
    public void moreE(String[] values, ...int nums) {} //...int !!!
    public void moreF(String... values, int[] nums) {}
    public void moreG(String[] values, int[] nums) {}  //varArg immmer am Ende
    howMany(true, new boolean[2]);
    
    public static void main(String[] args) {
        
    }
    
}
