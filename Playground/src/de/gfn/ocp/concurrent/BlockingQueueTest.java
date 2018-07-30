package de.gfn.ocp.concurrent;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author tlubowiecki
 */
public class BlockingQueueTest {
    
    public static void main(String[] args) {
        
        BlockingQueue<Request> requests = new ArrayBlockingQueue<>(3);
        
        Client client = new Client(requests);
        Server server = new Server(requests);
        
        new Thread(client).start();
        new Thread(server).start();
    }
}

class Request {
    
    private final RequestType type;
    private final String body;

    public Request(RequestType type, String body) {
        this.type = type;
        this.body = body;
    }

    public RequestType getType() {
        return type;
    }

    public String getBody() {
        return body;
    }
}


class Client implements Runnable {
    
    private BlockingQueue<Request> requests;

    public Client(BlockingQueue<Request> requests) {
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

class Server implements Runnable {

    private BlockingQueue<Request> requests;

    public Server(BlockingQueue<Request> requests) {
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

enum RequestType {
    
    LEFT, RIGHT, FORWARD, BACKWARD;
    
}
