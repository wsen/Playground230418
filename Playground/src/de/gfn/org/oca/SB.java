package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
public class SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tele");
        sb.append("vision");
        sb.insert(3, "-");
        System.out.println(sb);
    }
}
