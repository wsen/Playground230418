/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author wsen
 */
public class ExceptionPassing2Method {
    public static void main(String[] args) {
        try {
            method();
        } catch (FileNotFoundException fne) {
            System.out.println("FileNotFoundException");
        } catch (IOException ioe) {
            System.out.println("IO Exception");
        }
    }
    
    public static void method() throws FileNotFoundException { //IOException {
        throw new  FileNotFoundException();
//        try{
//            return new IOException();
//        } catch (FileNotFoundException e) {
//            return new FileNotFoundException());
//        }
    }
}
