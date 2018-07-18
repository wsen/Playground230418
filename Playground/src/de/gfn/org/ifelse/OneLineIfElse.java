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
public class OneLineIfElse {
    public static void main(String[] args) {
        boolean flag = true;
        if (flag)   //1
        if (flag)   //2
        if (flag)   //3
        System.out.println("False True");
        else        //4
        System.out.println("True False");
        else        //5
        System.out.println("True True");
        else        //6
        System.out.println("False False");
        
        System.out.println("-----");
        if(flag = false){
           System.out.println("1");
        }else if(flag){
           System.out.println("2");
        }else if(!flag){
           System.out.println("3");
        }else    
            System.out.println("4");
    }
}
//flag:false -> False False
//flag:true -> False True