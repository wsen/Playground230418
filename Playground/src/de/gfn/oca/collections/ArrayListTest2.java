package de.gfn.oca.collections;

import java.util.ArrayList;

/**
 *
 * @author tlubowiecki
 */
public class ArrayListTest2 {
    
    public static void main(String[] args) {
        
        ArrayList a = new ArrayList();
        a.add("Moin");
        a.add(1);
        
        for(Object o : a) {
            System.out.println(o);
        }
        
    }
}
