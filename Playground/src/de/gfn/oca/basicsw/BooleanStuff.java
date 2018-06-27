/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basicsw;

/**
 *
 * @author student
 */
public class BooleanStuff {
    public static void main(String[] args) {
        //boolean x = true == 3; // Will not compile
        boolean xx = 5.0 != 5.001;
        System.out.println("Zuweisung eines bools: " + xx);
        
        System.out.println("--- int ---");
        int i1 = 42;
        double i2 = 42.0;
        double i3 = i1;
        System.out.println("i1 == i2: " + (i1 == i2));
        System.out.println("i3 == i1: " + (i1 == i3));
        
        System.out.println("--- String ---");
        String a1 = new String("oinky1");
        String a2 = new String("oinky1");
        String a3 = a1;
        System.out.println("a1 == a2: " + (a1 == a2));
        System.out.println("a3 == a1: " + (a1 == a3));
        boolean woar = (a1.equals(a2));
        System.out.println("woar: " + woar);
        System.out.println("-----------");
        
        System.out.println(9 / 3); // Outputs 3
        System.out.println(9 % -3); // Outputs 0

        System.out.println(10 / 3); // Outputs 3
        System.out.println(-10 % -3); // Outputs 1
        
        System.out.println("-----------");
        
        int x = 0; // you can declare a variable, such as x in this example, before the loop begins
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
        //initialization block, boolean expression, and update statements
        //can include extra variables that may not reference each other
          System.out.print(y + " ");
        }
        System.out.println("x: "+x);
        //System.out.println("y: "+y); //y out of scope

        
    }
}
