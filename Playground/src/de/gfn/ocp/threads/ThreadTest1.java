/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.threads;

import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tlubowiecki
 */
public class ThreadTest1 {
    
    public static void main(String[] args) {
        
        new Thread(new Aufgabe("Peter")).start();
        new Thread(new Aufgabe("Max")).start();
    }
}

class Aufgabe implements Runnable {

    private String name;

    public Aufgabe(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
        
        for(int i = 0; i < 1000; i++) {
            System.out.println(name + ": " + i);
            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
    }
}
