/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.randomarray;

/**
 *
 * @author wsen
 */
public class Randomarray {
    //Klassenvariablen
    private static int arr[] = new int[100]; //array field default: 0
    private static int valuecount[] = new int[10]; //array field default: 0
    
    static void NumberCount() {
        System.out.println("\n-------- Zahlenhäufigkeit: --------");

        // Zählvorgang
        int total = 0;
        for(int i=0; i<arr.length; i++) {
            valuecount[arr[i]] = valuecount[arr[i]] + 1;
            total++;
        }
        
        //Ausgabe     
        for(int i=0; i<valuecount.length; i++) {
            System.out.println("Zahl " + i + ": " + valuecount[i]);    
        }
        System.out.println("-------- total: "+ total +" --------");
    }
    
    
    public static void main(String[] args) {     
        int j = 1;
        for(int i=0; i<arr.length; i++) {
            
            int rV = (int)(Math.random() * 10); // 0 <= rV < 10
            arr[i] = rV;
            
            System.out.print(i + ": " + arr[i] + ", ");
            
            if (j == 10) {
                System.out.println();
                j = 0;
            } 
            j++;
        }
        
        NumberCount();      
    }           
}
