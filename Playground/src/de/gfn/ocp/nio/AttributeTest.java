/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;

/**
 *
 * @author tlubowiecki
 */
public class AttributeTest {
    
    public static void main(String[] args) throws IOException {
        
        Path p = Paths.get("link");
        
        System.out.println(Files.isSymbolicLink(p));
        System.out.println(Files.isDirectory(p));
        System.out.println(Files.isRegularFile(p));
        
        System.out.println("Size: " + Files.size(p));
        System.out.println("E:" + Files.isExecutable(p));
        System.out.println("R:" + Files.isReadable(p));
        System.out.println("W:" + Files.isWritable(p));
        System.out.println("MD:" + Files.getLastModifiedTime(p));
        System.out.println("O:" + Files.getOwner(p));
        Files.setLastModifiedTime(p, FileTime.fromMillis(System.currentTimeMillis()));
        System.out.println("MD:" + Files.getLastModifiedTime(p));
        
        //UserPrincipal owner = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("guest");
        //Files.setOwner(p, owner);
        //System.out.println("O:" + Files.getOwner(p));
        
        BasicFileAttributes attr = Files.readAttributes(p, BasicFileAttributes.class);
        System.out.println(attr.fileKey());
        
        PosixFileAttributes attrMac = Files.readAttributes(p, PosixFileAttributes.class);
        System.out.println(attrMac.owner());
        
        DosFileAttributes attrDos = Files.readAttributes(p, DosFileAttributes.class);
        System.out.println(attrDos.isArchive());
        
//        BasicFileAttributeView view = Files.getFileAttributeView(p, BasicFileAttributeView.class);
//        view.readAttributes()
        
    }
    
    
}