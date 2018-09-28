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
