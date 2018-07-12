package de.gfn.ocp.serialize;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class CollectionSerializeTest {
    
    private static final String FILE = "personen2.txt";
    static transient Person2 p = new Person2("Bruce", "Wayne");
    
    public static void main(String[] args) {
        
        List<Person2> personen = null;
        
        
//        personen = new ArrayList<>();
//        personen.add(new Person2("Peter", "Parker"));
//        personen.add(new Person2("Clark", "Kent"));
//        personen.add(p);
//        
//        try(ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(FILE)))) {
//            oos.writeObject(personen);
//        }
//        catch(Exception ex) {
//            System.out.println(ex);
//        }


        try(ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(FILE)))) {
            
            personen = (List<Person2>) ois.readObject();
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        
        for(Person2 p : personen) {
            System.out.println(p.getVorname() + " " + p.getNachname());
        }
    }
}

class Person2 implements Serializable {
    
    static final long serialVersionUID = 1L;
    
    private String vorname;
    private String nachname;

    public Person2() {
    }

    public Person2(String vorname, String nachname) {
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
}
