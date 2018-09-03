/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class ExceptionTest2 {
    public static void main(String[] args) {
        int ax=10, az = 30;
        int aw = 1, ay = 1;
        try {
            aw = ax % 2;
            ay = az / aw;
        } catch (ArithmeticException e1) {
            System.out.println("aw catch " + aw);
            aw = 123;
            System.out.println("Invalid Divisor");
        } catch (Exception e2) {
            aw = 1;
            System.out.println("Divisor Changed");
        }
        System.out.println("aw: " + aw);
        ay = az / aw;
        System.out.println("Successful Division " + ay);
    }
}
