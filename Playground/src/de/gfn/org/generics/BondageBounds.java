package de.gfn.org.generics;

/**
 * http://openbook.rheinwerk-verlag.de/javainsel/10_003.html#u10.3
 * @author student
 */
public class BondageBounds { 

  public static <T extends CharSequence> T random( T m, T n ) { 
    return Math.random() > 0.5 ? m : n; 
  } 

  public static <T extends Comparable<T>> T max( T m, T n ) { 
    return m.compareTo( n ) > 0 ? m : n; 
  }
  
  public static void main( String[] args ) { 
    String random1 = random( "Shinju", "Karada" ); 
    System.out.println( random1 ); 

    CharSequence random2 = random( "Ushiro", new StringBuilder("Takatekote") ); 
    System.out.println( random2 ); 
    
    System.out.println( max( "Kino", "Lesen" ) );              // Lesen 
    System.out.println( max( 12, 100 ) );                      // 100
    //System.out.println( max( 12L, 100F ) );
    /*
    Nach dem Boxing leitet der Compiler aus dem Long 12 und dem Float 100 den 
    gemeinsamen Typ Number ab. (Zur Erinnerung: Der Compiler geht in der Typhierarchie 
    so lange nach oben, bis ein gemeinsamer Typ gefunden wurde, der für T eingesetzt 
    werden kann. Das ist Number.) Aber Number ist nicht vom Typ Comparable, und so folgt
    eine Fehlermeldung: 
    »Bound mismatch: The generic method max(T, T) of type BondageBounds is not applicable 
    for the arguments (Long, Float)
    */
  } 
}
