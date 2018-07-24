/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.forifcontinue;

/**
 *
 * @author wsen
 */
public class ForIfContinue {
    public static void main(String[] args) {

     String String = "";   //This is valid.
     String : 
     for(int i = 0; i< 10; i++) //This is valid too!
     {
        for (int j = 0; j< 10; j++){
             if ( i+ j > 10 )  break String;
             System.out.println("i: " + i + " j: " + j);
        }
       System.out.println( "hello");
     }

        
//--        
//Loop1: for(int x=0;x<5;x++){
//            //if(y==3) break Loop1;
//            for(int y=0; y<3;y++){
//                //if(y==2)continue Loop1;
//                if(y==2) break Loop1;
//                  System.out.print(y);
//            }
//        }

//--          for(int x=10; x>5; x++){
//              if(x==16) x-=12; //Endlos Loop mit x-=11
//              System.out.println(x + ""); //10 11 12 13 14 15 4
//          }

//--        double[]dlbs = {1,1.5,2.0,7};       //Alle Elemete des Arrays ausgeben
//        for(double d : dlbs){System.out.println(d);}
        
//--dnc        do{
//            int i = 3;
//            System.out.println(i++);
//        } while (i <=6);
        
    }
//--    public static void main(String[] args) {
//        int[]a = {1,2,3,4};
//        
//        for(int j : a){
//            if(j==2)continue; // 123123123
//            //if(j==2) //123
//                for(int x=0; x<3;System.out.print(x)){x++;}
//        }
//    }
   
}
