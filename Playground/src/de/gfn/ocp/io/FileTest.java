package de.gfn.ocp.io;

import java.io.File;

/**
 *
 * @author tlubowiecki
 */
public class FileTest {
    
    public static void main(String[] args) {
        
        File dir = new File("iotest/secound");
//        if(!dir.exists()) {
//            System.out.println(dir.mkdirs());
//        }
//        
//        File file = new File(dir, "iofiletest.txt");
//        
//        if(!file.exists()) {
//            try {
//                System.out.println(file.createNewFile());
//            }
//            catch(IOException ex) {
//                System.out.println(ex);
//            }
//        }
//        
//        System.out.println("File?: " + dir.isFile());
//        System.out.println("Dir?: " + dir.isDirectory());
//        System.out.println("Absolut?: " + dir.isAbsolute());
//        
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.lastModified());
//        System.out.println(file.length());
        
        dirCheck("iotest/secound");
        
        //dir.renameTo(new File("iotest/secound"));
        
        File file = new File(dir, "iofiletest2.txt");
        file.delete();
        
        
    }
    
    public static void dirCheck(String path) {
        
        File dir = new File(path);

        if(dir.isDirectory()) {
            int filesNum = 0;
            int dirNum = 0;
            
            File file = null;
            String[] inhalt = dir.list();
            //File[] inhalt = dir.listFiles();
            
            for(String s : inhalt) {
                file = new File(path, s);
                if(file.isFile())
                    filesNum++;
                else if(file.isDirectory())
                    dirNum++;
            }
            
            System.out.println("Files: " + filesNum);
            System.out.println("Dirs: " + dirNum);
        }
        else {
            throw new IllegalArgumentException("Kein Verzeichmis!");
        }
    }
}
