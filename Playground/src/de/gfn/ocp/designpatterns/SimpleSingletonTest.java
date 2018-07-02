package de.gfn.ocp.designpatterns;

/**
 *
 * @author tlubowiecki
 */
public class SimpleSingletonTest {
    
    public static void main(String[] args) {
        
        LazySingleton s1 = LazySingleton.getInstance();
        
        EagerSingleton e1 = EagerSingleton.getInstance();
        
        EnumSingleton es1 = EnumSingleton.INSTANCE;
        System.out.println(EnumSingleton.i);
        es1.machWas();
        System.out.println(es1.i);
        //System.out.println(es1.j);
    }
}

class LazySingleton {

    private static LazySingleton instance;
    
    private LazySingleton() {
    }
    
    public static LazySingleton getInstance() {
        if(instance == null) {
            synchronized(LazySingleton.class) {
                if(instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}

class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton() {
    }
    
    public static EagerSingleton getInstance() {
        return instance;
    }
}

enum EnumSingleton {
    
//    final static EnumSingleton INSTANCE = new EnumSingleton() {
//        
//    }
    
    INSTANCE();
    
    EnumSingleton() {
        
    }
    
    public static int i = 10;
    
    public void machWas() {
    }
}
