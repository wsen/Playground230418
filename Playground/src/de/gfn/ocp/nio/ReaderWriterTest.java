/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author tlubowiecki
 */
public class ReaderWriterTest {

    public static void main(String[] args) {

//        try (BufferedWriter w = Files.newBufferedWriter(Paths.get("daten.txt"), Charset.forName("UTF-16"))) {
//            w.write("Das ist ein Ökosystem von üöß...");
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
        
        try (BufferedReader r = Files.newBufferedReader(Paths.get("daten.txt"), Charset.forName("UTF-16"))) {
            String line = null;
            
            while((line = r.readLine()) != null) {
                System.out.println(line);
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
