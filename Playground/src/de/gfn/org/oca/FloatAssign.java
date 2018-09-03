/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.oca;

/**
 * Miran A29
 * @author wsen
 */
public class FloatAssign {
    public static void main(String[] args) {
        float var1 = (12_345.01 >= 123_45.00) ? 12_457.01 : 124_56.02f;
        //float var1 = (12_345.01 >= 123_45.00) ? 12_457.01 : 124_56.02f;
        //float var1 = (12_345.01 >= 123_45.00) ? 12_456 : 124_56.02f;
        float var2 = var1 + 1024;
        System.out.println(var2);
    }
}
