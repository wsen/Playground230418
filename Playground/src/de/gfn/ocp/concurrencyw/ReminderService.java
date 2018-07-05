/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.concurrencyw;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author student
 */
public class ReminderService {
    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    
    public void setReminderTask() {
        //1 service.scheduleAtFixedRate(new ReminderTask("Mails versenden"), 0, 5, TimeUnit.SECONDS);
        //2 service.schedule(new ReminderResultTask("Mails versendne"), 2, TimeUnit.SECONDS);
        ScheduledFuture<String> sf = service.schedule(new ReminderResultTask("Mails versendne"), 2, TimeUnit.SECONDS);
        //vlad: ScheduledFuture <> scheduleAtFixedRate
        
    }                                                               //0 Delay,
    //vlad: nicht blockierend
    // Vorteil: abgekoppelt vom Main Thread
    // Unterschied: scheduled fixedScheduld
    
    public static void main(String[] args) {
        ReminderService rs = new ReminderService();
        rs.setReminderTask();
    }
}

class ReminderTask implements Runnable {
    
    private String taskText;
    
    public ReminderTask(String taskText){
        this.taskText = taskText;
    }

    @Override
    public void run() {
        System.out.println(taskText + ": erledigt");
    }
    
}

class ReminderResultTask implements Callable<String> {
    
        private String taskText;
    
    public ReminderResultTask(String taskText){
        this.taskText = taskText;
        private Random rand = new Random();
    }

    @Override
    public String call() throws Execption {
        System.out.println("Start...");
        int runTime = rand.nextInt(10);
        Thread.sleep(runTime * 1000);
        
        return taskText + ": erledigt";
    }
}
