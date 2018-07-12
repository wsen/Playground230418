package de.gfn.org.forwhile;

/**
 *
 * @author wsen
 */
public class ForWhileTest {
    public static void main(String[] args) {
        String[] dataList = {"x", "y", "z"};
        for (String dataElement : dataList) {
            int innerCounter = 0;
            while (innerCounter < dataList.length) {
                System.out.println(dataElement + ", " + innerCounter);
                innerCounter++;
            }

        }
    }
}
