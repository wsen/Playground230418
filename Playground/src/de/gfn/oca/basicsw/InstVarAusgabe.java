/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basicsw;

/**
 *
 * @author wsen
 */
class Printer {
    int inkLevel;
}

class LaserPrinter extends Printer {
    int pagesPerMin;
}

public class InstVarAusgabe {
    public static void main(String[] args) {
//        LaserPrinter myPrinter = new LaserPrinter();
//        System.out.println(myPrinter.pagesPerMin);
        
//      Jetzt class Printer mit CAST LaserPrinter
        Printer myPrinter = new LaserPrinter();
        System.out.println(((LaserPrinter)myPrinter).pagesPerMin);
    }
}
