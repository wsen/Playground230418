/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.generics;

/**
 *
 * @author wsen
 */
public class GenericTest2 {
    public static void main(String[] args) {
        StrGenClass<String> sgc = new StrGenClass<>();
    }
}

interface GenI<T> {
    void machWas(T t);
    T machWas (T t1, T t2);
   
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


//----

interface GenI2 {
    default void machWas(String t){};
}

class StrGenClassSuper {
    void machWas(String t) {
      int x = 0;
      
      if(false) {
          x=10;
      }
    }
}

class StrGenClass2 implements GenI2 {
    public void machWas(String t){
        
    }
}

class StrGenClass3 extends StrGenClassSuper {
    void machWas(String t){
        
    }
}
