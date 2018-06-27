package de.gfn.oca.basicsw;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class ArraysTest {
    
    public static void main(String[] args) {
        
        int[] zahlen = new int[10];
        zahlen[8] = 10;
        
        for(int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
        
        System.out.println("--------");
        
        int[] z1 = {5,10,20,3,7};
        
        
        int zahlen2[];
        
        String[] wörter = new String[2];
        //String[] wörter = {"Peter", "Bruce", "Clark"};
        
        for(int i = 0; i < wörter.length; i++) {
            System.out.println(wörter[i]);
        }
        
        //System.out.println(wörter);
        
        System.out.println("----- MULTI-DIM-ARRAY ------");
        
        int[] z3[] = new int[8][8];
        
        for(int i = 0; i < z3.length; i++) {
            
            for(int j = 0; j < z3[i].length; j++) {
                System.out.print(z3[i][j]);
            }
            System.out.println();
        }

        
        int i = 10;
        
        int y = i++ + i++ + i++;
        System.out.println(y);
        
        int i1;
        int i2 = i1 = 10; 
        
        System.out.println("-----------");
        
        List<String> l = Arrays.asList("Peter", "Max", "Hans");
        Iterator<String> itr = l.iterator();
        
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
    }
}