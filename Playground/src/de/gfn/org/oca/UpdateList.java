/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.oca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wsen
 */
public class UpdateList {
    public static List data = new ArrayList();
    
    static List update(String[] strs)
    {
        for(String x : strs){
            data.add(x);
        }
        return data;
    }
    
    public static void main(String[] args) {
        String[] d = {"a", "b", "c"};
        update(d); 
        for (String s : d) {
            System.out.println(s + "");
        }
        if("null" == null){
            System.out.println("OHK");
        }
    }
}
