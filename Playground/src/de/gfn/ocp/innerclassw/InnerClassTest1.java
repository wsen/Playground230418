package de.gfn.ocp.innerclassw;

/**
 *
 * @author student
 */
public class InnerClassTest1 { //TopLever public oder package Scope
 // Aüßere Klasse darf nicht benutzen was innere Klasse hat.
   // Statische Elemente nicht in inneren Klassen 
   // Möglich sind aber statische innere Klassen mit inneren statischen Members (siehe unten)
    private static int outerStaticZahl = 4;
    private int outerZahl = 5;
    
    public static int outerStaticPubZahl = 44;
    public int outerPubZahl = 55;
    
    public static void main(String[] args) {
        InnerClassTest1 ict1 = new InnerClassTest1();
        Inner i = ict1.new Inner();
        //Zugriff außerhalb
        InnerClassTest1.Inner j = ict1.new Inner();
        System.out.println(i.zahl); // so ist ein Zugriff auf inner möglich
        i.machWas();
        
        //System.out.println(zahl); // kein Zugriff auf Var von Inner
        
        InnerClassTest1.StaticInner si = new InnerClassTest1.StaticInner();
        InnerClassTest1.StaticInner.machWasStatic();
        si.machWas();
        
        InnerClassTest1.StaticInner.machWasStatic();
        
    }
    
    static void machWasStatic() {
        
        //static class LocalInner { //hier nix static erlaubt
        class LocalInner {
            //static int zahl = 1; // nein nein nein
            {
                System.out.println(outerStaticPubZahl);
                //System.out.println(outerPubZahl);
            }
            
        }
        
        LocalInner li = new LocalInner();
    }
    
   void machWas() {
        abstract class LocalInner {
            {
                System.out.println(outerStaticPubZahl);
                System.out.println(outerPubZahl);
            //machWas(); //rekursiv !
            }
        }
        
        LocalInner li = new LocalInner();
    }
    
    
    class Inner { //verträgt alle Scopes halleluja
    // hier kein statisches Gedöns erlaubt (Members)
    // this der inneren Klassen <> this der äußeren Klasse !
    // keine Polymorphie
        {
            System.out.println("Inner init");
        }
        
        
        //public int zahl = 10;
        private int zahl = 100;
        // public static int staticZahl = 9; // nur in statischen Klassen
        
        
        void machWas() {
            int outerZahl = 500;
            
            System.out.println(outerStaticZahl);
            System.out.println(outerZahl);
            System.out.println(outerStaticPubZahl);
            System.out.println(outerPubZahl);
        }
    }
    
    static class StaticInner {
        
        static {
            System.out.println("StaticInner static");
        }
        
        {
            System.out.println("StaticInner init");
        }
        
        //public int zahl = 10;
        private int zahl = 100;
        // public static int staticZahl = 9; // nur in statischen Klassen
        
        private static void machWasStatic() {
            System.out.println("Static");
        }
        
        void machWas() {
            int outerZahl = 500;
            
            System.out.println(outerStaticZahl);
            System.out.println(outerZahl);
            System.out.println(outerStaticPubZahl);
            System.out.println(outerPubZahl);
        }
    }
}


/* git ToDo: Dirs/Packages refactoren/umbenennen
CONFLICT (add/add): Merge conflict in Playground/src/de/gfn/oca/vererbung/VererbungTest10.java
Auto-merging Playground/src/de/gfn/oca/lambda/LambdaTest5.java
CONFLICT (add/add): Merge conflict in Playground/src/de/gfn/oca/lambda/LambdaTest5.java
Auto-merging Playground/src/de/gfn/oca/collections/ArrayListTest2.java
CONFLICT (add/add): Merge conflict in Playground/src/de/gfn/oca/collections/ArrayListTest2.java
Auto-merging Playground/src/de/gfn/oca/basics/ShortTest.java
CONFLICT (add/add): Merge conflict in Playground/src/de/gfn/oca/basics/ShortTest.java
Auto-merging Playground/src/de/gfn/oca/basics/InitTest.java
CONFLICT (add/add): Merge conflict in Playground/src/de/gfn/oca/basics/InitTest.java
Auto-merging Playground/src/de/gfn/oca/basics/ArraysTest.java
CONFLICT (content): Merge conflict in Playground/src/de/gfn/oca/basics/ArraysTest.java

*/