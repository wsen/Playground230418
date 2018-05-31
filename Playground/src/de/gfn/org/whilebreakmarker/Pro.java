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
        int arr[][] = {{3, 2, 1}, {5, 4, 2}, {0, 8, 7}};
//        outer:
//        for (int x = 0, k = 0; x < 3; x++) {
//            k = 0;
//            inner:
//            while (true) {
//                System.out.println(arr[x][k++]);
//                if (k == 3) {
//                    break;// inner;
//                }
//            }
//        }
        int a = 10;
        for (; a <= 20; ++a) {
            System.out.println("a: " + a);
            if (a % 3 == 0) {
                a++;
            } else if (a % 2 == 0) {
                a = a * 2;
            }

            System.out.println(a);
        }

        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            System.out.println("i " + i);
            if (i == 8) {
                keepGoing = false;
            }
            result -= 2;
        } while (keepGoing);
        System.out.println(result);

        System.out.println("------");
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++) {
            System.out.println("row: " + row);
            for (int col = 1; col <= 2; col++) {
                System.out.println("col: " + col);
                if (row * col % 2 == 0) {
                    System.out.println("--");
                    continue ROW_LOOP;
                }
                count++;
            }
        }
        System.out.println(count);
        
        
    }
}

//public class Pro {
//    public static void main(String[] args) {
//        int a[]= {1,2,3,4,5,6};
//        int i = a.length -1;
//        while(true){
//            while(i>=0) {
//                System.out.println(a[i]);
//                i--;
//            }
//        }
//        System.out.println("END");
//        //unreachable statement
//    }
//}
