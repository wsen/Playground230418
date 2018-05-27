/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.loops;

/**
 *
 * @author wsen
 */
public class ForCollection {    
    public static void main(String[] args) {
        if (true) {
            System.out.println("das geht");
        } else {
            System.out.println("und das geht nicht");
        }
        
        System.out.println("\n--- switch ohne break, default bevor -----");
        int y = 5;
        System.out.println((y > 5) ? 21 : "Zebra");

        int dayOfWeek = 0;
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }

        System.out.println("\n--- foor loop vars def outside -----");
        int xx = 2220;
        long yy = 1022;
        for (yy = 0, xx = 4; xx < 5 && y < 10; xx++, yy++) { // DOES NOT COMPILE
            System.out.println(xx + " ");
        }
        
        System.out.println("\n--- for loop handling 2 iterations -----");
        int xxx = 0;
        for (long yyy = 0, z = 4; xxx < 5 && yyy < 10; xxx++, yyy++) {
            System.out.print(yyy + " ");
        }
        System.out.println(xxx);

        System.out.println("\n--- special for loop -----");
        //int xxxx = 0;
        for (long yyyy = 0, xxxx = 4; xxxx < 5 && yyyy < 10; xxxx++, yyyy++) { // DOES NOT COMPILE
            System.out.println(xxxx + " ");
        }

        java.util.List<String> values = new java.util.ArrayList<>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for (String value : values) {
            System.out.print(value + ", ");
        }
        System.out.println("\n--- aequivalent for loop -----");
        for (java.util.Iterator<String> i = values.iterator(); i.hasNext();) {
            String value = i.next();
            System.out.print(value + ", ");
        }

        String[] names = new String[3];
        //for (int name : names) { // DOES NOT COMPILE
        for (String name : names) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }
        System.out.println("\n--- special for loop -----");
        int[] walues = new int[3];
        walues[0] = 10;
        walues[1] = new Integer(5);
        walues[2] = 15;
        System.out.println("walues 1: " + walues[1]);
        for (int i = 1; i < walues.length; i++) {
            System.out.println(walues[i] - walues[i - 1]);
        }
        
        
        
        java.util.List<String> naimes = new java.util.ArrayList<>();
        naimes.add("Lisa");
        naimes.add("Kevin");
        naimes.add("Roger");
        for(int i=0; i<naimes.size(); i++) {
            String name = naimes.get(i);
            System.out.print(" (i: " + i + ")");
            if(i>0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }
    }

}
