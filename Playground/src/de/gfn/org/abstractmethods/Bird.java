/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.abstractmethods;

/**
 *
 * @author wsen
 */

public abstract class Bird {
    private void fly() { System.out.println("Bird is flying"); }
    public abstract void Sturz();
    public static void main(String[] args) {
       Bird bird = new Pelican();
       bird.fly();
       bird.Sturz();
       Pelican perlican = new Pelican();
       perlican.fly();
       
        System.out.println("----");
        String blank  = " ";  // one space
      String line = blank + "hello" + blank + blank;
      line.concat("world");
      String newLine  =  line.trim();
      System.out.println((int)(line.length() + newLine.length()));
      
        System.out.println("------------");
          int i = 1234567890;
     float f = i;
     System.out.println("i: " +i + "f: " + f + "\n(i-f: ): ");// + (i - (int))(f);
        System.out.print(i -(int)f);
    }
 }

class Pelican extends Bird{
    protected void fly() { System.out.println("Pelican is flying"); }
    public void Sturz(){
        System.out.println("BoaH, ja Mai, etzt bin i eben glei grad gestürzt");
    }
}
