/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.iterator;

/**
 *
 * @author wsen
 */
public class IteratorCheck {
    public static void main(String[] args) {
        new IteratorCheck().iterator(new int[]{10,12,13});
    }
    
    void iterator(int []i){
        for(int x=0;x<i.length;System.out.print(i[x]+" "))x++;
        
        /*
        for(int x=0;x<i.length;x++)
            System.out.print(i[x]+" ");
        */
    }
}
