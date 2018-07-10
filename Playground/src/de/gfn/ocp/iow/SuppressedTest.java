/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.iow;

import java.io.IOException;

/**
 *
 * @author student
 */
public class SuppressedTest {
    public static void main(String[] args) {
        try(Sup s = new Sup()){
            throw new Exception("Anderes PRoblem");
        }
        catch(Exception ex) {
            System.out.println(ex);
            for(Throwable t : ex.getSuppressed()){
                System.out.println(t.getMessage());
            }
        }
    }
}

class Sup implements Autocloseable {
    @Override
    public void close() throws IOException {
        throw new IOException("Problem beim Close");
    }
}
