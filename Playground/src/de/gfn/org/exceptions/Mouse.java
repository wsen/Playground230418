/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.exceptions;

/**
 *
 * @author wsen
 */
public class Mouse {
    public String name;
    public void run() {
       System.out.print("1");
//          try {
//             System.out.print("2");
//             name.toString();
//             System.out.print("3");
//          } catch (NullPointerException e) {
//           System.out.print("4");
//            throw e;
//         }
         System.out.print("5");
    }
 public static void main(String[] args) {
    Mouse jerry = new Mouse();
     System.out.println("Je suis le mouse y moi s'appele: " + jerry.name);
    jerry.run();
    System.out.print("6");
    }
}
