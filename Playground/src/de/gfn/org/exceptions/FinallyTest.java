package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
public class FinallyTest{
   public static void main(String args[]){
      try{
          if (args.length == 0) return;
          else throw new Exception("Some Exception");
      }
      catch(Exception e){
          System.out.println("Exception in Main");
      }
      finally{
          System.out.println("The end");
      }
   }
}
