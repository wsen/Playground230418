/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.cucurcucu;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author wsen
 */
//                        USELESS extends: import java.util.Date still needed 
public class QualifiedName extends java.util.Date{
    public static void main(String[] args) {
        
        LocalDate d1 = LocalDate.of(1922, 2, 20);
        //LocalDate d2 = LocalDate.of(2000, Month.AUGUST, 10);
        
        //d1 = d1.plusDays(10);
        //d1 = d1.minusDays(10);
        d1 = d1.minus(10, ChronoUnit.DAYS);
        
        System.out.println(d1);
        
        System.out.println("----------------");
        
        LocalTime t1 = LocalTime.of(12, 59);
        t1 = t1.plus(5, ChronoUnit.HOURS);
        
        System.out.println(t1);
        
        System.out.println("-----------------");
        
        LocalDateTime dt1 = LocalDateTime.of(d1, t1);
        System.out.println(dt1);
        
        System.out.println(d1.toEpochDay());
        System.out.println(t1.toSecondOfDay());
        System.out.println(dt1.toEpochSecond(ZoneOffset.UTC));
        
        System.out.println("----------------");
        
//        ZoneId.getAvailableZoneIds().forEach(e -> System.out.println(e));
        
//        System.out.println("----------------");
//        
//        ZoneId.getAvailableZoneIds().forEach(System.out::println);

        LocalDate end = LocalDate.now();
        Period p = Period.between(d1, end);
        p = p.plusDays(10);
        System.out.println(p);
        
        d1 = d1.plus(p);
        System.out.println(d1);
        
        System.out.println("---------------");
        
        LocalTime t2 = LocalTime.of(22, 27);
        Duration d = Duration.between(t1, t2);
        d = d.minus(5, ChronoUnit.HALF_DAYS);
        System.out.println(d);
        
        System.out.println("---------------");
        
        Instant s = Instant.now();
        
        int i = 0;
        while(i < 100) {
            System.out.println(i++);
            
        }
        
        Instant e = Instant.now();
        
        System.out.println(Duration.between(s, e));
        
        //Clock c = Clock.systemUTC();
        
        LocalDate d5 = LocalDate.of(2018, Month.OCTOBER, 28);
        LocalTime t5 = LocalTime.of(2, 0);
        ZoneId z = ZoneId.of("Europe/Berlin");
        ZonedDateTime zdt = ZonedDateTime.of(d5, t5, z);
        System.out.println(zdt);
        zdt = zdt.plusHours(2);
        System.out.println(zdt);
        
        Date d6 = new Date();
        System.out.println(d6);
        
        DateTimeFormatter f1 = DateTimeFormatter.ISO_DATE;
        f1 = DateTimeFormatter.ofPattern("EEEEE dd. MMM yyyy");
        LocalDate date = LocalDate.now();
        //date = LocalDate.parse("20.05.17", f1);
        System.out.println(date);
        System.out.println(date.format(f1));
        
        DateTimeFormatter f2 = DateTimeFormatter.ISO_TIME;
        f2 = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time = LocalTime.now();
        //time = LocalTime.parse("17:22", f2);
        System.out.println(time);
        System.out.println(time.format(f2));
    }
}
