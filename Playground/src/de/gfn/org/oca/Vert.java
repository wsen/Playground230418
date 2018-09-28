package de.gfn.org.oca;

/**
 *
 * @author wsen
 */
class Blip {
    protected int blipvert(int x) { return 0; }
}

public class Vert extends Blip {
//A    
    protected long blipvert(long x) { return 0; } //OK overload
//B    private int blipvert(long x) { return 0; } //OK overload
//C    public int blipvert(int x) { return 0; } //OK override
//D    private int blipvert(int x) { return 0; } //less accessible than parent
//E    protected long blipvert(int x) { return 0; } //incompatible return type
//F    protected int blipvert(long x) { return 0; } //OK overload
//G    protected long blipvert(int x, int y) { return 0; } //OK overload
//    public static void main(String[] args) {
//        int[] xx = null;
//        for (int ii : xx) {
//            System.out.println(ii);
//        }
//    }
}
