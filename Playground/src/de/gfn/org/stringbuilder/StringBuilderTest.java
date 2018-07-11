/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.stringbuilder;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(15);
        //sb.setLength(10);
        //sb.setLength(10);
        System.out.println(sb.length());
    }
    
    ArrayList<String> al = new ArrayList<>();
}
