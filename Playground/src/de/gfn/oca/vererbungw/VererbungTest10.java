/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.vererbungw;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 *
 * @author tlubowiecki
 */
public class VererbungTest10 {
    
    static Integer i;
    
    public static void main(String[] args) {
        
        System.out.println(new Object[10]);
        
        System.out.println("--------");
        
        System.out.println(new int[10]);
        
        System.out.println(Arrays.asList(1,2,3));
        
        Double d = 10.5;
        System.out.println(d/0);
        
        byte b = 1;
        short s = (short)(machWas() + b);
        
        String str;
        
        boolean bool = true;
        
        if(bool = true)
            str = "";
        
        //System.out.println(str);
        
        Period p = Period.of(0,24,10);
        System.out.println(p);
        
        LocalDate date = LocalDate.of(2001,11,11);
        
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("d/MMMM/y");
        System.out.println(date.format(formater));
        
    }
    
    static byte machWas() {
        return 127;
    }
}
