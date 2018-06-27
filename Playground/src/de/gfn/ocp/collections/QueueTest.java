/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author tlubowiecki
 */
public class QueueTest {
    
    public static void main(String[] args) {
        
        Queue<String> q1 = new LinkedList<>();
        
        // FIFO
        q1.add("a");
        q1.offer("b");
        q1.offer("c");
        q1.offer("e");
        
        while(!q1.isEmpty())
            System.out.println(q1.poll());
        
        System.out.println("----DEQUE------");
        
        //Deque<String> q2 = new LinkedList<>();
        Deque<String> q2 = new ArrayDeque<>(5);
        q2.add("a");
        q2.offer("b");
        q2.offer("c");
        q2.offer("e");
        q2.offer("c");
        q2.offer("e");
        
        q2.forEach(System.out::println);
        
//        while(!q2.isEmpty())
//            System.out.println(q2.pollLast());
        

        System.out.println("-------------");
        
        PriorityQueue<Integer> q3 = new PriorityQueue<>();
        q3.addAll(Arrays.asList(7,5,9,2,1,6,3,22));
        System.out.println(q3);
        System.out.println(q3.poll());
        System.out.println(q3);
        System.out.println(q3.poll());
        
        System.out.println("-----------");
        
        List<String> sl = new ArrayList<>();
        sl.add("a");
        sl.add("b");
        sl.add("c");
        sl.add("d");
        sl.add("e");
        
//        for(String s : sl) {
//            if(s.equals("b"))
//                sl.remove("b");
//        }
        
//        for(int i = 0; i < sl.size(); i++) {
//            if(sl.get(i).equals("b"))
//                sl.remove("b");
//        }
        
        Iterator<String> itr = sl.iterator();
        
        while (itr.hasNext()) {
            String next = itr.next();
            if(next.equals("b"))
                itr.remove();
        }
    }
}
