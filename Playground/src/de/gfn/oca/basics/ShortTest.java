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
public class ShortTest {
    
    public static void main(String[] args) {
        
        //Long l = 10; // 10 wird zu Integer geboxt, Fehler bei Integer nach Long
        long l2 = new Integer(10); // Integer wird ausgepackt, int nach long ok
        
    }
    
    static long machWas(short s) {
        return s;
    }
    
}
