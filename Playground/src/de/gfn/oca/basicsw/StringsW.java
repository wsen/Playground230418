/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basicsw;

/**
 *
 * @author student
 */
public class StringsW {
    public static void main(String[] args) {
        String s1 = "Hallo Welt"; //Literal bzw. StringLiteralPool
        
        //Beispiel
        s1 = s1 + "...";  //Srings sind immutable (final)
        
        String s3 = "Hallo Welt";
        
        String s2 = new String("Hallo andere Welt"); //Objeckt <> StringLiteralPool
    }
}
