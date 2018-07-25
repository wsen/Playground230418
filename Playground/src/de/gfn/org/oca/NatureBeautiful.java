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
        for(int idx = p.length() -1, c=7;
                idx > 0 && p.charAt(idx) != '*';
                idx--) {
            switch (p.charAt(idx)) {
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' : vowel = --c;
            }
            num = idx;
        }
        System.out.println(vowel + ", " + num);
    }
}
