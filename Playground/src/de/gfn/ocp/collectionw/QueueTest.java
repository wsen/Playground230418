/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.collectionw;

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
 * @author student
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
            //System.out.println(q1.peek()); //peek nimmt immer von der gleichen Stelle, keine Möglichkeit dies zu modifizieren (also abzubrechen)
            System.out.println(q1.poll()); //läuft jetzt einmal durch
        
        System.out.println("----DEQUE----");
        
        //Deque<String> q2 = new LinkedList<>();
        Deque<String> q2 = new ArrayDeque<>(5);
        
        q2.add("a");
        q2.offer("b");
        q2.offer("c");
        q2.offer("e");
        q2.offer("c");
        q2.offer("e");
        
        q2.forEach(System.out::println); // Methodenreferenz
        
//       while(!q1.isEmpty())
//            System.out.println(q2.pollLast());
       
        System.out.println("---- Priority Queue ------");
        
        PriorityQueue<Integer> q3 = new PriorityQueue<>();
        q3.addAll(Arrays.asList(7,5,9,2,1,6,3,22));
        System.out.println(q3);
        System.out.println(q3.poll());
        q3.remove();
        System.out.println(q3);
        
        //Vergleichbarkeit programmieren: 
        // nicht für Integer, da bereits eingebaut (compareTo(T o))
        //
        
        System.out.println("----Deque-----");
        
        List<String> sl=new ArrayList<>();
        sl.add("a");
        sl.add("b");
        sl.add("c");
        sl.add("d");
        sl.add("e");
        
//        for(String s : sl){
//            if(s.equals("b"))
//                sl.remove("b"); // gleichzeitigds Durchlaufen und gleichzeitiges Bearbeiten geht nicht
//        }
        
        for(int i = 0; i< sl.size(); i++){  // Mit normalen for geht's
            if(sl.get(i).equals("b"))
                sl.remove("b");
        }
        
        Iterator<String> itr = sl.iterator();
        
        while(itr.hasNext()) {
            String next = itr.next();
            if(next.equals("b"))
                itr.remove();
        }
    }
}

//Deque von Queue abgeleitet