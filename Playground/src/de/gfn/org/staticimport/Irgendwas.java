/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.staticimport;

/**
 *
 * @author student
 */
public class Irgendwas {
    public static void main(String[] args) {
        int arr[][] ={{3,2,1},{5,4,2},{0,8}};
        for(int x=0; x<3;x++){
            for(int y=0; y<3; y++) {
                if(x==1) { System.out.println("continue with x:"+x+" y:"+y+"\n");continue;}//dann y++ oder nicht? y++
                                                                                //geht in die nächste iteration
                if(x==2 && y==1) { System.out.println("break with x:"+x+" y:"+y+"\n"); break;}
                System.out.println("x:"+x+" y:"+ y + " -> " + arr[x][y]);
            }
        }
        System.out.println("^------------leggo mio------------\n");
        int i = 10;
        do {
            System.out.println("i v:"+i+"\n");
            while (i++ < 15) {
                System.out.println("i in v:"+i+"\n");
                i = i + 20;
                System.out.println("i in n:"+i+"\n");
            }
            System.out.println("i n:"+i+"\n");
        } while(i <2);
        System.out.println(i);
        // Precedence ++ higher then <>
        //i = 10: i<2 Abbruch -> inner: while 11 < 15: 31, inner: while 31 < 15 ABBRUCH mit i:32
        
        System.out.println("^------------ unreachable statement -----------\n");
//        int []a = {1,2,3,4,5,6};
//        i = a.length -1;
//         while(true){
//             while(i>=0) {
//                 System.out.println(a[i]);
//                 i--;
//             }
//         }
//         System.out.println("END"); //java:47: error: unreachable statement

        System.out.println("^------------ Hellow -----------\n");
            for(i=0;i<5;i++,System.out.print(i + ".Hellow "));
            
        System.out.println("^------------ Hanger?-----------\n");
            for(int x=10;x>5;x++,System.out.print(x + ".Hellow ")){
                if(x==15) x -=11;
                System.out.println(x + " ");
            };    
    }
}

//32
//10