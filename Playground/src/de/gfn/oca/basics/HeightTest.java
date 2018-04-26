/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

/**
 *
 * @author student
 */
public class HeightTest {
    public int height;
    private void setHeight(int newHeight) {
    if(newHeight <= 300)
        height = newHeight;
    }
    
    
    public static void main(String[] args) {
        HeightTest ht = new HeightTest();
        ht.setHeight(300);
        System.out.printf("Die Höhe ist %s.",ht.height );
        
        HeightSuperTest sht = new HeightSuperTest();
        sht.setHeight(400);
        System.out.printf("Die SuperHöhe ist %s.",sht.height );
    }
    
}
