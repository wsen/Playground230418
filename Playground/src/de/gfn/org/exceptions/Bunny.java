/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
class NoMoreCarrotsException extends Exception {
    NoMoreCarrotsException(){
        System.out.println("ja leck mich");
    }
}

public class Bunny {

//    public static void main(String[] args) { //throws NoMoreCarrotsException {
    public void bad() { //throws NoMoreCarrotsException {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e) {// handle exception
            System.out.print("sad rabbit");
        }
    }

    //private static void eatCarrot() throws NoMoreCarrotsException {
    private static void eatCarrot() throws NoMoreCarrotsException {
        System.out.println("eatCarrot");
    }
    
    public static void main(String[] args) throws NoMoreCarrotsException {
        new Bunny().bad();//
        new NoMoreCarrotsException();
        eatCarrot();
    }
}
