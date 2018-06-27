/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basics;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class DateTimeTest10 {
    
    public static void main(String[] args) {
        
//        LocalDate ld = LocalDate.of(-2123, 5, 10);
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("d M u G");
//        System.out.println(ld.format(f));

        //StaticTest.machWas();
        
        BB bb = new BB();
        //bb.name2 = "";
        
        
        machWas(new ArrayList());
        
        int i = 10;
        
        i = i++ + i++ + i++;
        
        System.out.println(i);
    }
    
    static void machWas(List l) {
        
    }
    
}

class AA {
    
    String name = "AA";
    public String name2 = "AA";
    
    void printName() {
        System.out.println(name);
    }
    
}

class BB extends AA {
    
    static String name = "BB";
    private String name2 = "BB";
    
    void printName() {
        System.out.println(super.name2);
    }
    
}


