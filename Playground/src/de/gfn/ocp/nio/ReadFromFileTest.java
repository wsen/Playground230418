/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.nio;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class ReadFromFileTest {
    
    public static void main(String[] args) {
        
        Path p = Paths.get("daten.txt");
        
        try {
            List<String> lines = Files.readAllLines(p, Charset.forName("UTF-16"));
            
            for(String line : lines) {
                System.out.println(line);
            }       
        } catch (Exception e) {
        }
        
        
    }
    
}
