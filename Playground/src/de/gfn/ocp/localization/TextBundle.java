package de.gfn.ocp.localization;

import java.util.ListResourceBundle;

/**
 *
 * @author tlubowiecki
 */
public class TextBundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][] {
            {"k1", "Moin Moin"},
            {"k2", "Hallo Welt"}
        };
    }
}
