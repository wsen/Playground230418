package de.gfn.org.precedence;

/**
 *
 * @author student
 */
class X{
    int val = 10;
    //Integer val = new Integer(10);
}

class Y extends X{
    Y val = null; //1
}

public class PrecedencePlusCast extends X{

  public static void main(String[] args){
    Y y = new Y();
    int k = (X) y.val ; //2 //dot precedes cast-Operator  
    // and then you can't assign an object of type X to an variable of type ini
    //int k = ((X)y).val ; //2
        System.out.println(k);
  }
}
