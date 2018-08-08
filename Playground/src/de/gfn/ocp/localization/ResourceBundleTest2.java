/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author tlubowiecki
 */
public class ResourceBundleTest2 {
    
    public static void main(String[] args) {
        
        ResourceBundle rb = ResourceBundle.getBundle("de.gfn.ocp.localization.test", Locale.GERMAN);
        System.out.println(rb.getString("table"));
        System.out.println(rb.getString("pen"));
        System.out.println(rb.getString("car"));
        System.out.println(rb.getString("drink"));
    }
}
