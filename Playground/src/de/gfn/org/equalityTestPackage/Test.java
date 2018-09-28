package de.gfn.org.equalityTestPackage;
import de.gfn.org.equalityOther.*;
/**
 *
 * @author wsen
 */
class Test{
   public static void main(String[] args){
      String hello = "Hello", lo = "lo";
      System.out.print((de.gfn.org.equalityTestPackage.Other.hello == hello) + " ");    //line 1 t
      System.out.print((de.gfn.org.equalityOther.Other.hello == hello) + " ");   //line 2 t
      System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3 t
      System.out.print((hello == ("Hel"+lo)) + " ");              //line 4 f
      System.out.println(hello == ("Hel"+lo).intern());          //line 5 t
   }
}
class Other { static String hello = "Hello"; }
