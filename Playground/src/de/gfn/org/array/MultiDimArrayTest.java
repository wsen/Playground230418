package de.gfn.org.array;

/**
 *
 * @author student
 */
public class MultiDimArrayTest {

    public static void main(String[] args) {
        int[][] array = {{0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 6}, {0, 11, 2, 3, 4}};
        int[] arr1 = array[4];
        System.out.println(arr1[3]); //4
        System.out.println(array[4][1]); //1

        double daaa[][][] = new double[3][][];
        double d = 100.0;
        double[][] daa = new double[1][1];

        for (int line = 0; line < daaa.length; line++) {
//            for (int column = 0; column < daaa[line].length; column++) {
//                for (int c = 0; c < daaa[line][column].length; c++) {
//                    System.out.print(daaa[line][column][c]);
//                    System.out.print(daaa[line][c]);
//                }
//                System.out.println();
//            }
            System.out.println();
        }

        /*
        for (int line = 0; line < letter.length; line++) {
            for (int column = 0; column < letter[line].length; column++) {
                System.out.print(letter[line][column]);
            }
            System.out.println();
        }
        
        */
        // daaa[0] = d; //incompatible types double double[][]
        daaa[0] = daa; //OK
        //daaa[0] = daa[0]; //incompatible types double[] double[][]
        //daa[1][1] = d; //daa[1][1] will cause an ArrayIndexOutOfBoundsException because daa's length is only 1 and the indexing starts from 0
        daa = daaa[0];
    }
}
