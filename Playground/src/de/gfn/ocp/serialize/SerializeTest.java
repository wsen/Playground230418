package de.gfn.ocp.serialize;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author tlubowiecki
 */
public class SerializeTest {
    
    private static final String FILE = "personen.txt";
    
    public static void main(String[] args) {
        
        Person p1 = new Person("Peter", "Parker");
        Person p2 = new Person("Bruce", "Wayne");
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(FILE)))) {
            oos.writeInt(2);
            oos.writeObject(p1);
            oos.writeObject(p2);
        }
        catch(Exception ex) {
            System.out.println(ex);
        }

        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(FILE)))) {
            
            Person p = null;
            
            int count = ois.readInt();
            
            for(int i = 0; i < count; i++) {
                p = (Person) ois.readObject();
                System.out.println(p.getVorname() + " " + p.getNachname());
            }
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
    }
}

class Person implements Serializable {
    
    static final long serialVersionUID = 1L;
    
    transient private String vorname;
    private String nachname;

    public Person() {
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
    // Wird beim Serializieren automatisch aufgerufen
    private void writeObject(ObjectOutputStream out) throws IOException {
        nachname = nachname + "....";
        out.defaultWriteObject();
    }
    
    // Wird beim Deserializieren automatisch aufgerufen
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        vorname = "Unbekannt";
    }
}
