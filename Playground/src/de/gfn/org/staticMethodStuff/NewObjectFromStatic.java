/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.staticMethodStuff;

/**
 *
 * @author wsen
 */
public class NewObjectFromStatic {
    public static Integer wiggler(Integer x){
       Integer y = x + 10;
       x++;
       System.out.println(x); //6
       return y;
    }

    public static void main(String[] args){
       Integer dataWrapper = new Integer(5);
        System.out.println("dataWrapper: " + dataWrapper);
       Integer value = wiggler(dataWrapper); //15
       System.out.println(dataWrapper+value); //20
       
        System.out.println("--simple for---"); //0 1 2 3 4 5 6 7 8 9
        
        int ii;
        for(ii = 0; ii < 10; ii++) {
            System.out.print(ii + " ");
        }
       
       System.out.println("--for mit 2---");
       int i;
      int j;
      for (i = 0, j = 0 ; j < 1 ; ++j , i++){
         System.out.println( i + " " + j ); //0 0
      }
      System.out.println( i + " " + j ); // 1 1
    }
}
