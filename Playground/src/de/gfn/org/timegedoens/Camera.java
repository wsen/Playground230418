/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.timegedoens;
import java.time.*;

/**
 * ZV: 
 * @author student
 */
public class Camera {

    public static void main(String[] args) {
        //int hours; //Compilation error: variable hours might not have been initialized
        int hours = 1;
        LocalDateTime now = LocalDateTime.of(2020, 10, 01, 0, 0);
        //                                 now:2020-10-01T0 0:00
        LocalDate before = now.toLocalDate().minusDays(1); 
        //        before: 2020-09-30           
        LocalTime after = now.toLocalTime().plusHours(1);
        //        after: 01:00
        
        // System.out.println("before.isBefore(now): " + before.isBefore(after));
        System.out.println("now.isBefore(now): " + now.isBefore(now));
        
        //while (before.isBefore(after) && hours < 4) { //einfach nur irgendwas ...
        while (now.isBefore(now) && hours < 4) { 
            ++hours;
        }
        System.out.println("now:" + now + " before:" + before + " after:" + after + " HOURS: " + hours);
        // now:2020-10-01T0 0:00 before:2020-09-30 after:01:00HOURS: 1
    }
}
