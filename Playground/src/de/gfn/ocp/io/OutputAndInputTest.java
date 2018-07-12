package de.gfn.ocp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tlubowiecki
 */
public class OutputAndInputTest {
    
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        
        //FileWriter fw = null;
        
//        try {
//            fw = new FileWriter("iotest/secound/iofiletest.txt", true);
////            FileReader fr = new FileReader("iotest/secound/iofiletest.txt");
////            
////            int zeichen;
////            while((zeichen = fr.read()) != -1) {
////                System.out.print((char)zeichen);
////            }
//
//            fw.write("Das ist ein Haus \nvon Nikigraus");
//            //fw.flush();
//        }
//        catch(IOException ex) {
//            System.out.println(ex);
//        }
//        finally {
//            if(fw != null) {
//                try {
//                    fw.close();
//                }
//                catch(IOException ex) {
//                    System.out.println(ex);
//                }
//            }
//        }
        
        try(FileWriter fw = new FileWriter("iotest/secound/iofiletest_copy.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                FileReader fr = new FileReader("iotest/secound/iofiletest.txt");
                BufferedReader br = new BufferedReader(fr)) {
            
//            int zeichen;
//            while((zeichen = fr.read()) != -1) {
//                fw.write(zeichen);
//            }

            String zeile = null;
            while((zeile = br.readLine()) != null) {
                bw.write(zeile);
                bw.newLine();
            }
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        
        
        long end = System.currentTimeMillis();
        
        System.out.println("\n" + (end - start) + " msek");
    }
}
