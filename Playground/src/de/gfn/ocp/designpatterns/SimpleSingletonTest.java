package de.gfn.ocp.designpatterns;

/**
 *
 * @author tlubowiecki
 */
public class SimpleSingletonTest {
    
    public static void main(String[] args) {
        
        LazySingleton s1 = LazySingleton.getInstance();
        EagerSingleton e1 = EagerSingleton.getInstance();
        
    }
}

class LazySingleton {

    private static LazySingleton instance;
    
    private LazySingleton() {
    }
    
    public static LazySingleton getInstance() {
        synchronized(LazySingleton.class) {
            if(instance == null) {
                synchronized(LazySingleton.class) {
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
