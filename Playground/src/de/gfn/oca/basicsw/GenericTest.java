/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.basicsw;

/**
 *
 * @author tlubowiecki
 */
public class GenericTest {
    
    public static void main(String[] args) {
        
        StrGenClass<String> sgc = new StrGenClass<>();
        
    }
}

interface GenI<T> {
    
    void machWas(T t);
    
    T machWas(T t1, T t2);
}

class StrGenClass<T> implements GenI<T> {

    @Override
    public void machWas(T t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T machWas(T t1, T t2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



interface GenI2 {
    
    void machWas(String t);
}

abstract class StrGenClassSuper {

    static void machWas(String t) {
    }
}

class StrGenClass2 extends StrGenClassSuper {

    public static final boolean DEBUG = false;
    
    static void machWas(String t) {
        
        int x = 0;
        
        x: { System.out.println("BLOCK");} 
        
//        if(DEBUG) {
//            break x;
//        }
        
//        while(DEBUG) {
//            x = 10;
//        }
    }
}