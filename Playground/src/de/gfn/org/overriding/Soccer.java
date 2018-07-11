/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.overriding;

/**
 *
 * @author wsen
 */
class Game{
  public void play() throws Exception{
    System.out.println("Playing...");
  }
}

public class Soccer extends Game{
   public void play(){
      System.out.println("Playing Soccer...");      
   }
   public static void main(String[] args){       
       
       Game g = new Soccer();
       //g.play();
       
       System.out.println("----valid numbers----");
            char c = 320;
            float f = 320;
            double d = 320;
            //byte b = 320;
            float fg = 22.0f/7.0f;
       
        System.out.println("----date----");
        java.time.LocalDate dt = java.time.LocalDate.parse("2015-01-01").minusMonths(1).minusDays(1).plusYears(1);
        System.out.println(dt);//2014-11-30

   }
}
