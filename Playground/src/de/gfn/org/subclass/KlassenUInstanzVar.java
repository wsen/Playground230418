/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.subclass;

/**
 *
 * @author wsen
 */
public class KlassenUInstanzVar {
    static int i;
    
    int j;
    KlassenUInstanzVar(){System.out.println("--"+i+"--"+j+"--"); j=i++; System.out.println(">-"+i+"--"+j+"--");}
    
    public static void main(String[] args) {     
        System.out.println("-------");
        KlassenUInstanzVar s = new KlassenUInstanzVar();
        KlassenUInstanzVar s1 = new KlassenUInstanzVar();
        KlassenUInstanzVar s2 = new KlassenUInstanzVar();
        System.out.print("i = "+s.i);
        System.out.print(" ,j = "+s.j);
    }    
}
