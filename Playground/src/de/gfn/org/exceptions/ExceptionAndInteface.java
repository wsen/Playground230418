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

class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}
interface Roar {
   void roar() throws HasSoreThroatException;
}

public class ExceptionAndInteface implements Roar {
//    public void roar(){}
    public void roar() throws Exception{}
//    public void roar() throws HasSoreThroatException{}
//    public void roar() throws IllegalArgumentException{}
//    public void roar() throws TiredException{}
}
