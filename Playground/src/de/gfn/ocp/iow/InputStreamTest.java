package de.gfn.ocp.iow;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author student
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException{
        try(FileInputStream fis = new FileInputStream("iotest/second/iofiletest.txt"){
            int c;
            while((c = fis.read()) != -1) {
                System.out.print((char) c);
            }
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
            
    }
}
