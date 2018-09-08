/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.forLoop;

/**
 *
 * @author wsen
 */
public class DaysTest{

    static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
    
    public static void main(String[] args) {
        
        int index = 0;
        for(String day : days){
            
            if(index == 3){
                break;
            }else {
                 //continue;
            }
            index++;
            if(days[index].length()>3){
                days[index] = day.substring(0,3);
            }
        }
        System.out.println(days[index]);
        
        //----
//        for (int i=5; i=0; i--) { } // kein boolean

//int j=5;
//    for(int i=0, j+=5;  i<j ; i++) {  //doppelt initalisiert j--; }
//
//int i, j;
//    for (j=10; i<j; j--) { i += 2; } // i nicht intitalisiert

//int i=10;
//    for ( ; i>0 ; i--) { }

for (int i=0, j=10; i<j; i++, --j) {;}

    }
}
