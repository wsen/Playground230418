package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class IX {               //NO DIFFERENCE:
    //String str = "default";   //object
    int str = 0;                //vgl. mit primitive
//    IX(String s) {
    IX(int s) {
        int str = -100;         //Test mit jetzt lokaler Variable
        //str = s;                //vgl. hier str=s als ClassMember mit Lokale Variable !!
        this.str = s;                //jetzt MUSS mit this referenziert werden, da sonst  !!
                                    //das sonst keine Neu-Zuweisung zu ClassMember, sondern
                                    // nur zur vergänglichen lokalen Variablen !!
    }
    void print() {
        System.out.println(str);
    }
    public static void main(String[] args) {
//        new IX("hello").print();
        new IX(42).print();

//        new IX("hello").print();
//        IX hans = new IX("hello");
        IX hans = new IX(43);
        //hans.print();
        //System.out.println("str sout: " + hans.str);
        System.out.println("str sout: " + hans.str);
    }
}
