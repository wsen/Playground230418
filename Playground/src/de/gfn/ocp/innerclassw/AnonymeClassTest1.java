/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.innerclassw;

/**
 *
 * @author student
 */
public class AnonymeClassTest1 {
    public static void main(String[] args) {
        
        //anonyme Klasse (für Erzeugung spontaner Objekte)
        //baut sofort die abstrakte Methode ein
        Abc abc1 = new Abc(){
          @Override
          void machWas() {
              System.out.println("MachWas");
          }
        };
        
         Abc abc2 = new Abc(){
          @Override
          void machWas() {
              System.out.println("MachWas...");
          }
        };
         
         abc1.machWas();
         abc2.machWas();
         
         Bcd bcd1 = new Bcd(){
             void machWasNeues(){
                 
             }
             
             void machWas(){
                 machWasNeues();
             }
         };
    }
}

abstract class Abc {
    abstract void machWas();
    
    void machWasAnderes() {
        System.out.println("Das Eine");
    }
}

class Bcd {
    
    void machWas(){
        System.out.println("Bcd WasAnderes");  
    };
    
    void machWasAnderes() {
        System.out.println("");
    }
}
