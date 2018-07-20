package de.gfn.org.exceptions;

/**
 *
 * @author student
 */
public class CallArrayWithExceptionIndex {
    public static void main(String[] args){
      int[][] a = { { 00, 01 }, { 10, 11 } };
      int i = 99;
      //private final int b = 0;

      try {
         a[val()][i = 1]++;
      } catch (Exception e) {
         System.out.println( i+", "+a[1][1]);
      }
   }
   static int val() throws Exception {  
     throw new Exception("unimplemented");  //wird nicht gethrowed sondern gecatched im caller
   }
}
