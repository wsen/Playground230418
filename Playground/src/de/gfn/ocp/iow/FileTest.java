/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.iow;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author student
 */
public class FileTest {
    public static void main(String[] args) {
        
        //File dir = new File("iotest/first"); 
        File dir = new File("iotest/second"); 
        boolean ok = false;
        
        //Neues Verzeichnis erstellen. Zuvor, Check ob schon vorhanden
        //System.out.println(dir.exists());
        
        if(!dir.exists()){
//            ok = dir.mkdirs();
//            System.out.println(dir.mkdirs());
        }
        
        
        
//        File file  = new File(dir, "iofiletest2.txt");
//        
//        if(!file.exists()) {
//            try {
//            System.out.println(file.createNewFile());
//            }
//            catch(IOException ex) {
//                System.out.println(ex);
//            }
//        }
//        
//        System.out.println("FIle?: " + dir.isFile());
//        System.out.println("Dir?: " + dir.isDirectory());
//        System.out.println("Absolut?: " + dir.isAbsolute());
//        
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.lastModified()); //Millisecond
//        System.out.println(file.length()); //Größe in Bytes
        
        dirCheck("iotest/second");
        dir.renameTo(new File("iostest/second"));
        dir.delete();
        
        File file = new File(dir, "iofieltest2.txt");
        file.delete();
    }
    
    public static void dirCheck(String[] args) {
        File dir = new File(path);
        
        if(dir.isDirectory()){
            int filesNum = 0;
            int dirNum = 0;
            
            File file = null;
            String[] inhalt = dir.list();
            //String[] inhalt = dir.listFiles();
            // FileFilter
            
            for(String s : inhalt) {
                file = new File(s);
                //file = new File(path, s);
                if(file.isFile())
                    filesNum++;
                else if(file.isDirectory())
                    dirNum++;
            }
            System.out.println("Files: " +filesNum);
            System.out.println("Dirs: " +dirNum);
        } 
        else {
            throw new IllegalArgumentException("Kein Verzeichnis!");
        }
        
    }
}
