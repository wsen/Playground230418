/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.lambda;

import java.util.function.Predicate;

/**
 *
 * @author student
 */
public class MyCalendar {
    public static void main(String[] args) {
        Season season1 = new Season();
        season1.name = "Spring";
    
        Season season2 = new Season();
        season2.name = "Autumn";
        
        Predicate<String> aSeason = (s) ->  s == "Summer" ? season1.name : season2.name;

        
        System.out.println(season1.name);
        System.out.println(season2.name);
        System.out.println(aSeason.test(new String("Summer")));
    
    }
    
}

class Season {
    String name;
}
