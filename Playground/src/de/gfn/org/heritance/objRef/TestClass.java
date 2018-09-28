package de.gfn.org.heritance.objRef;

/**
 *
 * @author wsen
 */
public class TestClass{
   public static void main(String args[ ] ){
      A o1 = new C( );
      B o2 = (B) o1; //30 20
//      A o2 = (B) o1; // 30 10
//      C o2 = (B) o1; // B can not be converted to C

      System.out.println(o1.i);
      System.out.println(o1.m1());
      
      System.out.println(o2.i);
      System.out.println(o2.m1());
   }
}

class A { int i = 10;  int m1( ) { return i; } }
class B extends A { int i = 20;  int m1() { return i; } }
class C extends B { int i = 30;  int m1() { return i; } }
