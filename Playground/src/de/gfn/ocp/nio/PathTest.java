package de.gfn.ocp.nio;

import java.io.File;
import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author tlubowiecki
 */
public class PathTest {
    
    public static void main(String[] args) {
        
        Path p1 = Paths.get("xyz.txt");
        System.out.println(p1);
        
        p1 = Paths.get("abc", "cde", "xyz.txt");
        System.out.println(p1);
        
        p1 = Paths.get("abc/cde/xyz.txt");
        System.out.println(p1);
        
        p1 = Paths.get("/abc/cde/xyz.txt");
        System.out.println(p1);
        
        p1 = Paths.get("c:/abc/cde/xyz.txt");
        System.out.println(p1);
        
        p1 = Paths.get("c:\\abc\\cde\\xyz.txt");
        System.out.println(p1);
        
        p1 = Paths.get("c:", "abc", "cde", "xyz.txt");
        System.out.println(p1);
        
        p1 = Paths.get("/", "abc", "cde", "xyz.txt");
        System.out.println(p1);
        
        p1 = Paths.get(URI.create("file:///abc/cde/xyz.txt"));
        System.out.println(p1);
        System.out.println(p1.toUri());
        
        System.out.println("-------------");
        
        FileSystem fs = FileSystems.getDefault();
        p1 = fs.getPath("/", "abc", "cde", "xyz.txt");
        System.out.println(p1);
        
        System.out.println("-------------");
        
        File f = new File("/abc/cde/xyz.txt");
        p1 = f.toPath();
        System.out.println(p1);
        
        f = p1.toFile();
        System.out.println(f);
        
    }
}
