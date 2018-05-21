package de.gfn.oca.lambda;

import de.gfn.oca.basics.Buch;
import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.function.Predicate;

/**
 *
 * @author Administrator
 */
public class LambdaTest {
    
    int i1 = 100;
    static int i2 = 200;
    static MyInterface i;
    
    public static void main(String[] args) {
        
        LambdaTest lt = new LambdaTest();
        
        ArrayList<String> liste = new ArrayList<>();
        //SAM
        
        int y = 20;
        
        i = (int a, String b) -> {   //My Interace - machWas
            System.out.println("Moin!..." + a);
            System.out.println(MyInterface.machWasStatic());
            //System.out.println(this);
            return;
        };
        
        i.machWas(1, "");
        //Object o = (a, b) -> System.out.print("");
        Object o = i;
        i2 = 300;
        lt.i1 = 150;
    }
}

@FunctionalInterface
interface MyInterface {

    default int machWasDefault() {
        return 44;
    }
    
    static int machWasStatic() {
        return 124;
    }
    
    void machWas(int i, String s);
}

