/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.ifelse;

/**
 *
 * @author student
 */
public class CompactIfGedoens {
    public static void main(String[] args) {
        int grossIncome=0;
        double taxRate;
        
        if(grossIncome>36000) {
            taxRate = .2;
         }else taxRate = 0;
         if(grossIncome>18000 ) {
            taxRate = .1;
         }
    }
}
