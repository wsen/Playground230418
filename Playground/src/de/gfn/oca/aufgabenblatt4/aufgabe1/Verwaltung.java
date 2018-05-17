/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgabenblatt4.aufgabe1;

import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class Verwaltung {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        outer:
        while(true) {
            
            Adresse a = new Adresse();
            
            System.out.print("\nVorname: ");
            a.setVorname(scanner.next());
            
            System.out.print("Nachname: ");
            a.setNachname(scanner.next());
            
            System.out.print("Strasse: ");
            a.setStrasse(scanner.next());
            
            System.out.print("Hausnummer: ");
            a.setHausnummer(scanner.next());
            
            System.out.print("PLZ: ");
            a.setPlz(scanner.next());
            
            System.out.print("Ort: ");
            a.setOrt(scanner.next());
            
            System.out.print("Land: ");
            a.setLand(scanner.next());
            
            System.out.println("\nSie haben folgende Adresse eingegeben: ");
            System.out.println(a);
            
            while(true) {
                System.out.print("\nWollen Sie eine weitere Adresse eingeben (JA oder NEIN)? ");
                String input = scanner.next().toLowerCase();
                
                if(input.equals("nein")) {
                    System.out.println("\nSie haben " + a.getAnzahl() + " Datensätze eingegeben.");
                    break outer;
                }
                else if(input.equals("ja")) {
                    break;
                }
            }
        }
    }
    
}
