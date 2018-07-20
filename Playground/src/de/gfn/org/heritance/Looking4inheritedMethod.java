/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.heritance;

/**
 *
 * @author student
 */
class Game {
   
 int a;    //  (1)
// static int a;    //  (2)
// int f( )   { return a; }    //  (3)
// static int f( ) { return a; }    //  (4) 
    
    
  public void play() throws Exception   {
    System.out.println("Playing...");
  }
}

class Soccer extends Game {
   public void play(String ball)    {
      System.out.println("Playing Soccer with "+ball);      
   }
}

public class Looking4inheritedMethod {
   public static void main(String[] args) throws Exception  {
       Game g = new Soccer();
       // 1
       Soccer s = (Soccer) g;
       // 2
   }
}

