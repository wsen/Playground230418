/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.timegedoens;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author student
 */
public class PeriodTest {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2012,1,4);
        LocalDate ld2 = ld.plus(Period.ofMonths(1).ofDays(1));
        System.out.println(ld2 + "");
        //System.out.println(new TestClass.loopTest(0));
        
        System.out.println("---------------");
        int x =0;
        loop: for (int i = 1; i < 5; i++){
         for (int j = 1; j < 5; j++){
            System.out.println(i);
            if (x == 0) {  continue loop;  }
            System.out.println(j);
         }
      }
   }
}

//class TestClass{
//   public void loopTest(int x){
//      loop: for (int i = 1; i < 5; i++){
//         for (int j = 1; j < 5; j++){
//            System.out.println(i);
//            if (x == 0) {  continue loop;  }
//            System.out.println(j);
//         }
//      }
//   }
//}