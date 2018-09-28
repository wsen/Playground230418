package de.gfn.oca.constructorchaining;

/**
 *
 * @author wsen
 */

class A{
  public A() {} // A1
  public A(String s) {  this();  System.out.println("A :"+s);  }  // A2
}

class B extends A{
  public int B(String s) {  System.out.println("B :"+s);  return 0; } // B1
    public static void main(String[] args) {
        Constructoritis C = new Constructoritis();
        B B = new B ();
    }
}

public class Constructoritis extends B{
    private Constructoritis(){ super(); } // C1
    public Constructoritis(String s){  this();  System.out.println("C :"+s);  } // C2
    public Constructoritis(int i){} // C3
    
}
