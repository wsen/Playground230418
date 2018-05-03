package de.gfn.oca.quader;
import de.gfn.oca.quader.test.A;
//What is the output of the following program?
public class WaterBottle {
    public static void main(String args[]){
        A a = new A();
        a.val1 = "Java";
        a.setVal1("PeHaPe");
        System.out.println(a.val1);

       int a1=1;
       int a2=2;
       int a3=3;
       if(a1>a2 || a2++== a3)
       {
           System.out.println("a1="+a1+" a2= "+a2+"a3= "+a3);// a1=1 a2= 3 a3= 3
       }
       // this program output is a1=1 a2= 3 a3= 3
    }
}
