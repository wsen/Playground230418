/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.oca.exception2;

/**
 *
 * @author wsen
 */
public class ExceptionReturn {
    
    int TestReturn() throws RuntimeException {
        int a=0,b=0;
            
        try {
           return a / b;
           //throw new Exception();
        } catch (ArithmeticException e) {
            System.out.println(" Arithm: ");
            //throw new RuntimeException(e);
            return -1;
        } catch (RuntimeException e) {
            System.out.println(" Runtime: ");
           return 0;
        } finally {
             System.out.print("done");
        }   
    }
    
    
    public static void main(String[] args) {
        System.out.println("" + new ExceptionReturn().TestReturn());
    }
    

   
}
