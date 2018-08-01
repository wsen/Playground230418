package de.boya.ocp.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
class A {}
class B extends A { }
class C extends B { }

public class HandlingBounds {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>();
        List<? extends A> list2 = new ArrayList<A>();
        List<? super A> list3 = new ArrayList<A>();
        List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE
        List<? super B> list5 = new ArrayList<A>();
        List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE
    }
}
 /*
Line 6 creates an ArrayList that can hold instances of class A. It is stored in a variable
with an unbounded wildcard. Any generic type can be referenced from an unbounded wildcard,
making this OK.

Line 7 tries to store a list in a variable declaration with an upper-bounded wildcard.
This is OK. You can have ArrayList<A>, ArrayList<B>, or ArrayList<C> stored in that
reference. 

Line 8 is also OK. This time, you have a lower-bounded wildcard. The lowest
type you can reference is A. Since that is what you have, it compiles.

Line 9 has an upper-bounded wildcard that allows ArrayList<B> or ArrayList<C> to be
referenced. Since you have ArrayList<A> that is trying to be referenced, the code does not
compile. 

Line 10 has a lower-bounded wildcard, which allows a reference to ArrayList<A>,
ArrayList<B>, or ArrayList<Object>.

Finally, line 11 allows a reference to any generic type since it is an unbounded wildcard. The
problem is that you need to know what that type will be when instantiating the ArrayList. It
wouldn’t be useful anyway, because you can’t add any elements to that ArrayList.
Now on to the methods. Same question: try to figure out why they don’t compile and what
they do. We will present the methods one at a time because there is more to think about.

*/