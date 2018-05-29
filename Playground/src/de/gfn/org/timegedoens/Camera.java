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
        int hours = 1;
        LocalDateTime now = LocalDateTime.of(2020, 10, 01, 0, 0);
        LocalDate before = now.toLocalDate().minusDays(1);
        LocalTime after = now.toLocalTime().plusHours(1);
        //while (before.isBefore(after) && hours < 4) { //einfach nur irgendwas ...
        while (now.isBefore(now) && hours < 4) { 
            ++hours;
        }
        System.out.println("now:" + now + " before:" + before + " after:" + after + "HOURS: " + hours);
    }
}
