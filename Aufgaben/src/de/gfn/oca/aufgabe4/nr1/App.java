/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgabe4.nr1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class App {
    private List<Heinzi> heinzis = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        App app = new App();
        boolean exit = false;
        
        //TODO: Heinzis Adressen Zeile für Zeile eingeben
        while(!exit) {
            
            switch(scanner.next()) {
                
                case "N": System.out.println("New Heinzi"); 
                    
                case "X": System.out.println("Exit");
                    exit = true;
                    break;
            }
            String firstname = scanner.next();
            String lastname = scanner.next();
            
//            if(firstname.equalsIgnoreCase("exit"))
//                break;
//            
            Heinzi s = new Heinzi(firstname, lastname);
            app.heinzis.add(s);
            System.out.println(s);
            
        }
    }
         
}
