/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.StringBuilderChars;

/**
 *
 * @author wsen
 */
public class Whiz {
    public static void main(String[] args) {
        char[] chars = {'1','Z','0','-','8','1'};
        StringBuilder sb = new StringBuilder();
        sb.append(chars,0,chars.length-1);
        System.out.print(sb + "\n");
        sb.append("08");
        sb.setLength(4);
        System.out.println(sb + "\n");
        sb.insert(4,"10");
        System.out.println(sb);
        sb.delete(3,sb.length()+100);
        System.out.println("-----");
        System.out.println(sb);
        
//        System.out.println("-----");
//        int x=1,y=2,z=3;
//        System.out.println((z/y+z)*2);
//        if(10 == 10.0){}

        System.out.println("------- == ---------");
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        
        StringBuilder three = one.append("a");
        one.append("z"); //also pointing to the same Scheiss
        System.out.println(one == two); // false
        System.out.println(one == three); // true
        System.out.println("one: " + one);
        System.out.println("three: " + three);
    }
}
