/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.aufgabe3.nr2;

/**
 *
 * @author student
 */
import java.util.*;

public class ProgramArgumentTest {
    public static void main(String[] args) throws MyException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        int zahlenwert;
        
        try {
            System.out.print("Give a Zahl: ");
            zahlenwert = scanner.nextInt();
            
            if (zahlenwert < -10000 || zahlenwert > 10000) {
                {
                   throw new MyException("Zu groß oder zu klein ", zahlenwert);
                }
            } else {
                throw new MyException("Tschuldigung, aber alles gut mit " + zahlenwert);
            }
        } 
        catch(InputMismatchException e) {
            String s = e.toString();
            System.out.println("Totaler Mist, kein Integer \n(" + s + ")" );
        }
        catch(MyException e) {
            String s = e.toString();
            System.out.println("(" + s + ")");
        }     
    }
}
