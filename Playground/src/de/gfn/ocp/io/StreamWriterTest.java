package de.gfn.ocp.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author tlubowiecki
 */
public class StreamWriterTest {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        try(
            InputStream is = new FileInputStream("iotest/secound/iofiletest.txt");
            Reader r = new InputStreamReader(is, "UTF-8")) {
            
            System.out.println((char)r.read());
            
        } catch (Exception e) {
        }
    }
}
