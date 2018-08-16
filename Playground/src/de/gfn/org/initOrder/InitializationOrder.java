/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.initOrder;

/**
 * boya OCA 204 Chapter 4 ■ Methods and Encapsulation
 *
 * @author student
 */
public class InitializationOrder {

    private String name = "Torchie"; //5

    {
        System.out.println(name);  //6 -> "Torchie"
    }
    private static int COUNT = 0;  //2

    static {
        System.out.println(COUNT); //3 -> "0"
    }
//!!!! Now that the statics are out of the way, the main() method can run.
    {
        COUNT++;
        System.out.println(COUNT); //6 -> 1
    }

    public InitializationOrder() {
        System.out.println("constructor"); //7 -> "constructor"
    }

    public static void main(String[] args) {
        System.out.println("read to construct"); //4 -> "read to construct"
        new InitializationOrder();  //1
    }
}

/*
run-single:
0
read to construct
Torchie
1
constructor
*/
