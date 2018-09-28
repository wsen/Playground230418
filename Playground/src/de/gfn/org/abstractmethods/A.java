package de.gfn.org.abstractmethods;

/**
 *
 * @author wsen
 */
abstract class A{
   protected int m1(){ return 0; }
}
class B extends A{
//   int m1(){ return 1; } //must be more accessible or same
   protected int m1(){ return 1; }
}
