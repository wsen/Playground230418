/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.concurrent;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class SyncCollectionsTest {
    
    public static void main(String[] args) {
        
        List<Integer> alist = Arrays.asList(1,5,7,10,22,16,3,4);
        Collection<Integer> list = Collections.synchronizedList(alist);
        
        for(int i : list) {
            System.out.println(i);
        }
    }
}
