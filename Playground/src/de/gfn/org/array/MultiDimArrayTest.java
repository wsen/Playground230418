package de.gfn.org.array;

/**
 *
 * @author student
 */
public class MultiDimArrayTest {
    
    public static void main(String[] args) {
        int [] [] array = {{0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3, 4}};
        int[] arr1 = array[4];
        System.out.println (arr1[4]);
        System.out.println (array[4][1]);

        
    }
}
