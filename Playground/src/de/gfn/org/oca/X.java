package de.gfn.org.oca;

/**
 *
 * @author wsen
 */

class SuperX {
    String str = "ja super";
}



public class X extends SuperX {
    String str = "default";
    X(String s) {      
        super.str = s; //default
        //this.str = s;    //hello
    }
    void print(){
        System.out.println(str);
    }
    
    public static void main(String[] args) {
        new X("hello").print();
    }
}
