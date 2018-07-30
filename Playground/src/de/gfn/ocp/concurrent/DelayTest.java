package de.gfn.ocp.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author tlubowiecki
 */
public class DelayTest {
    
    public static void main(String[] args) {
        
        BlockingQueue<Task> queue = new DelayQueue<>();
        try {
            queue.put(new Task(10000, "Hallo späte Welt 10s"));
            queue.put(new Task(6000, "Moin Moin 6s"));
            queue.put(new Task(1000, "Tach auch 1s"));
            queue.put(new Task(3000, "Hallo 3s"));
        }
        catch(InterruptedException ex) {
            System.out.println(ex);
        }
        
        while (!queue.isEmpty()) {
            try {
                System.out.println(queue.take());
            }
            catch(InterruptedException ex) {
                System.out.println(ex);
            }
        }
        
    }
}

class Task implements Delayed {
    
    private final long duration;
    private final String text;

    public Task(long duration, String text) {
        this.duration = System.currentTimeMillis() + duration;
        this.text = text;
    }
    
    @Override
    public long getDelay(TimeUnit unit) {
        long diff = duration - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String getText() {
        return text;
    }
    
    @Override
    public int compareTo(Delayed o) {
        return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
    }

    @Override
    public String toString() {
        return "Task: delay: " + getDelay(TimeUnit.MILLISECONDS) + " milis, TEXT: " + text;
    }
}