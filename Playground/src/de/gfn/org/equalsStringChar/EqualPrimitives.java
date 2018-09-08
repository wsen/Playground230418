package de.gfn.org.equalsStringChar;

/**
 *
 * @author wsen
 */
public class EqualPrimitives {
    
//    public boolean equals( obj) {
//        if (obj instanceof Integer) {
//            return value == ((Integer)obj).intValue();
//        }
//        return false;
//    }
    
    public static void main(String[] args) {
        Integer i1 = 1; 
        Integer i2 = new Integer(1);
        int i3 = 1;
        Byte b1 = 1;
        Long g1 = 1L;
        
        System.out.println(i1 == i2);
        System.out.println(i1 == i3);
        System.out.println("i1 == b1");
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(g1));
        System.out.println(i1.equals(b1));

        Integer condition = new Integer("1");
        //Integer condition = new Integer(1);
        condition = condition + 1;
        System.out.println("condition: " + condition);
        
        //char cA[3][2] = new char[][] {  { 'a', 'b', 'c' },   { 'a', 'b', 'c' }   };
        //char[][] cA = { "1234", "1234",  "1234"  };
    }
}
