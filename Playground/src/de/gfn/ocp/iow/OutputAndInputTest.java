/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.iow;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author student
 */
public class OutputAndInputTest {
    
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();
        
        FileWriter fw=null; //nix helfe. Nö -> NullPointerException
        
        try {
            fw = new FileWriter("iotest/second/iofiletest.txt");
            //AutoCloseable
            //FileReader fr = new FileReader("iotest/second/iofiletest.txt");
            
            int zeichen;
        
//            while((zeichen = fw.read()) != -1) {
//                System.out.println((char)zeichen);
//            }
            
            fw.write("Das ist ein Haus von Nikigraus");
            // fw.flush();
            //oder mit implizieten flush vorher schließen
            fw.close();
            
        }
        catch(IOException ex) {
            System.out.println(ex);
        }
        finally {
            if(fw != null){
                try {
                    fw.close();
                }
                catch(IOException ex) {
                    System.out.println(ex);
                }
            }
            
        }
        
        try(FileWriter fw2 = new FileWriter("iotest/second/iofiletest.txt", true) ){
            //fw2.write(".. schon wieder ein haus von Nikigraus");
            //fw2.write("MOIN MOIN", 5, 2);
            fw2.write(165);
            //fw2.close();
            
            //throw new Exception("Hallo Fehler");
        }
        catch(IOException ex) {
            //ex.getSuppressed();
            System.out.println(ex);
        }
        
        
        long end = System.currentTimeMillis();
        
        System.out.println("\n" + (end -start) + " msek");
    }
    
}
