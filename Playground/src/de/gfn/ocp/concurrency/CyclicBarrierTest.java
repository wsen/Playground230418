package de.gfn.ocp.concurrency;

import java.awt.Point;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author tlubowiecki
 */
public class CyclicBarrierTest {
    
    public static void main(String[] args) {
        
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("nix");
//            }
//        };
//        Thread t1 = new Thread(r);
//        Thread t2 = new Thread(t1);
        
        CyclicBarrier stop1 = new CyclicBarrier(3, () -> System.out.println("Sooo.... jetzt gehts weiter zum Ziel 2!!!"));
        CyclicBarrier stop2 = new CyclicBarrier(3, () -> System.out.println("Sooo.... jetzt gehts weiter zur Missionsende!!!"));
        
        Scout bob = new Scout("Bob", new Point(5,7), stop1, new Point(12,9), stop2);
        Scout peter = new Scout("Peter", new Point(-3,5), stop1, new Point(-6,3), stop2);
        Scout andrew = new Scout("Andrew", new Point(2,10), stop1, new Point(-2,-5), stop2);
        
        bob.start();
        peter.start();
        andrew.start();
    }
    
}

class Scout extends Thread {

    private Point pos = new Point();
    
    private CyclicBarrier stop1;
    private Point ziel1;
    
    private CyclicBarrier stop2;
    private Point ziel2;

    public Scout(String name, Point ziel1, CyclicBarrier stop1, Point ziel2, CyclicBarrier stop2) {
        super(name);
        this.stop1 = stop1;
        this.ziel1 = ziel1;
        this.stop2 = stop2;
        this.ziel2 = ziel2;
    }
    
    @Override
    public void run() {
        
        try {
            while(!move(pos, ziel1))
                sleep(1000);
            
            System.out.println(getName() + " wartet am Checkpoint 1");
            stop1.await();
            
             while(!move(pos, ziel2))
                sleep(1000);
             
            System.out.println(getName() + " wartet am Checkpoint 2");
            stop2.await();
            
            System.out.println(getName() + " hat alle Missionsziele erreicht");
            
        }
        catch(InterruptedException ex) {
            System.out.println(ex);
        } catch (BrokenBarrierException ex) {
            System.out.println(ex);
        }
        
    }
    
    private boolean move(Point curPos, Point target) {
        
        if(curPos.x < target.x)
            curPos.x++;
        
        if(curPos.x > target.x)
            curPos.x--;
        
        if(curPos.y < target.y)
            curPos.y++;
        
        if(curPos.y > target.y)
            curPos.y--;
        
        System.out.println(getName() + ": bin auf dem Weg von " + curPos + " zu " + target);
        return curPos.equals(target);
    }
}
