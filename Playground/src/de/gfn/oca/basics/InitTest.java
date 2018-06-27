package de.gfn.oca.basics;

/**
 *
 * @author tlubowiecki
 */
class A {
    static {
        System.out.println("A Static");
    }
    {
        System.out.println("A");
    }
    A() {
        System.out.println("A Const");
    }
}

class B extends A {
    static {
        System.out.println("B Static");
    }
    {
        System.out.println("B");
    }
    B() {
        System.out.println("B Const");
    }
}

class C extends B {
    static {
        System.out.println("C Static");
    }
    {
        System.out.println("C");
    }
    C() {
        System.out.println("C Const");
    }
    
    public static void main(String[] args) {
        
//        String s = String.join(", ", "Peter", "Bruce", "...");
//        System.out.println(s);
        new C();
    }
}
