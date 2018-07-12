/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author tlubowiecki
 */
public class PathMethodTest {
    
    public static void main(String[] args) {
        
        Path p1 = Paths.get("abc", "cde", "xyz.txt");
        System.out.println(p1.getFileName());
        
        //p1 = Paths.get("xyz.txt");
        p1 = Paths.get("/", "abc", "cde", "xyz.txt");
        System.out.println(p1.getParent());
        
        p1 = Paths.get("/", "abc", "cde", "xyz.txt");
        System.out.println(p1.getRoot());
        
        p1 = Paths.get("cde", "../xyz.txt");
        System.out.println(p1.normalize());
        
        p1 = Paths.get("cde", "../../xyz.txt");
        System.out.println(p1.toAbsolutePath().normalize());
        
        p1 = Paths.get("/", "abc", "cde", "xyz.txt");
        
        try {
            System.out.println(p1.toRealPath());
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        
        System.out.println(p1.getNameCount());
        System.out.println(p1.getName(2));
        System.out.println(p1.subpath(1,3));
        
        Path p2 = Paths.get("cde", "sub");
        Path p3 = Paths.get("abc", "xyz.txt");
        System.out.println(p2.relativize(p3));
        
        p2 = Paths.get("/cde/sub");
        p3 = Paths.get("/abc/sub/xyz.txt");
        System.out.println(p2.relativize(p3));
        
        System.out.println("---------");
        
        p2 = Paths.get("/cde/sub/sister");
        p3 = Paths.get("brother/xyz.txt");
        System.out.println(p2.resolve(p3));
        
        p2 = Paths.get("/cde/sub/sister");
        p3 = Paths.get("brother/xyz.txt");
        System.out.println(p2.resolveSibling(p3));
        
        System.out.println("-----------");
        
        p2 = FileSystems.getDefault().getPath("brother", "xyz");
        p3 = Paths.get("/brother/xyz/");
        System.out.println(p2.compareTo(p3));
        
        System.out.println(p2.startsWith("/brother/"));
    }
    
}
