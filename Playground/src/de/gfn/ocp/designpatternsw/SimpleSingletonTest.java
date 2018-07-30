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
        LazySingleton s1 = LazySingleton.getInstance(); //
        EagerSingleton e1 = EagerSingleton.getInstance(); //
        EnumSingleton es1 = EnumSingleton.INSTANCE; //
        es1.machWas();
        System.out.println(EnumSingleton.i);
        System.out.println(es1.i);
    }
}

// LAZY Variante (OPTiONALER Ansatz) - wird nur dann erzeugt, wenn es nötig ist 
class LazySingleton {
    
    private static LazySingleton instance; //Wert in eigenen Speichert, // Thread auch 
    // Zustände werde untereinander nicht synchronisiert //--> Prüfung auf null
    
    private LazySingleton(){ //nicht direkt den KOnstruktor aufrufen, sondern über (get) Methode
    }
    
    //public static synchronized LazySingleton getInstance() { //synchronized -> Threads oder drinnen
    public static LazySingleton getInstance() { //synchronized -> Threads
        if(instance == null) { //Ausschließen dass von dem Singleton 2 Objekte gebaut werden
            //T2 //Instance OK? //Thread hat Kopie eines Zustandes im Speichers, dies bedeuted aber nicht dass,
            //T1 //Instance OK? //dieser mit dem des 2. synchronisiert wird.
            synchronized(LazySingleton.class){
                if(instance == null) {  // kann immer nur    von einem Thread druchalaufen werden
                    instance = new LazySingleton(); //LazySingleton als private Methode hier aufrufbar. Außerhalb nicht       
                } //Doppplchecking Blocking
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

//Enum Variante des Singleton
enum EnumSingleton {
  
    INSTANCE;  //Erweiterung und Instanzierung der Klasse
    
    //vls weise
    //final static EnumSingleton INSTANCE = new EnumSingleton(){}
    
//    INSTANCE {
//        public int i =10;
//    };
    
    //KOnstruktor
    // EnumSingleton () {}
    
    public static int i = 10;
    
    public void machWas() {
        
    }
}

