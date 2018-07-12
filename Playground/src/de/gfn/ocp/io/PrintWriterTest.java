package de.gfn.ocp.io;

import java.io.PrintWriter;
import java.util.Date;

/**
 *
 * @author tlubowiecki
 */
public class PrintWriterTest {
    
    public static void main(String[] args) {
        
        try(PrintWriter pw = new PrintWriter("daten.txt")) {
            
            pw.println("Hallo Welt");
            pw.printf("%tF %n", new Date());
            pw.printf("%.2f", 1.2467);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
