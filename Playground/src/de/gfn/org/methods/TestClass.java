package de.gfn.org.methods;

/**
 *
 * @author wsen
 */
class TestClass{
   static TestClass ref;
   String[] arguments;
   public static void main(String args[]){
      ref = new TestClass(); //Objekt wird einer statischen Referenz von Typ TestClass zugewiesen
      ref.func(args); //Aufruf Funktion func via Referenz ref
      //KOMPAKT: new TestClass().func(args); //!! geht nicht, da wg. statischem ref Kontext
   }
   public void func(String[] args){
      ref.arguments = args;
   }
}
