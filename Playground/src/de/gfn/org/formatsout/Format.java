/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.formatsout;

import java.util.Date;

/**
 *
 * @author wsen
 */
public class Format {
    public static void main(String[] args) {
        System.out.printf("Das  %s und der große %S.%n","Peter", "Hans");
        System.out.printf("Das  eine HEx Zahl: %x.%n",255);
        System.out.printf("Das  ein char: %c.%n",255);
        System.out.printf("Das  eine Komma Zahl: %f %n",10.123456);
        System.out.printf("Das  eine Komma Zahl: %.2f %n",10.123456);
        System.out.printf("Das  ein Datum: %tD %n",new Date());
        
        System.out.format("Das  ein Datum: %tD %n",new Date());
        System.out.format("Das  ein führende Nullen Zahl: %06d %n", 808);
        System.out.format("Das  ein führende Nullen Zahl: %06d %n", 808808808);
        
        
        
    }
}
