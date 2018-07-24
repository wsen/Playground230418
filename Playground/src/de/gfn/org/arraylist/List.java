/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.arraylist;

/**
 *
 * @author wsen
 */
public class List {
    public static void main(String[] args) {
        double daaa[][][] = new double[3][][];
        double d = 100.0;
        double[][] daa = new double[1][1];
        //daaa[0] = d;
        daaa[0] = daa;
        //daaa[0] = daa[0];
//        daa[1][1] = d;
//        daa = daaa[0];
        
//           System.out.println(null); //1
//   System.ouxs Pt.println(true); //2
//   System.out.println(true + true); //2
//   System.out.println(null + null); //3

int i = 0, j = 5;
    lab1 : for( ; ; i++){
      for( ; ; --j)  if( i >j ) break lab1;
    }
    System.out.println(" i = "+i+", j = "+j);
    }
    
    String s = new String("java");
     //StringBuilder s = new StringBuilder("java");

     s = s.replace('j', 'l');
}
