/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.interfaze;

/**
 *
 * @author wsen
 */

class Phone {}

public class Tablet extends Phone implements Roamable {
    Roamable var = (Roamable) new Phone();
    
    public int fly(int speed){
        return 240;        
    }
    
    public static void main(String[] args) {
        
    }
}

/* 
Hidden and not overrided stuff:

private instance methods
static methods
variables, regardless of the access modifier
>
Polymporhism

Which of the following statements about polymorphism are true? (Choose all that apply)

A. A reference to an object may be cast to a subclass of the object without an explicit cast.
B. If a method takes a superclass of three objects, then any of those classes may be passed
as a parameter to the method.
C. A method that takes a parameter with type java.lang.Object will take any reference.
D. All cast exceptions can be detected at compile-time.
E. By defining a public instance method in the superclass, you guarantee that the specific
method will be called in the parent class at runtime.
//B,C
>
4
 because the method is declared as static in the parent class and not so in the child class. For nonprivate methods in the parent class, both methods must use static (hide) or neither should use static (override).
>
Interfaces:
- interfaces: not marked as final
- intefaceVar: 
    assumed public static final
    value must be set when it is declared since it is marked is final
- interfaceMethod:
    public
    not final
    if static or default > needs body {} -> ct error
    it nonstatic >  are all implicitely public abstract
- default interfaceMethod:
    public
- static interface Method:
    public
    reference to the name of the interface must be used like Hop.getJumpHeight()

Abstract Class:
- Variables:
    pulic static final
- static abstractMethod

*/
