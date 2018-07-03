package de.gfn.ocp.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author tlubowiecki
 */
public class ReentrantReadWriteTest {
    
    public static void main(String[] args) {
        
        SaveList sl = new SaveList();
        
        new Thread(() -> {
            while(true) {
                sl.add(0, "Moin" + (int)(Math.random() * 100));
            }
        }).start();
        
        new Thread(() -> {
            while(true) {
                sl.add(0, "Hallo" + (int)(Math.random() * 100));
            }
        }).start();
        
        new Thread(() -> {
            while(true) {
                System.out.println(sl.get(0));
            }
        }).start();
    }
}

class SaveList {
    
    private final List<String> list = new ArrayList<>();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    
    {
        list.add("text1");
    }
    
    public void add(int index, String s) {
        lock.writeLock().lock();
        try {
            list.add(index, s);
        }
        finally {
            lock.writeLock().unlock();
        }
    }
    
    public String get(int index) {
        
        lock.readLock().lock();
        try {
            return list.get(index);
        }
        finally {
            lock.readLock().unlock();
        }
    }
}
