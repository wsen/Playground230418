package de.gfn.oca.aufgabenblatt4.aufgabe2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class ArrayChanger {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Wie viele Werte? ");
        
        int count = s.nextInt();
        int werte[] = new int[count];
        
        for(int i = 0; i < count; i++) {
            System.out.print("\nWert Nr. " + (i + 1) + ": ");
            werte[i] = s.nextInt();
        }
        
        System.out.println("\nSie haben folgendes Array erzeugt: " + arrayToString(werte) + "\n");
        
        System.out.println("Welche Werte wollen Sie tauschen?");
        
        int pos1 = s.nextInt() - 1;
        int pos2 = s.nextInt() - 1;
        
        swap(werte, pos1, pos2);
        
        System.out.println(arrayToString(werte));
    }
    
    public static void swap(int[] arr, int pos1, int pos2) {
        int w1 = arr[pos1];
        int w2 = arr[pos2];
        arr[pos1] = w2;
        arr[pos2] = w1;
    }
    
    // Aufgabe
    // swap die selbst Werte abfragt
    // nicht mehr draußen sondern in der Methode
    // ein einziges Object des Scanners zu nutzen, also kein neuer
    // public static void swap(int[] arr)
    
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i : arr)
            sb.append(i).append(" ");
        
        sb.append("]");
        return sb.toString();
    }
    
}
