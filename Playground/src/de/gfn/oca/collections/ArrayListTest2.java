package de.gfn.oca.collections;

import java.util.ArrayList;

/**
 * Use normale Konsole zum Test
 * @author wsen
 */
public class ArrayListTest2 {

    public static void main(String[] args) {
        ArrayList a = new ArrayList(); // -- in Legacy Schreibweise, ohne generics 
        a.add("Moin");

        for (Object o : a) {
            System.out.println("o");
        }
    }
}
interface I {
    int wert = 100;
    
    static int machWas(){
        return wert;
    }
}

class AbstractZeug {
    int wert = 100;
    
    static int machWas() {
        return 1;
    }
}

//class MyClass implements I {
//    
//    //int wert = 200;
//    //static int wert = 200;
//    
//    public static void main(String[] args) {
//        System.out.println(wert);
//        System.out.println(I.machWas());
//    }
//}



class MyClass extends AbstractZeug{
    public static void main(String[] args) {
        //System.out.println(wert);
        System.out.println(I.machWas());
    }
    
    void machWasNeu() {
        System.out.println(wert);
        System.out.println(machWas());
    }
}
