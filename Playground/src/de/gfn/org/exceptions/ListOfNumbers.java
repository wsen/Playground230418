/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;
// Note: This class will not compile yet.
import java.io.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author wsen
 */
public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() throws IOException {
	// The FileWriter constructor throws IOException, which must be caught.
        // PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        PrintWriter out = null;
        
        try{
            System.out.println("Entered try statement");
            out = new PrintWriter(new FileWriter("OutFile.txt"));
            for (int i = 0; i < SIZE; i++) {
                // The get(int) method throws IndexOutOfBoundsException, which must be caught.
                out.println("Value at: " + i + " = " + list.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("IndexOutOfBoundsException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }finally {
            if (out != null) { 
                System.out.println("Closing PrintWriter");
                out.close(); 
            } else { 
                System.out.println("PrintWriter not open");
            }
        
        }      
        //out.close();
    }
    
    public static void main(String[] args) {
        new ListOfNumbers().writeList();
    }
    
    /*Output after chmod u-w Playground/OutFile.txt
        Entered try statement
        Caught IOException: OutFile.txt (Permission denied)
        PrintWriter not open
    */
}
