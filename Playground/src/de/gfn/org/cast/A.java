package de.gfn.org.cast;

/**
 *
 * @author wsen
 */
class A {
      public int getCode(){ return 2;}
      
      public static void main(String[] args) {
        A a = null;
        AA aa = null;
        a = (AA)aa;
        a = new AA();
        //aa = new A(); //incompatible: A cannot be converted in AA
        aa = (AA) a;
        //aa = a; //incompatible: A cannot be converted in AA
        ((AA)a).doStuff();
    }
}

class AA extends A { 
  public void doStuff() {
      System.out.println("did Stuff"); 
      //((AA)a).doStuff(); works with: a = new AA();
      /*
     Once you cast a to AA, you can call methods defined in AA. Of course, if a does not point to an object of class AA at runtime, a ClassCastException will be thrown.
    In this particular case, a NullPointerException will be thrown because a points to null and a null can be cast to any class. 
      */
  } 
}
