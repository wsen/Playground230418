/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.boya.ocp.accessmodif.cat;

/**
 *
 * @author wsen
 */
public class BigCat {
    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;
    
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System. out .println(cat.hasFur);
        System. out .println(cat.hasPaws);
        System. out .println(cat.id);
    }

}

