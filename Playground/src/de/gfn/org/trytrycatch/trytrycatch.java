/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.trytrycatch;

/**
 *
 * @author wsen
 */
public class trytrycatch {
    
    public String exceptions() {
        String result = "";
        //String v = "wsen";//null;
        String v = null;
        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;
    }
    
    public static void main(String[] args) {
//        trytrycatch exept = new trytrycatch();
//        System.out.println(exept.exceptions());
        System.out.println(new trytrycatch().exceptions());
    }
}
