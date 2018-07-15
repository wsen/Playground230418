/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author wsen
 */
public class DateTimeTest {
    public static void main(String[] args) {
        
//        LocalDate date = LocalDate.of(2010, Month.JANUARY, 20);
//        LocalTime time = LocalTime.of(11, 12, 34);
//        LocalDateTime dateTime = LocalDateTime.of(date, time);
//
//        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//
//        System.out.println(shortDateTime.format(dateTime)); System.out.println(shortDateTime.format(date)); 
//        System.out.println(shortDateTime.format(time));
        
        System.out.println("------");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate däit = LocalDate.parse("01 02 2015", f);
        
        System.out.println("f: " + f);
        System.out.println("däit: " + däit);
        
        
        
    }
}
