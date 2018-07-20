package de.gfn.ocp.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class GenericTest2 {
    
    public static void main(String[] args) {
        
        //LittleThing<Integer> lt1 = new LittleThing<>();
        
        List<String> ls = new ArrayList<>();
        
        List<? super Number> l1 = new ArrayList<>();
        //l1.add("Hallo Welt");
        
        List<? extends Runnable> l2 = new ArrayList<>();
        l2 = new ArrayList<Runnable>();
        l2 = new ArrayList<Thread>();
        
        List<? super String> l3 = new ArrayList<>();
        
        LittleThing<String> lt3 = new LittleThing<>(1);
        
        List ls5 = new ArrayList();
        ls5.add(1);
        ls5.add(new Object());
        
        List<String> nls5 = (List<String>)ls5;
        
        List ls6 = nls5;
        System.out.println(ls6);
        
        
        List<String> ls7 = new ArrayList<String>();
        
        ls7.add("Moin");
        ls7.add("Hamburg");
        List<?> ls8 = ls7;
        
        String s = (String)ls8.get(1);
        System.out.println(s);
                
        List<?> w = new ArrayList<>();
        Object o = w.get(1);
    }
}

class LittleThing<T extends CharSequence> {

    public <S> LittleThing(S s) {
    }
    
    private void machWas(T t) {
    }
    
    // String
    public static <T> void machWasAnderes(List<T> l) {
    }
}
