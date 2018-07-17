/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.switchi;

/**
 *
 * @author wsen
 */
public class SwitchTest {
    public static void main(String[] args) {
        //int condition; //=2;
        //int condition = 2; //ok
        //long condition = 2;
        //Integer condition = new Integer("1"); //ok
        //String condition = "1";
        Byte condition = 1;




        switch( condition ){
            case 1  : System.out.println("1");   break;
            case 2  : System.out.println("2");   break;
            case 3 : System.out.println("3");  break;
        }
        
        String[][][] arr  ={{ { "a", "b" , "c"}, { "d", "e", null } },
            { {"x"}, null },
            {{"y"}},
            { { "z","p"}, {} }
      };
      System.out.println(arr[1][1]);
    }
}
