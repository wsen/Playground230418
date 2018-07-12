/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.niow;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author student
 */
public class PathMethodTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("abc", "cde", "xyz.txt");
        System.out.println(p1.getFileName());
        
        p1 = Paths.get("xyz.txt");
        System.out.println(p1.getParent());
        
        p1 = Paths.get("/", "abc", "cde", "xyz.txt");
        System.out.println(p1.getRoot());
        
        p1 = Paths.get("abc", "../", "xyz.txt");
        System.out.println(p1.normalize());
        
        p1 = Paths.get("abc", "../", "xyz.txt");
        System.out.println(p1.toAbsolutePath().normalize());
        
        p1 = Paths.get("personen.txt");
        
        try {
            System.out.println(p1.toRealPath(LinkOption.NOFOLLOW_LINKS)); //folge keine symLinks
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        
        System.out.println(p1.getName(2));
        System.out.println(p1.getNameCount());
        
        System.out.println(p1.subpath(1,2));
        System.out.println(p1.subpath(1,3));
        
        Path p2 = Paths.get("cde", "sub");
        Path p3 = Paths.get("abc", "xyz.txt");       
        System.out.println(p2.relativize(p3));
        
        Path p22 = Paths.get("/cde/sub");
        Path p33 = Paths.get("/abc/sub/xyz.txt"); //es müssen beide relativ ODER absolut sein !!    
        System.out.println(p22.relativize(p33));
        
        //Pfade verknüpfen
        Path p222 = Paths.get("/cde/sub");
        Path p333 = Paths.get("xyz.txt");     
        System.out.println(p222.resolve(p333)); //absolut u relativ werden zu einem verbunden
        
        //Pfade verknüpfen
        Path p2222 = Paths.get("/cde/sub/abc.txt");
        Path p3333 = Paths.get("abc/xyz.txt");     
        System.out.println(p2222.resolveSibling(p3333)); 
        
        Path p22222 = Paths.get("/cde/sub/sister");
        Path p33333 = Paths.get("brother/xyz.txt");     
        System.out.println(p22222.resolveSibling(p33333)); 
        
        System.out.println("--------------");
        
        p2 = FileSystems.getDefault().getPath("brother","xyz.txt");
        p3 = Paths.get("brother/xyz");
        System.out.println(p2.compareTo(p3));
        
        System.out.println(p2.startsWith("/brother/"));
        
    }
}
