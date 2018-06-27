package de.gfn.oca.lambdaw;

/**
 *
 * @author tlubowiecki
 */
public class LambdaTest2 {
    
    public static void main(String[] args) {
        // SAM - Single Abstract Method
        
//        MyClass mc = new MyClass();
//        mc.machWas();
//        mc.machWasDefault(); // Default Methode aus dem Inteface
        
// v1
//        MyFunctional mf = () -> System.out.println("Lambda1");
//        mf.machWasDefault();
//        mf.machWas();
//        
//        mf = () -> System.out.println("Lambda2");
//        mf.machWasDefault();
//        mf.machWas();
        
// v2
//        MyFunctional mf = (s) -> System.out.println("Lambda v2");
//        mf = abc -> System.out.println("Lambda v2");
//        mf = (String x) -> System.out.println("Lambda v2");
//        mf = s -> {
//            System.out.println("Lambda v2");
//        };

// v3       
//        MyFunctional mf = (a, b) -> System.out.println("Lambda v3 " + a + " " + b);
//        mf.machWas("MachWas", 2);
//        // a = "Nix"; // geht nicht, da außerhalb des L-Ausdrucks nicht verfügbar
     
// v4
        
//        MyFunctional mf = i -> 10 + i;
//        mf = i -> {
//            i *= 100;
//            i += 10;
//            return i;
//        };
//        
//        System.out.println(mf.machWas(2));

// v5
        
        MyFunctional mf = () -> (int)(Math.random() * 100);
        System.out.println(mf.machWas());
    }
}

@FunctionalInterface
interface MyFunctional {
    
    double PI = 3.14;
    
//    void machWas(); // v1
    
//    void machWas(String s); // v2
        
//    void machWas(String s, int i); // v3

//    int machWas(int i); // v4

    int machWas(); // v5
    
    default void machWasDefault() {
        System.out.println("Default");
    }
    
    static void machWasStatic() {
        System.out.println("Static");
    }
}

//class MyClass implements MyFunctional {
//
//    @Override
//    public void machWas() {
//        System.out.println("Implementierung");
//    }
//}
