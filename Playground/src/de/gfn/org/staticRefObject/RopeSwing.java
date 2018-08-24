package de.gfn.org.staticRefObject;

/**
 *
 * @author wsen
 */
//import rope.*;
//import static rope.Rope.*;
public class RopeSwing {
    private static Rope rope1 = new Rope(); //1  
    private static Rope rope2 = new Rope(); //4

    {
        System.out.println("init: " + rope1.length);
        Rope.heigth = 23;
    }

    public static void main(String[] args) {
        System.out.println("main Start"); //7
        rope1.length = 2;  //8
        rope2.length = 8;  //9
        //Rope.heigth = 54;
        System.out.println("main: " + rope1.length + " heigth: " + Rope.heigth); //10
    }
}

//package rope;
class Rope {
    {
        System.out.println("Rope Start"); //2 //5
    }
    public static int length = 0;  //3 //6
    public static int heigth = 0;  //3.1 //6.1
}

/*


*/