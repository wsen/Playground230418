package de.gfn.ocp.concurrent;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 *
 * @author tlubowiecki
 */
public class SynchronousQueueTest {
    
    public static void main(String[] args) {
        
        final SynchronousQueue<Request> requests = new SynchronousQueue<>();
        
        new Thread(new SynchClient(requests)).start();
        new Thread(new SynchServer(requests)).start();
        
    }
    
}

class SynchClient implements Runnable {
    
    private SynchronousQueue<Request> requests;

    public SynchClient(SynchronousQueue<Request> requests) {
        this.requests = requests;
    }

    @Override
    public void run() {
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            try {
                System.out.println("Eingabe: ");
                
                switch(scanner.next().toLowerCase()) {
                    
                    case "f":
                        requests.put(new Request(RequestType.FORWARD, "Suche neue Lebensformen!"));
                        break;
                        
                    case "l":
                        requests.put(new Request(RequestType.LEFT, "Gehe nach links!"));
                        break;
                        
                    case "r":
                        requests.put(new Request(RequestType.RIGHT, "Gehe nach rechts!"));
                        break;
                        
                    case "b":
                        requests.put(new Request(RequestType.BACKWARD, "Gehe zurück!"));
                        break;
                        
                    case "x":
                        System.exit(0);
                }
            }
            catch(InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
    
}

class SynchServer implements Runnable {

    private SynchronousQueue<Request> requests;

    public SynchServer(SynchronousQueue<Request> requests) {
        this.requests = requests;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Request request = requests.take();
                System.out.println("Anfrage erhalten:" + request.getType() + ": " + request.getBody());
            }
            catch(InterruptedException ex) {
                System.out.println(ex);
            }
            
        }
    }
    
}