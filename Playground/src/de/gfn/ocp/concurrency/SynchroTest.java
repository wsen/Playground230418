package de.gfn.ocp.concurrency;

/**
 *
 * @author tlubowiecki
 */
public class SynchroTest {
    
    public static void main(String[] args) {
        
        Work work = new Work();
        
        Worker w1 = new Worker();
        w1.setName("Peter");
        w1.setWork(work);
        w1.start();
        
        Worker w2 = new Worker();
        w2.setName("Max");
        w2.setWork(work);
        w2.start();
        
    }
}

class Work {
    
    private int tasks = 0;
    
    public synchronized void doTask() {
        System.out.println(++tasks + " " + Thread.currentThread().getName());
    }
}

class Worker extends Thread {
    
    private Work work;

    public void setWork(Work work) {
        this.work = work;
    }
    
    private void doWork() {
        int i = 0;
        while(i < 100) {
            work.doTask();
            i++;
        }
    }
    
    /*
    private int count = 0;
    
    public synchronized int getCount() {
        return count;
    }

    public synchronized void setCount(int count) {
        this.count = count;
    }
    */
    
    private static int count = 0;
    
    @Override
    public void run() {
        //coutTo100();
        doWork();
    }
    
    // bei Instanzmethoden arbeitet synchronized mit this

//    public synchronized void coutTo100() {
//        for(int i = 0; i < 100; i++) {
//            System.out.println(++count + " " + getName());
//        }
//    }
    
    // bei Klassenmethoden arbeitet synchronized mit class
//    public static synchronized void coutTo100() {
//        for(int i = 0; i < 100; i++) {
//            System.out.println(++count + " " + Thread.currentThread().getName());
//        }
//    }
    
    public void coutTo100() {
        for(int i = 0; i < 100; i++) {
            synchronized(this) {
                System.out.println(++count + " " + getName());
            }
        }
    }
}