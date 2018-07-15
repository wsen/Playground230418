package de.gfn.org.interfaceabstracthiding;

/**
 *
 * @author wsen
 */
interface Pow {
    static void wow(){ 
        System.out.println("In Pow.wow");    
    }
}

interface Fau {
    
}

abstract class Wow extends Powwow implements Fau { //LEGGOMIO
   
   static void wow(){
       System.out.println("In Wow.wow");    
  }    
}

//public class Powwow extends Wow implements Pow {
//    public static void main(String[] args) {
//        Powwow f = new Powwow();
//        f.wow();
//    }
//}

public class Powwow {
    static void wow(){
        System.out.println("in Powwow");
    }
    
    public static void main(String[] args) {
        Powwow echtwow = new Powwow();
        echtwow.wow();
        Wow.wow();
    }
}
