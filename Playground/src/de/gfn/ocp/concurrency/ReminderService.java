package de.gfn.ocp.concurrency;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author tlubowiecki
 */
public class ReminderService {
    
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    
    public void setReminderTask() {
        service.scheduleAtFixedRate(new ReminderTask("Mails versenden"), 0, 5, TimeUnit.SECONDS);
        //service.scheduleWithFixedDelay(new ReminderTask("Mails versenden"), 0, 2, TimeUnit.SECONDS);
        //ScheduledFuture<String> sf = service.schedule(new ReminderResultTask("Mails versenden"), 2, TimeUnit.SECONDS);
    }
    
    public static void main(String[] args) {
        ReminderService rs = new ReminderService();
        rs.setReminderTask();
    }
}

class ReminderTask implements Runnable {
    
    private String taskText;
    private Random rand = new Random();

    public ReminderTask(String taskText) {
        this.taskText = taskText;
    }
    
    @Override
    public void run() {
        System.out.println("Start...");
        int runTime = rand.nextInt(10);
        try {
            Thread.sleep(runTime * 1000);
        }
        catch(InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("Ende... sleepTime: " + runTime + " sek.");
        
        //System.out.println(taskText + ": erledigt");
    }
}

class ReminderResultTask implements Callable<String> {
    
    private String taskText;
    private Random rand = new Random();

    public ReminderResultTask(String taskText) {
        this.taskText = taskText;
    }

    @Override
    public String call() throws Exception {
        
        System.out.println("Start...");
        int runTime = rand.nextInt(10);
        Thread.sleep(runTime * 1000);
        System.out.println("Ende... sleepTime: " + runTime + " sek.");
        
        return taskText + ": erledigt";
    }
}
