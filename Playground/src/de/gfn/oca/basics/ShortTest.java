package de.gfn.oca.basics;

/**
 *
 * @author wsen
 */
public class ShortTest {
    public static void main(String[] args) {
        short s = 10;
        
    //    Long l = 10; // 10 wird zu INteger geboxt, Fehler von Integer nach Long
        long l2 = new Integer(10); // Integer wierd ausgepackt, int nach long OK
        // machWas(10); // integer stat short
        machWas(s);     // hier mit short 
        
        Double d = 8.08;
        System.out.println(d instanceof Object);
        
        
    }
    
    
    static long machWas(short s){
        //return new Integer(1);
        return 1l; //geht
        //return 1; // Integer geht nicht
    }
}
