package de.gfn.ocp.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author tlubowiecki
 */
public class ScannerReaderTest {
    
    public static void main(String[] args) {
        
        File file = new File("iotest/secound/iofiletest.txt");
        
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine())
                System.out.println(scanner.nextLine());
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
