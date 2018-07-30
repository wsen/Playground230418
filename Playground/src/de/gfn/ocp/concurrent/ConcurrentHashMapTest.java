package de.gfn.ocp.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author tlubowiecki
 */
public class ConcurrentHashMapTest<K,V> {
    
//    private Map<K, V> data = new HashMap<>();
//    
//    public synchronized void hinzufügen(K key, V value) {
//        data.put(key, value);
//    }
//    
//    public synchronized V lesen(K key) {
//        return data.get(key);
//    }
    
    private Map<K, V> data = new ConcurrentHashMap<>();
    
    public void hinzufügen(K key, V value) {
        data.put(key, value);
    }
    
    public V lesen(K key) {
        return data.get(key);
    }
}
