package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class BvarCount {
    static boolean bVar;
    
    static byte brick = 127;
    static int MAX_COUNT = 12000;
    void listBuilding(){}
    static void displayBuilding(){}
    public static void main(String[] args) {
        System.out.println("brick is " + brick);
        boolean bVar1 = true;
        int count = 8;
        System.out.println("bVar: " + bVar);
        do {
            System.out.println("Hello java! " + count);
            if (count >=7) {
                bVar1 = false;
            }
            count -= 2;
        } while (bVar != bVar1 && count > 4);
    }
}
