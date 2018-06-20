/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.test2.interfaze;

/**
 *
 * @author wsen
 */
public class Animal implements Walk {

//    @Override
//    public int getSpeed() {
//        return 150;
//    }

    public static void main(String[] args) {
        Animal an = new Animal();
        System.out.println(an.getSpeed());
        
        System.out.println("---------");
        String s = "purr";
 s.toUpperCase();
 s.trim();
 s.substring(1, 3);
 s += " two";
 System.out.println(s.length());
    }
}
