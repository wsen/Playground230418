package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class NatureBeautiful {

    public static void main(String[] args) {
        String p = "nature*beautiful";
        int vowel = 0;
        int num = 0;
        for (int idx = p.length() - 1, c = 7;
                idx > 0 && p.charAt(idx) != '*';
                idx--) {
            switch (p.charAt(idx)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowel = --c;
            }
            num = idx;
        }
        System.out.println(vowel + ", " + num);
        System.out.println("----------");
        char cA[][] = new char[3][];
        for (int i = 0; i < cA.length; i++) {
            cA[i] = new char[4];
        }
        int[] ia = new int[1];
        System.out.println("---");
        int i;
        int j;
        for (i = 0, j = 0; j < 1; ++j, i++) {
            System.out.println(i + " " + j);
        }
        System.out.println(i + "---" + j);
        
        int a = 5, b = 7, k = 0;
        k = new Integer(a) + new Integer(b); 
        k = new Integer(a) + b;
    }
}
