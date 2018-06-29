/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.enums;

/**
 *
 * @author tlubowiecki
 */
public class EnumTest {
    
    public static void main(String[] args) {
        
        Wochentag w;
        
        w = Wochentag.MI;
        
        System.out.println(w.getDayOfWeekNum());
        
        Wochentag.DI.machWas();
        Wochentag.machWas();
        
        System.out.println(Wochentag.DI);
        System.out.println(Wochentag.MO);
        System.out.println(Wochentag.MO.name());
        
//        System.out.println(w);
//        
//        w = Wochentag.valueOf("MI");
//        
//        System.out.println("--------");
//        
        for(Wochentag w2 : Wochentag.values())
            System.out.println(w2);
        
        switch(w) {
            
            case MO: System.out.println("....");
            case DI: System.out.println("....");
            default:
            
        }
    }
}

enum Wochentag {
    
    MO(1) {
        @Override
        public String toString() {
            return "Furchtbar...." + getDayOfWeekNum();
        }
    }, DI(2), MI(3), DO(4), FR(5), SA(6), SO(7);
    
    private final int dayOfWeekNum;

    private Wochentag(int i) {
        dayOfWeekNum = i;
    }

    public int getDayOfWeekNum() {
        return dayOfWeekNum;
    }
    
    public static void machWas() {
    }
}