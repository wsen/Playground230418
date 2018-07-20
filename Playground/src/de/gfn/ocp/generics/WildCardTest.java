package de.gfn.ocp.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 *
 * @author tlubowiecki
 */
public class WildCardTest {
    
    public static void main(String[] args) {
        
        List<Long> l1 = new ArrayList<>();
        l1.add(1l);
        l1.add(2l);
        l1.add(3l);
        
        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(2);
        l2.add(1);
        
        System.out.println(vergleicheSummen1(l1, l2));
    }
    
    public static boolean vergleicheSummen1(List<? extends Number> l1, List<? extends Number> l2) {
        
        return (summieren(l1) == summieren(l2));
    }
    
    
//    public static <? extends Number & Serializable> boolean vergleicheSummen1(List<T> l1, List<T> l2) {
//        return (summieren(l1) == summieren(l2));
//    }
    
    public static double summieren(List<? extends Number> l) {
        
        double sum = 0;
        for(int i = 0; i < l.size(); i++)
            sum += l.get(i).doubleValue();
        
        return sum;
    }
    
//    public static <T extends Number> double summieren(List<T> l) {
//        
//        double sum = 0;
//        for(int i = 0; i < l.size(); i++)
//            sum += l.get(i).doubleValue();
//        
//        return sum;
//    }
}
