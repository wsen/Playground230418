package de.gfn.ocp.niow;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author student
 */
public class CopyTest {
    
    
    
    public static void main(String[] args) throws IOException {
        //Files copy
        Path p1 = Paths.get("niotest/abc_copy.txt");
        //Path p2 = Paths.get("iotest/iofiletest.txt");
        //Path p2 = Paths.get("iotest/abc");
        Path p2 = Paths.get("iotest/sub.txt");
        //Files.copy(p1, p2);       
        //Files.copy(p2, p1);       
//        Files.copy(p2, newFileOutputStream("io_copy.txt")); 

        //Files move
        Path s1 = Paths.get("niotest/sub.txt");
        Path t1 = Paths.get("iostest");
        //Files.move(s1, t1.resolve(s1.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        
        //Files löschen
        Files.delete(Paths.get("io_copy.txt"));
    }
        
}
