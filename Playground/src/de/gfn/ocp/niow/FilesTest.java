package de.gfn.ocp.niow;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author student
 */
public class FilesTest {


    //public static void main(String[] args) throws IOException {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("niotest/sub/test.txt");
        Path p2 = Paths.get("niotest/sub/testx.txt");
 
        System.out.println(Files.isSameFile(p, p2));
        
        try{
            if(!Files.notExists(p.getParent()))
                Files.createDirectories(p.getParent());
            
            if(!Files.exists(p))
                Files.createFile(p);
            
            try(PrintWriter pw = new PrintWriter(new FileWriter(p.toFile()))) {
                pw.println("Hallo Welt");
            }
        }catch (IOException ex) {
            System.out.println(ex);
        }
//        finally {
//
//        }
    }
    
    
    
}
