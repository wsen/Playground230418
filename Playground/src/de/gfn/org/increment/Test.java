package de.gfn.org.increment;

/**
 *
 * @author wsen
 */
public class Test{
    public static int testInts(Integer obj, int var){
        System.out.println("obj vor: " + obj); //5
        obj = var++;
        return obj++;
//        return ++obj;
    }
    
    public static void main(String[] args) {
        Integer val1 = new Integer(5);
//        int val1 = 5; //primitive
        int val2 = 9;
        Integer val3 = testInts(val1++, ++val2); //val1=5 an testInt übergeben, increment val1
        System.out.println(val1+" "+val2+" val3 " + val3);
    }
}
