/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
public class UnreachableTest {
        public float parseFloat( String s ){
        float f = 0.0f;      // 1
        try{
             f = Float.valueOf( s ).floatValue();    // 2
             return f ;      // 3
        }
        catch(NumberFormatException nfe){
           f = Float.NaN ;    // 4
          return f;     // 5
        }
        finally {
            return f;     // 6
        }
 //       return f ;    // 7 unreachable
    }
    
    
}
    
    
