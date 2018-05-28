/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.whilebreakmarker;

/**
 *
 * @author wsen
 */
public class Pro {
    public static void main(String[] args) {
        int arr[][] = {{3,2,1},{5,4,2},{0,8,7}};
        outer:for(int x=0,k=0;x<3;x++){
            k=0;
            inner:while(true){
                System.out.println(arr[x][k++]);
                if(k==3)break;// inner;
            }
        }
    }
}
