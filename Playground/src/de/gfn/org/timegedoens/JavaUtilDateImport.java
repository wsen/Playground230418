package de.gfn.org.timegedoens;
import java.util.*;
// import static java.lang.Math.pow; // OK
import static java.lang.Math.*;  // OK
/**
 *
 * @author wsen
 */
public class JavaUtilDateImport {
    
    public static void main(String[] args) {
        System.out.println(new Date());
        //System.out.println(Math.pow(5,5));// OK
        System.out.println(pow(5,5));
        int n = 808;
        System.out.format("%06d",n);
        
        System.out.println("-------");
    }
 
}
