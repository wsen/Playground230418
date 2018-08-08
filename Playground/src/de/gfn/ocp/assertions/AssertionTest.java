package de.gfn.ocp.assertions;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author tlubowiecki
 */
public class AssertionTest {
    
    public static void main(String[] args) throws Exception {
        
        Mensch m = new Mensch();
        m.setAlter(-100);
        m.tellAlter();
        
//        try {
//            
//        }
//        finally {
//            
//        }

        try(RoboConn con = new RoboConn()) {
            con.machWas();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
            System.out.println("------------");
            for(Throwable t : e.getSuppressed()) {
                System.out.println(t.getMessage());
            }
        }
        
        
    }
}

class Mensch {
    
    private int alter;

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    
    public void tellAlter() {
        try {
            assert alter > 0: "Alter unter 0";
        }
        catch(AssertionError err) {
            // write to LOG
        }
        System.out.println("Ich bin " + alter + " Jahre alt");
    }
    
    public void changeAlter() {
        // Anweisungen
        assert alter > 0: "Alter noch immer unter 0";
    }
}

class RoboConn implements Closeable {

    public RoboConn() {
        System.out.println("RoboConn Start");
    }
    
    public void machWas() throws IOException {
        throw new IOException("Fehler bei MachWas");
    }
    
    @Override
    public void close() throws IOException {
        System.out.println("RoboConn ENDE");
        throw new IOException("Fehler bei Close");
    }
}