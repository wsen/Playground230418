/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

import java.util.Date;

/**
 *
 * @author tlubowiecki
 */
public class ClassTest15 {
    
    public static void main(String[] args) {
        
        //System.out.println(new Date());
        
        System.out.printf("Das %s und %S.%n", "Peter", "Hans");
        
        System.out.printf("Das ist eine Zahl hex: %x %n", 255);
        System.out.printf("Das ist eine Zahl dec: %10d %n", 25524567);
        System.out.printf("Das ist ein char: %c %n", 255);
        System.out.printf("Das ist eine Zahl %f %n", 10.123456);
        System.out.printf("Das ist eine Zahl %.2f %n", 10.125456);
        System.out.printf("Das ist ein Datum %tD %n", new Date());
        
        System.out.format("Das ist ein Datum %tD %n", new Date());
        
    }   
}