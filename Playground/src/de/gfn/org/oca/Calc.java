package de.gfn.org.oca;

/**
 *
 * @author wsen
 */

class Mid {
    public int findMid(int n1, int n2) {
       return (n1 + n2 )/2;
    }
}

public class Calc extends Mid {
    public static void main(String[] args) {
        int n1 = 22, n2 = 2;
        // hier rein
        //A
        // Calc c = new Mid(); //Mid cannot be converted to Calc
        //Calc c = (Calc)new Mid(); //Compliled zwar, aber dann Exception !
        Calc c = new Calc(); //B
        int n3 = c.findMid(n1, n2);//B
        //C super.findMid(n1, n2); //super nur im Constructor 
        Mid m1 = new Calc(); //D
        int n4 = m1.findMid(n1, n2);
        
        System.out.println(n3);
        System.out.println(n4);
        
        System.out.println("--- Precedence ----");
        int i = 10;
        int j = 20;
        int k = j += i/5; //PRECEDENCE: k = j = j + i/5
        System.out.println(i + " : " + j + " : " + k);//10 : 22 : 22
    } 
}
