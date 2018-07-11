/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.thisTest;

/**
 *
 * @author wsen
 */
public class CheckingThis {

    private int myValue = 0;
    
    public void showOne(int myValue){
        myValue = myValue;
    }
    
    public void showTwo(int myValue){
        this.myValue = myValue;
    }    
    public static void main(String[] args) {
        CheckingThis ct = new CheckingThis();
        ct.showTwo(200);
        System.out.println(ct.myValue); //200
        ct.showOne(100);
        System.out.println(ct.myValue); //200
    }
}