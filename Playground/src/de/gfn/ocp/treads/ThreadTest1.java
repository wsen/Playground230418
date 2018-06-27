/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.treads;

/**
 *
 * @author student
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        new Thread(new Aufgabe("Peter")).start();
        (new Thread(new Aufgabe("Max"))).start();
        
//        ArrayList<String> al = new ArrayList<>();
//        
//        synchronized(this){  //eigenes Entscheiden ob synchronisiert wird 
//            al.add("moin");
//        }
//        
//        Vector // Methode von Vector
   }
}

class Aufgabe implements Runnable {

    private String name;
    
    public Aufgabe(String name){
        this.name = name;
    }
    
    @Override
    public void run() {
       for(int i=0; i<10; i++){
        System.out.println(name + ": " +i);
        
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
       }
    }
}
