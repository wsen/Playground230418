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
public class TextBundle_de extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {"k1", "Guten Tag"},
            {"k2", "Hallo Welt"}
        };
    }
}
