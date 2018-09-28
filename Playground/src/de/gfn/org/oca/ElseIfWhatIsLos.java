/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class ElseIfWhatIsLos {
    public static void main(String[] args) {
        String str = "null";
        if (str == null) {
            System.out.println("null");
        } else if (str.length() == 0) {
            System.out.println("zero");
        } else {
            System.out.println("some");
        }
    }
}
