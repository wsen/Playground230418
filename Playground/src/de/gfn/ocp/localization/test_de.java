/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.localization;

import java.util.ListResourceBundle;

/**
 *
 * @author tlubowiecki
 */
public class test_de extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        //Object[][] obj = {{"table", "TischJ"},{"pen", "FederJ"},{"car", "AutoJ"}};
        Object[][] obj = new Object[3][2];
        obj[0][0] = "table";
        obj[0][1] = "Tisch";
        obj[1][0] = "pen";
        obj[1][1] = "Feder";
        obj[2][0] = "car";
        obj[2][1] = "Auto";
        return obj;
    }
}
