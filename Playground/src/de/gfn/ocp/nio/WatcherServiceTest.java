package de.gfn.ocp.nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import static java.nio.file.StandardWatchEventKinds.*;

/**
 *
 * @author tlubowiecki
 */
public class WatcherServiceTest {
    
    public static void main(String[] args) {
        
        //Path p = Paths.get("niotest");
        Path p = Paths.get(System.getProperty("user.home"), "Desktop");
        
        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();
            //WatchService watcher = p.getFileSystem().newWatchService();
            
            WatchKey key = p.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
            
            while(true) {
                for(WatchEvent event : key.pollEvents()) {
                    Path newP = (Path) event.context();
                    System.out.println("Neu: " + newP + ", " + event.kind());
                }
            }
            
        } catch (Exception e) {
        }
        
        
    }
    
}
