package de.gfn.ocp.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
/**
 *
 * @author tlubowiecki
 */
public class ForkJoinTest2 {
    
    public static void main(String[] args) {
        
        RandomNumbersTask task = new RandomNumbersTask(10000);
        ForkJoinPool pool = new ForkJoinPool();
        int erg = pool.invoke(task);
        
        System.out.println(erg);
    }
}

class RandomNumbersTask extends RecursiveTask<Integer> {

    private int count;

    public RandomNumbersTask(int count) {
        this.count = count;
    }
    
    @Override
    protected Integer compute() {
        
        int sum = 0;
        
        if(count > 4) {
            System.out.println("Split");
            List<RandomNumbersTask> subtasks = new ArrayList();
            subtasks.addAll(createSubTasks());
            
            for(RandomNumbersTask task : subtasks) {
                task.fork();
            }
            
            for(RandomNumbersTask task : subtasks) {
                sum += task.join();
            }
        }
        else {
            System.out.println("Run");
            int i = 0;
            while(i < count) {
                sum += new Random().nextInt(10);
                i++;
            }
        }
        return sum;
    }
    
    private List<RandomNumbersTask> createSubTasks() {
        
        List<RandomNumbersTask> subtasks = new ArrayList<>();
        subtasks.add(new RandomNumbersTask(count / 2));
        subtasks.add(new RandomNumbersTask(count / 2));
        
        return subtasks;
    }
    
}
