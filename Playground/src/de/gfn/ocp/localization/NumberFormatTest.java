/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.localization;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author tlubowiecki
 */
public class NumberFormatTest {
    
    public static void main(String[] args) throws ParseException {
        
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormat nfl = NumberFormat.getInstance(Locale.FRANCE);
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        NumberFormat cfl = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat pf = NumberFormat.getPercentInstance();
        NumberFormat pfl = NumberFormat.getPercentInstance(Locale.FRANCE);
        NumberFormat if_ = NumberFormat.getIntegerInstance();
        NumberFormat ifl = NumberFormat.getIntegerInstance(Locale.GERMAN);
        
        double zahl = 195_000.3567;
        System.out.println(nf.format(zahl));
        System.out.println(nfl.format(zahl));
        System.out.println(cf.format(zahl));
        System.out.println(cfl.format(zahl));
        System.out.println(pf.format(zahl));
        System.out.println(pfl.format(zahl));
        System.out.println(if_.format(zahl));
        System.out.println(ifl.format(zahl));
        
        long z2 = (Long)ifl.parse("10.000");
        System.out.println(z2);
        
        System.out.println("--------------");
        
        DecimalFormatSymbols sym = new DecimalFormatSymbols(Locale.FRANCE);
        DecimalFormat df = new DecimalFormat("###,##0.00##", sym);
        System.out.println(df.format(1000001.26747));
    }
    
    
}
