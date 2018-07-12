package de.gfn.ocp.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author tlubowiecki
 */
public class InputStreamTest {
    
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        
        try(FileInputStream fis = new FileInputStream("iotest/secound/Wochenplan_KW28_2018.pdf");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("iotest/secound/Wochenplan_KW28_2018copy.pdf");
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            
            int c;
//            while((c = fis.read()) != -1) {
//                fos.write(c);
//            }
            
            while((c = bis.read()) != -1) {
                bos.write(c);
            }
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println("\n" + (end - start) + " msek");
    }
}
