/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.packages2.ropeswing;
import de.gfn.org.packages2.rope.*;
//import static de.gfn.org.packages2.rope.Rope.*;
/**
 *
 * @author wsen
 */
public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        System.out.println(rope1.length);
        
        int[] a = { 1, 2, 3, 4 };    
	int[] b = { 2, 3, 1, 0 }; 							  
	System.out.println( a [ (a = b)[3] ] ); 
    }
}
