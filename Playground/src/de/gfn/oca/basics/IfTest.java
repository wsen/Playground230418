/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
public class IfTest {
    
    public static void main(String[] args) {
        
        new IfTest().question();
        
    }
    
    void question() {
        try {
            //question();
            throw new MyStackOverflowError();
        } catch(MyStackOverflowError ex) {
            System.out.println("abc");
        }
    }
}

class MyStackOverflowError extends RuntimeException {
}