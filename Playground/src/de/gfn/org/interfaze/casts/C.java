package de.gfn.org.interfaze.casts;

/**
 *
 * @author wsen
 */
interface I{
}
class A implements I{
}

class B extends A {
}

class C extends B{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
//        b = (B)(I) a; //ClassCastException
//        b = (B)a;   //ClassCastException
        
        
//        a = (B)(I)b;
//        a = (B)b;
        a = b;
    }    
}
