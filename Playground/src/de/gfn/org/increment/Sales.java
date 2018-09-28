package de.gfn.org.increment;

/**
 *
 * @author wsen
 */
public class Sales {
    public static void main(String[] args) {
        int salesPhone = 1;
//        System.out.println(++salesPhone + ++salesPhone + ++salesPhone); //9
//        System.out.println((salesPhone=salesPhone+1) + (salesPhone=salesPhone+1) + (salesPhone=salesPhone+1));//9
//        System.out.println((salesPhone) + (salesPhone=salesPhone+1
) + (salesPhone=salesPhone+1));//6
        //                  1 + 2 + 3
        System.out.println(salesPhone++ + ++salesPhone + ++salesPhone);
        //                     1        + ((1+1)     +1) + (3 + 1)
        //            note 1 + ((zuw1 + 1) + post1) + (zuw3 + 1) //8
    }
}
