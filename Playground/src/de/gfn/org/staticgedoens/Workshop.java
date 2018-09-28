package de.gfn.org.staticgedoens;

/**
 *
 * @author wsen
 */
class Laptop {
    String memory = "1GB";
}

public class Workshop {
    public static void main(String[] args) {
        Laptop life = new Laptop();
//        System.out.println();
                repair(life);
        System.out.println(life.memory);
    }
    
//    public static String repair(Laptop laptop) {
    public static void repair(Laptop laptop) {
        //laptop= new Laptop(); // kein neues Objekt -> nur 2GB wird neu zugwiesen
        laptop= new Laptop(); //Referenz wird neues Laptop Objekt zugewiesen, mit 2GB, aber nicht returned
        //return 
        laptop.memory = "2GB";
    }
}
