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
    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        int zahlenwert;
        
        try {
            System.out.print("Give a Zahl: ");
            zahlenwert = scanner.nextInt();
            
            if (zahlenwert < -10000 || zahlenwert > 10000) {
                {
                   throw new MyException("",zahlenwert);
                }
            }
        } 
        catch(InputMismatchException ex) {
            //throw MyException("Totaler Mist, kein Integer");
            System.out.println("Totaler Mist, kein Integer");
        }
        catch(MyException ex)
        {
           System.out.println("Außerhalb des Zahlenbereichs");
        }      
    }
}
