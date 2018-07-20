package de.gfn.ocp.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author tlubowiecki
 */
public class GenericClassTest1 {
    
    public static void main(String[] args) {
        
//        Thing t1 = new Thing();
//        t1.setWert("Moin");
//        t1.setWert(1);
//        t1.setWert(new Object());

        Thing<String> t1 = new Thing<String>();
        //Thing<Number> t2 = new Thing<Integer>();
        Thing<Number> t2 = new Thing<>();
        
        OtherThing<int[], Void> t3 = new OtherThing<>();
        
        
        List<String> s = new ArrayList<>();
        s.add("Peter");
        s.add("Bob");
        s.add("Andrew");
        
        Object[] oa = s.toArray();
        
//        Integer[] oa1 = s.toArray(new Integer[1]);
//        
//        for(int i : oa1)
//            System.out.println(i);

    }
}

class Thing<A> {
    
    private A wert;
    
    public void setWert(A a) {
        wert = a;
    }
    
    public A getWert() {
        return wert;
    }
}

class OtherThing<A, B> {
    
    private A wert;
    private B wert2;
    
    public void setWert(A a) {
        wert = a;
    }
    
    public B getWert() {
        return wert2;
    }
    
    public <A> B getWertX() {
        return wert2;
    }
}

// new NextThing<Integer, Byte, Float, Double>();
class NextThing<I,B,F,D> extends OtherThing<List<D>, F> {
}


