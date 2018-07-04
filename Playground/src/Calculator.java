/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wsen
 */
abstract public class Calculator {
    abstract void calculate();
    public static void main(String[] args) {
        System.out.println("calculating");
        Calculator x = null;
        x.calculate();
    }
}
