/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.ocp.innerclass2;

/**
 *
 * @author tlubowiecki
 */
public class Outer3 {
    
    private int i = 10;
    private int staticI = 10;
    
    public interface InnerInterface {
        void machWas();
    }
    
    public static interface InnerStaticInterface {
        void machWasAnderes();
    }
}

class Outer4 implements Outer3.InnerInterface {

    @Override
    public void machWas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    class Abc implements Outer3.InnerStaticInterface {

        @Override
        public void machWasAnderes() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
