/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp2.xtest;

/**
 *
 * @author student
 */
public class FormattaScource {

}

public interface Fly {

    public int getWingSpan() throws Exception;
    public static final int MAX_SPEED = 100;

    public default void land() {
        System.out.println("Animal is landing");
    }

public static double calculateSpeed(float distance, double time) {
        return distance / time;
    }
}

public class Eagle implements Fly {

    public int getWingSpan() {
        return 15;
    }

    public void land() {
        System.out.println("Eagle is diving fast");
    }
}
