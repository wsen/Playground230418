package de.gfn.ocp.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author tlubowiecki
 */
public class BlockingQueueTest2 {
    
    public static void main(String[] args) {
        
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        queue.offer(10);
        queue.poll();
        
        try {
            queue.offer(10, 10, TimeUnit.SECONDS);
            queue.poll(10, TimeUnit.SECONDS);
            
            queue.put(10);
            queue.take();
        }
        catch(InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
