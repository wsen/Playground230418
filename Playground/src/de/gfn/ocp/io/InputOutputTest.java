package de.gfn.ocp.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class InputOutputTest {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        try(PrintWriter pw = new PrintWriter("iotest/secound/ausgabe.txt")) {
            String input = null;

            while(true) {
                input = scanner.next();

                if(input.equalsIgnoreCase("exit"))
                    break;
                
                pw.println(input);
            }
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex);
        }
        
        System.out.println("ENDE");
    }
}
