package de.gfn.ocp.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author tlubowiecki
 */
public class CopyTest {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("niotest/daten_copy.txt");
        Path p2 = Paths.get("daten.txt");
        Files.copy(p2, p1, StandardCopyOption.COPY_ATTRIBUTES);

        //Files.copy(p2, new FileOutputStream("io_copy.txt"));
        
        Path s1 = Paths.get("niotest/sub.txt");
        Path t1 = Paths.get("iotest");
        //Files.move(s1, t1.resolve(s1.getFileName()), StandardCopyOption.REPLACE_EXISTING);
        
        //Files.delete(Paths.get("io_copy.txt"));
    }

}
