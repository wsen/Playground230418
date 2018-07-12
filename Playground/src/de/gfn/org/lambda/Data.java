/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.lambda;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author student
 */
public class Data {
 int value;
    Data(int value){
        this.value = value;
    }
 @Override
    public String toString(){ return ""+value; }
    
    public static void main(String[] args) {
        Data[] dataArr = new Data[]{ new Data(1), new Data(2), new Data(3), new Data(4) };

        List<Data> dataList = Arrays.asList(dataArr); //1
        
        for(Data element :  dataList){

            dataList.removeIf( (Data d) -> { return d.value%2 ==  0; } );  //2

            System.out.println("Removed "+ d +", "); //3
        }
   }      
}
