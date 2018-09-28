package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
public class ExceptionInInitializerErr {
  static int[] x = new int[0];
  static{
   x[0] = 10;
  }
  public static void main(String[] args){
    ExceptionInInitializerErr ax = new ExceptionInInitializerErr();
  }
}
