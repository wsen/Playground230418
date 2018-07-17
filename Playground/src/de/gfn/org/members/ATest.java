/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.members;

/**
 *
 * @author wsen
 */
public class ATest {
    
    
    String global = "111"; //Instanzvariable
    
    public int parse(String arg){
        int value = 0;
        //String global = "0";

        try{
            String global = arg; //lokale Variable hides a field  
            //System.out.println("parse global: " + global);
            value = Integer.parseInt(global);
            //System.out.println("parse value: " + value);
        }
        catch(Exception e){
            System.out.println(e.getClass());
        }
        System.out.print("global: " + global+" "+value+" ");
        return value;
    }
       public static void main(String[] args) {
          ATest ct = new ATest();
           System.out.print(ct.parse("333"));
       }

}