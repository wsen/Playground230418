package de.gfn.org.packages.a_employee;

/**
 *
 * @author wsen
 */
import de.gfn.org.packages.aquarium.*;

//import de.gfn.org.packages.aquarium.Water;
//import de.gfn.org.packages.aquarium.jellies.*;

//import de.gfn.org.packages.aquarium.*;
//import de.gfn.org.packages.aquarium.jellies.Water;

//import de.gfn.org.packages.aquarium.*;
//import de.gfn.org.packages.aquarium.jellies.*;

//import de.gfn.org.packages.aquarium.Water;
//import de.gfn.org.packages.aquarium.jellies.Water;

public class WaterFiller {
    Water water;
    
    //public static void main(String[] fargs) { //OK traditional main() method signature
    //static public void main(String[] args) {  //OK traditional main() method signature
    //public static void main(String args[]) {  //OK  array operator may appear after the variable name
    //public static void main(String... args) {   //OK vararg
    //public static void main(String args[]) {  //OK
     //private static void main(String[] args) { //OK
     // public static final main(String[] args) {
     public static void main(String[] args) {
        long x = 5;
        long y = (x=3);
        System.out.println(x); // Outputs 3
        System.out.println(y); // Also, outputs 3
    }
}
