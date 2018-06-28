/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.designpatternsw;

/**
 *
 * @author student
 */
public class SimpleSingletonTest {
    public static void main(String[] args) {
        LazySingleton s1 = LazySingleton().getInstance(); //
    }
}

// LAZY Variante (OPTiONALER Ansatz) - wird nur dann erzeugt, wenn es nötig ist 
class LazySingleton {
    
    private static LazySingleton instance;
    
    private LazySingleton(){ //nicht direkt den KOnstruktor aufrufen, sondern über (get) Methode
    }
    
    //public static synchronized LazySingleton getInstance() { //synchronized -> Threads oder drinnen
    public static LazySingleton getInstance() { //synchronized -> Threads
        if(instance == null) {
            synchronized(LazySingleton.class){
               instance = new LazySingleton(); //LazySingleton als private Methode hier aufrufbar. Außerhalb nicht
            }
        }
        return instance;
    }
}

// Default Ansatz - entstehen sofort Kosten fürs Pferd (Ponnyhof) 
class EagerSingleton {
    
    private static EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton(){ //nicht direkt den KOnstruktor aufrufen, sondern über (get) Methode
    }
    
    public static EagerSingleton getInstance() {
        return instance;
    }
}


