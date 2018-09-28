/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.staticgedoens;

/**
 *
 * @author wsen
 */
public class EMyMethods {
    static String name = "m1";
    void riverRafting() {
        String name = "m2";
        if (true) {
            String name = "m3";
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        EMyMethods m1 = new EMyMethods();
        m1.riverRafting();
    }
}
