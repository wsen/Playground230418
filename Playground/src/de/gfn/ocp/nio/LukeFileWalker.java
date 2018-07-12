package de.gfn.ocp.nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author tlubowiecki
 */
public class LukeFileWalker {
    
    public static void main(String[] args) {
        
        Path p = Paths.get("iotest");
        
        try {
            Files.walk(p)
            .filter(e -> e.toString().endsWith(".txt"));
            //.forEach(System.out::println);
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        try {
            Stream<Path> stream = Files.find(p, Integer.MAX_VALUE, 
                    (path, attr) -> path.toString().endsWith(".txt") && 
                            attr.lastModifiedTime().toMillis() > (System.currentTimeMillis() - 3600000));
                    
           stream.forEach(System.out::println);
            
            
        } catch (Exception e) {
            System.out.println(e);
        }

        
    }
}
