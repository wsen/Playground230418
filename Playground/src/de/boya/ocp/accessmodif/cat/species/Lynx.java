/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.boya.ocp.accessmodif.cat.species;

import de.boya.ocp.accessmodif.cat.BigCat;

/**
 *
 * @author wsen
 */
public class Lynx extends BigCat {
    public static void main(String[] args) {
        
        Lynx lcat = new Lynx();
        System.out.println(lcat.name);
        System. out .println(lcat.hasFur);
        System. out .println(lcat.hasPaws);
        System. out .println(lcat.id);
    }
}
