/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.undoder;

/**
 *
 * @author wsen
 */
public class ShortCurcuit {
    public static void main(String[] args) {
        boolean greenLight = true;
        boolean pedestrian = false;
        boolean rightTurn = true;
        boolean otherLane = false;

//You can go ahead only if  the following expression evaluates to 'true' :

      // boolean hans = (( (rightTurn && !pedestrian || otherLane) || ( false && !pedestrian && greenLight ) )  == true );
      
       //boolean adam = true  && false;
       boolean adam = false;
       adam = (greenLight == true  && !pedestrian == false);
       int y = 4;
       boolean xx = true  || (y < 4);   
       boolean x = true  && false ;   
           
       boolean hans = (( (true && true || false) || ( false && true && true ) )  == true );
       boolean franz = (( (true && true || false) || ( true && true && true ) )  == true );
       //                       true    false     ||     false
      //                            true              false  
      //                                        false
        System.out.println("Der wahre Adam: " + adam);
        System.out.println("Das wahre xx: " + xx);
        System.out.println("Das wahre x: " + x);
        System.out.println("Der wahre Hans: " + hans);
        System.out.println("Der wahre Franz: " + franz);
        
        System.out.println("-------");
        String a = "java";
        char[] b = { 'j', 'a', 'v', 'a' };
        String c = new String(b);
        String d = a;
        
        System.out.println("a == d");
        //System.out.println(b == d); //incomporable types
        System.out.println(a == "java");
        System.out.println(a.equals(c));

        
    }
}
