/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.stringbuilder;

/**
 *
 * @author wsen
 */
public class Blooper {
    public static void main(String[] args) {
    String s = "blooper";
    StringBuilder sb = new StringBuilder(s);
    sb.append(s.substring(4));//.delete(3, 5);
    System.out.println(sb);
    }
}
