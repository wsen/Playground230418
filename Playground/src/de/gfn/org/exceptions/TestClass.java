package de.gfn.org.exceptions;

import java.io.IOException;

/**
 *
 * @author wsen
 */
class PortConnector {

    //public PortConnector(int port){ //0
    //public PortConnector(int port) throws IOException { //3
    public PortConnector(int port) throws Exception { //5
        if (Math.random() > 0.5) {
            throw new IOException();
        }

        throw new RuntimeException();
    }
}


public class TestClass {

//    public static void main(String[] args) { //0
    public static void main(String[] args) throws IOException { //3
        try {
            PortConnector pc = new PortConnector(10);
        //} catch (RuntimeException re) {
        } catch (Exception re) { //5
            re.printStackTrace();
        }
    }
}
